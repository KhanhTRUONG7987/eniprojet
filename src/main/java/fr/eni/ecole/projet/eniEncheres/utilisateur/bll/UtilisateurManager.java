/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.utilisateur.bll;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 29 mars 2022
 * @version eniEncheres- V0.1
 * @since  29 mars 2022 - 15:56:57
 *
 */
public interface UtilisateurManager {
	public void addUtilisateur (Utilisateur utilisateur) throws BLLException;
	public boolean authenticate (String email, String motDePasse);
	public List<Utilisateur> getAllUtilisateurs() throws BLLException;
	public Utilisateur getUtilisateurByPseudo(String pseudo) throws BLLException;
	public void updateUtilisateur (Utilisateur utilisateur) throws BLLException;
	public void deleteUtilisateur (Integer noUtilisateur) throws BLLException;
	/**
	 * Méthode en charge de 
	 * @param pseudo
	 * @return
	 */
	
	
}
