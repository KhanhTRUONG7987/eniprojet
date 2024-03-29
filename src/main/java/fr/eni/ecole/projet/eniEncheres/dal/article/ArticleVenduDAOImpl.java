
package fr.eni.ecole.projet.eniEncheres.dal.article;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAO;
import fr.eni.ecole.projet.eniEncheres.dal.util.ConnectionProvider;
import fr.eni.ecole.projet.eniEncheres.dal.utilisateur.UtilisateurDAO;

public class ArticleVenduDAOImpl implements ArticleVenduDAO {

	private final String INSERT = "INSERT INTO ARTICLES_VENDUS (nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, no_utilisateur, no_categorie) VALUES (?, ?, ?, ?, ? ,?, ?)";
	private final String UPDATE = "UPDATE ARTICLES_VENDUS SET nom_article=?, description=?, date_debut_encheres=?, date_fin_encheres=?, prix_initial=?, no_categorie=? WHERE no_article=?";
	private final String DELETE = "DELETE * from ARTICLES_VENDUS WHERE no_article=?";
	private final String SELECT_BY_ID = "SELECT * from ARTICLES_VENDUS WHERE no_article=?";
	private final String SELECT_ALL = "SELECT * from ARTICLES_VENDUS";

	@Override
	public void insertArticle(ArticleVendu article) throws DALException {
		
		try (Connection con = ConnectionProvider.getConnection()) {
			
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, article.getNomArticle());
			stmt.setString(2, article.getDescription());
			stmt.setDate(3, Date.valueOf(article.getDateDebutEncheres()));
			stmt.setDate(4, Date.valueOf(article.getDateFinEncheres()));
			stmt.setInt(5, article.getMiseAPrix());
			stmt.setInt(6, article.getUtilisateur().getNoUtilisateur());
			stmt.setInt(7, article.getCategorie().getNoCategorie());

			int nb = stmt.executeUpdate();
			System.out.println(article);
			if (nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next()) {
					article.setNoArticle(rs.getInt(1));
				}
			}

		} catch (SQLException e) {
			throw new DALException("Probl�me dans la fonction INSERT ARTICLE "+e.getMessage());
		}
	}

	@Override
	public void update(ArticleVendu article) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(UPDATE);
			stmt.setString(1, article.getNomArticle());
			stmt.setString(2, article.getDescription());
			stmt.setDate(3, Date.valueOf(article.getDateDebutEncheres()));
			stmt.setDate(4, Date.valueOf(article.getDateFinEncheres()));
			stmt.setInt(5, article.getMiseAPrix());
			stmt.setInt(6, article.getCategorie().getNoCategorie());
			stmt.setInt(7, article.getNoArticle());

			stmt.executeUpdate();

		} catch (SQLException e) {
			throw new DALException("Probl�me dans la fonction UPDATE ARTICLE" + e.getMessage());
		}

	}

	@Override
	public void deleteVente(ArticleVendu article) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(DELETE);
			stmt.setInt(1, article.getNoArticle());

			stmt.execute();

		} catch (SQLException e) {
			throw new DALException("Probl�me dans la fonction DELETE ARTICLE" + e.getMessage());
		}

	}

	@Override
	public ArticleVendu selectById(Integer no_article) throws DALException {
		ArticleVendu article = new ArticleVendu();
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT_BY_ID, Statement.NO_GENERATED_KEYS);
			stmt.setInt(1, no_article);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Date dateDebutEncheres = rs.getDate("date_debut_encheres");
				Date dateFinEncheres = rs.getDate("date_fin_encheres");
				Integer noUtilisateur = rs.getInt("no_utilisateur");
				UtilisateurDAO dao = DAOFact.getUtilisateurDAO();
				Utilisateur user = dao.getUtilisateurByID(noUtilisateur);
				
				Integer noCategorie = rs.getInt("no_categorie");
				CategorieDAO daoCat = DAOFact.getCategorieDAO();
				Categorie categorie = daoCat.selectById(noCategorie);

				article.setNoArticle(rs.getInt("no_article"));
				article.setNomArticle(rs.getString("nom_article"));
				article.setDescription(rs.getString("description"));
				article.setDateDebutEncheres(dateDebutEncheres.toLocalDate());
				article.setDateFinEncheres(dateFinEncheres.toLocalDate());
				article.setMiseAPrix(rs.getInt("prix_initial"));
				article.setPrixVente(rs.getInt("prix_vente"));
				article.setUtilisateur(user);
				article.setCategorie(categorie);
			}

		} catch (SQLException e) {
			throw new DALException("Probl�me dans la fonction SELECT_BY_ID ARTICLE" + e.getMessage());
			
		}
		return article;
	}

	@Override
	public List<ArticleVendu> selectAllArticles() throws DALException {
		List<ArticleVendu> lstArticleVendus = new ArrayList<ArticleVendu>();
		lstArticleVendus.clear();
		
		try (Connection con = ConnectionProvider.getConnection()) 
<<<<<<< HEAD
		{PreparedStatement stmt = con.prepareStatement(SELECT_ALL, Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = stmt.executeQuery();
		
		ArticleVendu article = new ArticleVendu();
		
=======
		{PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
		ResultSet rs = stmt.executeQuery();
				
>>>>>>> 269ef3b14a5af8feef620dec6ae9f7f4b595a3e5
			while (rs.next()) {
				ArticleVendu article = new ArticleVendu();
				Date dateDebutEncheres = rs.getDate("date_debut_encheres");
				Date dateFinEncheres = rs.getDate("date_fin_encheres");
				
				Integer noUtilisateur = rs.getInt("no_utilisateur");
				UtilisateurDAO dao = DAOFact.getUtilisateurDAO();
				Utilisateur user = dao.getUtilisateurByID(noUtilisateur);
				
				Integer noCategorie = rs.getInt("no_categorie");
				CategorieDAO daoCat = DAOFact.getCategorieDAO();
				Categorie categorie = daoCat.selectById(noCategorie);
				
				article.setNoArticle(rs.getInt("no_article"));
				article.setNomArticle(rs.getString("nom_article"));
				article.setDescription(rs.getString("description"));
				article.setDateDebutEncheres(dateDebutEncheres.toLocalDate());
				article.setDateFinEncheres(dateFinEncheres.toLocalDate());
				article.setMiseAPrix(rs.getInt("prix_initial"));
				article.setPrixVente(rs.getInt("prix_vente"));
				article.setUtilisateur(user);
				article.setCategorie(categorie);
			
			lstArticleVendus.add(article);
			System.out.println(lstArticleVendus.toString());

			}
			for (ArticleVendu articleVendu : lstArticleVendus) {
				System.out.println(articleVendu.toString());
			}
		} catch (SQLException e) {
			throw new DALException("Probl�me dans la fonction SELECT_ALL ARTICLE" + e.getMessage());
		}		
		return lstArticleVendus;
	}
}
