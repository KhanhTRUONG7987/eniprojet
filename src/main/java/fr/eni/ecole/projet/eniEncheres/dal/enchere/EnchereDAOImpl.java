package fr.eni.ecole.projet.eniEncheres.dal.enchere;

import java.sql.Connection;

import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Enchere;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.util.ConnectionProvider;

public class EnchereDAOImpl implements EnchereDAO {

	private final String SELECT = "SELECT * FROM encheres ORDER BY no_enchere";
	private final String INSERT = "INSERT montantEnchere FROM encheres";
	private final String SELECTBYID = "SELECT * FROM encheres WHERE no_enchere = ?";
	private final String UPDATE = "UPDATE encheres SET date_enchere = ?, montant_enchere = ? WHERE no_enchere =?";
	private final String DELETE = "DELETE * from ENCHERES WHERE no_enchere=?";
	
	public void insert(Enchere enchere) throws DALException {
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setTimestamp(2, Timestamp.valueOf(enchere.getDateEnchere()));
			stmt.setInt(3, enchere.getMontantEnchere());
			stmt.setInt(4, enchere.getNoArticle());
			stmt.setInt(5, enchere.getNoUtilisateur());
			
			int nb = stmt.executeUpdate();
			if(nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					enchere.setNoEnchere(rs.getInt(1));
				}
			}
		} catch (SQLException e) {
			throw new DALException("Problème dans la fonction INSERT");
		}
	}

	public List<Enchere> selectAll() throws DALException {
		List<Enchere> result = new ArrayList<Enchere>();
		
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			Enchere enchere = new Enchere();
			
			while(rs.next()) {
				Timestamp dateEnchere = rs.getTimestamp("date_enchere");				
				
				enchere.setNoEnchere(rs.getInt("no_enchere"));
				enchere.setDateEnchere(dateEnchere.toLocalDateTime());
				enchere.setMontantEnchere(rs.getInt("montant_enchere"));
				enchere.setNoArticle(rs.getInt("no_article"));
				enchere.setNoUtilisateur(rs.getInt("no_utilisateur"));
				
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
		
		while (rs.next()) {
			Timestamp dateEnchere = rs.getTimestamp("date_enchere");	
			
			enchere.setNoEnchere(rs.getInt("no_enchere"));
			enchere.setDateEnchere(dateEnchere.toLocalDateTime());
			enchere.setMontantEnchere(rs.getInt("montant_enchere"));
			enchere.setNoArticle(rs.getInt("no_article"));
			enchere.setNoUtilisateur(rs.getInt("no_utilisateur"));			

		}
			
		} catch (SQLException e) {
			throw new DALException("Problème de Select by Id");
		}
		
		return enchere;
	}
	
	public void update(Enchere enchere) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(UPDATE);
			
			stmt.setTimestamp(2, Timestamp.valueOf(enchere.getDateEnchere()));
			stmt.setInt(3, enchere.getMontantEnchere());
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			throw new DALException("Erreur dans la fonction Update enchère");
		}
	}

	@Override
	public void delete(Enchere enchere) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(DELETE);
			stmt.setInt(1, enchere.getNoEnchere());

			stmt.execute();

		} catch (SQLException e) {
			throw new DALException("Problème dans la fonction DELETE ENCHERE");
		}		
	}
	
}
