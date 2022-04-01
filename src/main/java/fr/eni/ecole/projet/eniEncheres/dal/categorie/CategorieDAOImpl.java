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
	private final String SELECT = "SELECT no_categorie, libelle FROM categories";
	private final String INSERT = "INSERT libelle FROM categories";
	private final String SELECTBYID = "SELECT libelle FROM categories WHERE no_categorie = ?";

	@Override
	public void insert(Categorie categorie) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(2, categorie.getLibelle());
			int nb = stmt.executeUpdate();
			if (nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next()) {
					categorie.setNoCategorie(rs.getInt(1));
				}
			}
		} catch (SQLException e) {
			throw new DALException("Problème dans la fonction INSERT");
		}
	}

	@Override
	public List<Categorie> selectAll() throws DALException {
		List<Categorie> result = new ArrayList<Categorie>();
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Categorie categorie = new Categorie(rs.getInt("no_categorie"), rs.getString("libelle"));
				categorie.setNoCategorie(rs.getInt("no_categorie"));
				result.add(categorie);
			}
		} catch (SQLException e) {
			throw new DALException("Problème de select all !");
		}
		return result;
	}

	@Override
	public Categorie selectById(Integer no_categorie) throws DALException {
		Categorie categorie = new Categorie();
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECTBYID);
			stmt.setInt(1, no_categorie);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				categorie.setNoCategorie(rs.getInt("no_categorie"));
				categorie.setLibelle(rs.getString("libelle"));

			}

		} catch (SQLException e) {
			throw new DALException("Problème de Select by Id");
		}

		return categorie;
	}

}
