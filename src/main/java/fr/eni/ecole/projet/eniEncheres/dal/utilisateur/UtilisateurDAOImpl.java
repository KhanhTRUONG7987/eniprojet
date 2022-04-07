/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.dal.utilisateur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.util.ConnectionProvider;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 30 mars 2022
 * @version eniEncheres- V0.1
 * @since  30 mars 2022 - 12:07:15
 *
 */
public class UtilisateurDAOImpl implements UtilisateurDAO {
	private static final String AUTHENTICATE = "SELECT * FROM UTILISATEURS WHERE email=? and mot_de_passe=?";
	private static final String INSERT = "INSERT INTO UTILISATEURS (pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String TRUNCATE = "TRUNCATE TABLE UTILISATEURS";
	private static final String FIND_ALL = "SELECT * FROM UTILISATEURS ORDER BY no_utilisateur";
	private static final String FIND_BY_PSEUDO = "SELECT * FROM UTILISATEURS WHERE pseudo =?";
	private static final String FIND_BY_ID = "SELECT * FROM UTILISATEURS WHERE no_utilisateur = ?";
	private static final String UPDATE = "UPDATE UTILISATEURS SET pseudo=?, nom=?, prenom=?, email=?, telephone=?, rue=?, code_postal=?, ville=?, mot_de_passe=?, credit=?, administrateur=?";
	private static final String DELETE = "DELETE FROM UTILISATEURS WHERE no_utilisateur=?";
	
	
	/**
	*{@inheritedDoc}
	 * @throws DALException 
	*/
	@Override
	public boolean authenticate(String email, String motDePasse) throws DALException {
		Boolean result = false; //set result to false
		try (Connection con = ConnectionProvider.getConnection()){
			
			PreparedStatement stmt = con.prepareStatement(AUTHENTICATE, Statement.RETURN_GENERATED_KEYS);//return primary key
			stmt.setString(1, email); //set 1e WHERE to email
			stmt.setString(2, motDePasse); // set 2e WHERE to motDePasse
			
			ResultSet rs = stmt.executeQuery();
			
			//controller s'il y a des données qui...
			if(!rs.next() && rs.getRow() == 0) {
				result = false; //s'il n'y a pas de resultat => false
				System.out.println("Utilisateur infos sont incorrects");
			}else {
				result = true; // s'il y a un resultat => true
				System.out.println("Logged in");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException("Problème de login");
		}
		return result;
		
	}

	/**
	*{@inheritedDoc}
	 * @throws DALException 
	*/
	@Override
	public void insertUtilisateur(Utilisateur utilisateur) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, utilisateur.getPseudo());
			stmt.setString(2, utilisateur.getNom());
			stmt.setString(3, utilisateur.getPrenom());
			stmt.setString(4, utilisateur.getEmail());
			stmt.setString(5, utilisateur.getTelephone());
			stmt.setString(6, utilisateur.getRue());
			stmt.setString(7, utilisateur.getCodePostal());
			stmt.setString(8, utilisateur.getVille());
			stmt.setString(9, utilisateur.getMotDePasse());
			stmt.setString(10, utilisateur.getConfirmation());
			stmt.setInt(11, utilisateur.getCredit());
			stmt.setBoolean(12, utilisateur.getAdministrateur());
			
			int nb = stmt.executeUpdate();
			if (nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt(1));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException("Problème d'inserer");
		}

	}

	/**
	*{@inheritedDoc}
	 * @throws DALException 
	*/
	@Override
	public void truncateTableUtilisateur(Utilisateur utilisateur) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(TRUNCATE, Statement.RETURN_GENERATED_KEYS);
			stmt.executeUpdate(TRUNCATE);
			
			System.out.println("BD d'utilisateurs sont truncatés");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException("Problème de truncater");
		}

	}

	/**
	*{@inheritedDoc}
	 * @throws DALException 
	*/
	@Override
	public List<Utilisateur> findAll() throws DALException {
		List<Utilisateur> lstUtilisateurs = new ArrayList<Utilisateur>();
		
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(FIND_ALL, Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNoUtilisateur(rs.getInt("noUtilisateur"));
				utilisateur.setPseudo(rs.getString("pseudo"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setTelephone(rs.getString("telephone"));
				utilisateur.setRue(rs.getString("rue"));
				utilisateur.setCodePostal(rs.getString("codePostal"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setMotDePasse(rs.getString("motDePasse"));
				utilisateur.setCredit(rs.getInt("credit"));
				utilisateur.setAdministrateur(rs.getBoolean("administrateur"));
			
			System.out.println(utilisateur.toString());
			lstUtilisateurs.add(utilisateur);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException("Probl�me de select");
		}
		return lstUtilisateurs               ;
	}
	
	/**
	*{@inheritedDoc}
	 * @throws DALException 
	*/
	@Override
	public Utilisateur getUtilisateurByID(Integer noUtilisateur) throws DALException {
		Utilisateur utilisateur = new Utilisateur();
		
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(FIND_BY_ID, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, noUtilisateur); //set 1st WHERE to int
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				utilisateur.setNoUtilisateur(rs.getInt("no_utilisateur"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setTelephone(rs.getString("telephone"));
				utilisateur.setRue(rs.getString("rue"));
				utilisateur.setCodePostal(rs.getString("code_postal"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
				utilisateur.setCredit(rs.getInt("credit"));
				utilisateur.setAdministrateur(rs.getBoolean("administrateur"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException("Problème de selecter by ID");
		}
		return utilisateur;
	}
	
	/**
	*{@inheritedDoc}
	 * @throws DALException 
	*/
	@Override
	public Utilisateur getUtilisateurByPseudo(String pseudo) throws DALException {
		
		Utilisateur utilisateur = new Utilisateur();
		
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(FIND_BY_PSEUDO, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, pseudo); //set 1st WHERE to String
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				utilisateur.setPseudo(rs.getString("pseudo"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setTelephone(rs.getString("telephone"));
				utilisateur.setRue(rs.getString("rue"));
				utilisateur.setCodePostal(rs.getString("code_postal"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
				utilisateur.setCredit(rs.getInt("credit"));
				utilisateur.setAdministrateur(rs.getBoolean("administrateur"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException("Problème de selecter by pseudo");
		}
		return utilisateur;
	}

	/**
	*{@inheritedDoc}
	 * @throws DALException 
	*/
	@Override
	public void updateUtilisateur(Utilisateur utilisateur) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(UPDATE, Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, utilisateur.getPseudo());
			stmt.setString(2, utilisateur.getNom());
			stmt.setString(3, utilisateur.getPrenom());
			stmt.setString(4, utilisateur.getEmail());
			stmt.setString(5, utilisateur.getTelephone());
			stmt.setString(6, utilisateur.getRue());
			stmt.setString(7, utilisateur.getCodePostal());
			stmt.setString(8, utilisateur.getVille());
			stmt.setString(9, utilisateur.getMotDePasse());
			stmt.setString(10, utilisateur.getConfirmation());
			stmt.setInt(11, utilisateur.getCredit());
			stmt.setBoolean(12, utilisateur.getAdministrateur());
			
			System.out.println("Utilisateur avec noId " + utilisateur.getNoUtilisateur() + "est mis à jour");
		
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException("Problème de mise à jour");
		}
		

	}

	/**
	*{@inheritedDoc}
	 * @throws DALException 
	*/
	@Override
	public void deleteUtilisateur(Integer noUtilisateur) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(DELETE, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, noUtilisateur);
			
			System.out.println("Utilisateur avec noId " + noUtilisateur + "est supprimé");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException("Problème de supprimer");
		}
	}

}
