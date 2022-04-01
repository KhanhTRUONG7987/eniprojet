package fr.eni.ecole.projet.eniEncheres.dal.categorie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.util.ConnectionProvider;

public class CategorieDAOImpl implements CategorieDAO {
	private final String SELECT = "SELECT noCategorie, libelle FROM categorie";
	private final String INSERT = "INSERT libelle FROM categorie";
	private final String SELECTBYID = "SELECT libelle FROM categorie WHERE noCategorie = ?";
	
	@Override
	public void insert(Categorie categorie) throws DALException {
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(2, categorie.getLibelle());
			int nb = stmt.executeUpdate();
			if(nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					categorie.setNoCategorie(rs.getInt(1));
				}
			}
		} catch (SQLException e) {
		}
	}

	@Override
	public List<Categorie> selectAll() throws DALException {
		List<Categorie> result = new ArrayList<Categorie>();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Categorie categorie = new Categorie(rs.getInt("noCategorie"), rs.getString("Libelle"));
				categorie.setNoCategorie(rs.getInt("noCategorie"));
				result.add(categorie);
			}
		} catch (SQLException e) {
			throw new DALException("Problème de select all !");
		}
		return result;
	}

	@Override
	public Categorie selectById(Integer id) throws DALException {
		Categorie categorie = new Categorie();
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
		
		return categorie;
	}
	
	

}
