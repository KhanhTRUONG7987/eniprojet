/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.dal.utilisateur;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

/**
 * Classe en charge de
 * 
 * @author tjolly2022
 * @date 29 mars 2022
 * @version eniEncheres- V0.1
 * @since 29 mars 2022 - 13:40:15
 *
 */
public interface UtilisateurDAO {

	public boolean authenticate(String email, String motDePasse) throws DALException;

	public void insertUtilisateur(Utilisateur utilisateur) throws DALException;

	public void truncateTableUtilisateur(Utilisateur utilisateur) throws DALException;

	public List<Utilisateur> findAll() throws DALException;
	
	public Utilisateur getUtilisateurByID(Integer noUtilisateur) throws DALException;

	public Utilisateur getUtilisateurByPseudo(String pseudo) throws DALException;

	public void updateUtilisateur(Utilisateur utilisateur) throws DALException;

	public void deleteUtilisateur(Integer noUtilisateur) throws DALException;


}
