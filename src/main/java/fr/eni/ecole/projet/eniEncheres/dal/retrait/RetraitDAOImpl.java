package fr.eni.ecole.projet.eniEncheres.dal.retrait;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Retrait;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.util.ConnectionProvider;

public class RetraitDAOImpl implements RetraitDAO{
	
	private final String INSERT = "INSERT INTO RETRAITS (no_article, rue, code_postal, ville)";
	private final String UPDATE = "UPDATE RETRAITS SET rue=?, code_postal=?, ville=? WHERE no_article=?";
	private final String DELETE = "DELETE * from RETRAITS WHERE no_article=?";
	
	
	@Override
	public void insertRetrait(Retrait retrait) throws DALException {
		
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(2, retrait.getRue());
			stmt.setString(3, retrait.getCodePostal());
			stmt.setString(4, retrait.getVille());
			
			int nb = stmt.executeUpdate();
			if (nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next()) {
					retrait.setNoArticle(rs.getInt(1));
				}
			}
			
		} catch (SQLException e) {
			throw new DALException("Problème dans la fonction INSERT");
		}
		
	}
	@Override
	public void updateRetrait(Retrait retrait) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(UPDATE);
			stmt.setString(2, retrait.getRue());
			stmt.setString(3, retrait.getCodePostal());
			stmt.setString(4, retrait.getVille());
			stmt.setInt(1, retrait.getNoArticle());
			
			stmt.executeUpdate();
			
			
		} catch (SQLException e) {
			throw new DALException("Problème dans la fonction UPDATE RETRAIT");
		}
		
	}
	@Override
	public void deleteRetrait(Retrait retrait) throws DALException {

		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(DELETE);
			stmt.setInt(1, retrait.getNoArticle());

			stmt.execute();
		} catch (SQLException e) {
			throw new DALException("Problème dans la fonction DELETE ARTICLE");
		}
	}	

}
