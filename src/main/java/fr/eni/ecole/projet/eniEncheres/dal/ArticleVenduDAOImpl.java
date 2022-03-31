package fr.eni.ecole.projet.eniEncheres.dal;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.dal.util.ConnectionProvider;

public class ArticleVenduDAOImpl implements ArticleVenduDAO {
	
	private final String INSERT = "INSERT INTO ARTICLES_VENDUS (nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, no_utilisateur, no_categorie)";
	private final String UPDATE = "UPDATE ARTICLES_VENDUS SET nom_article=?, description=?, date_debut_encheres=?, date_fin_encheres=?, prix_initial=?, no_categorie=? WHERE no_article=?";
	private final String DELETE = "DELETE * from ARTICLES_VENDUS WHERE no_article=?";
	private final String SELECTBYID = "SELECT * from ARTICLES_VENDUS WHERE no_article=?";
	
	@Override
	public void insertArticle(ArticleVendu article) throws DALException {
		try (Connection con = ConnectionProvider.getConnection())
		{PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
				
		stmt.setString(2, article.getNomArticle());
		stmt.setString(3, article.getDescription());
		stmt.setDate(4, Date.valueOf(article.getDateDebutEncheres()));
		stmt.setDate(5, Date.valueOf(article.getDateFinEncheres()));
		stmt.setInt(6, article.getMiseAPrix());
		stmt.setInt(8, article.getUtilisateur().getNoUtilisateur());
		stmt.setInt(9, article.getCategorie().getNoCategorie());	
		
		int nb = stmt.executeUpdate();
		if(nb>0) {
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				article.setNoArticle(rs.getInt(1));
			}
		}
			
		} catch (SQLException e) {
			throw new DALException("Problème dans la fonction INSERT ARTICLE");
		}
	}

	@Override
	public void update(ArticleVendu article) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()) 
		{PreparedStatement stmt = con.prepareStatement(UPDATE);
		stmt.setString(2, article.getNomArticle());
		stmt.setString(3, article.getDescription());
		stmt.setDate(4, Date.valueOf(article.getDateDebutEncheres()));
		stmt.setDate(5, Date.valueOf(article.getDateFinEncheres()));
		stmt.setInt(6, article.getMiseAPrix());
		stmt.setInt(8, article.getUtilisateur().getNoUtilisateur());
		stmt.setInt(9, article.getCategorie().getNoCategorie());	
			stmt.setInt(1, article.getNoArticle());
			
		stmt.executeUpdate();
			
		} catch (SQLException e) {
			throw new DALException("Problème dans la fonction UPDATE ARTICLE");
		}
		
	}

	@Override
	public void deleteVente(ArticleVendu article) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()) 
		{PreparedStatement stmt = con.prepareStatement(DELETE);
		stmt.setInt(1, article.getNoArticle());
		
		stmt.execute();
			
		} catch (SQLException e) {
			throw new DALException("Problème dans la fonction DELETE ARTICLE");
		}
		
	}

	@Override
	public ArticleVendu selectById(Integer id) throws DALException {
		ArticleVendu article = new ArticleVendu();
		try(Connection con = ConnectionProvider.getConnection())  
		{PreparedStatement stmt = con.prepareStatement(SELECTBYID);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			if (rs.getInt("no_article") == id) {
				article= itemBuilder(rs);
			}
		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	private ArticleVendu itemBuilder (ResultSet rs) throws SQLException {
		ArticleVendu article = null;
		Date debut = rs.getDate("date_debut_encheres");
		Date fin = rs.getDate("date_fin_encheres");
		Utilisateur utilisateur = new Utilisateur();
		
		article.setNoArticle(rs.getInt("no_article"));
		article.setNomArticle(rs.getString("nom_article"));
		article.setDescription(rs.getString("description"));	
		article.setDateDebutEncheres(debut.toLocalDate());
		article.setDateFinEncheres(fin.toLocalDate());
		article.setMiseAPrix(rs.getInt("prix_initial"));
		article.setPrixVente(rs.getInt("prix_vente"));
		article.setUtilisateur(utilisateur);
		
		/**nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, no_utilisateur, no_categorie
		conducteur.setNom(rs.getString("nom"));
		if (!rs.getString("prenom").trim().equals("")) {
			conducteur.setPrenom(rs.getString("prenom"));	
		}		
		*/
		return article;
		
	}
	

}
