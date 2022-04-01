package fr.eni.ecole.projet.eniEncheres.dal.enchere;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Enchere;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.util.ConnectionProvider;

public class EncheresDAOImpl {

	private final String SELECT = "SELECT noEnchere, dateEnchere, montantEnchere, noArticle, noUtilisateur FROM enchere";
	private final String INSERT = "INSERT montantEnchere FROM enchere";
	private final String SELECTBYID = "SELECT ... FROM enchere WHERE noEnchere = ?";
	
	public void insert(Enchere enchere) throws DALException {
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(3, enchere.getMontantEnchere());
			int nb = stmt.executeUpdate();
			if(nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					enchere.setNoEnchere(rs.getInt(1));
				}
			}
		} catch (SQLException e) {
		}
	}

	public List<Enchere> selectAll() throws DALException {
		List<Enchere> result = new ArrayList<Enchere>();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Date dateEnchere = rs.getDate("dateEnchere");
				Enchere enchere = new Enchere(rs.getInt("noEnchere"), dateEnchere.toLocalDate());
				enchere.setNoEnchere(rs.getInt("noEnchere"));
				result.add(enchere);
			}
		} catch (SQLException e) {
			throw new DALException("Problème de select all !");
		}
		return result;
	}

	public Enchere selectById(Integer id) throws DALException {
		Enchere enchere = new Enchere();
		try (Connection con = ConnectionProvider.getConnection()) {
		PreparedStatement stmt = con.prepareStatement(SELECTBYID);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			if(rs.getInt("no_article") == id) {
				
			}
		}
			
		} catch (Exception e) {
			throw new DALException("Problème de Select by Id");
		}
		
		return enchere;
	}
	
}
