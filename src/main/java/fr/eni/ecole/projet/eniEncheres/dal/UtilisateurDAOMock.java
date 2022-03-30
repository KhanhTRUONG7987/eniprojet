/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 29 mars 2022
 * @version eniEncheres- V0.1
 * @since  29 mars 2022 - 14:46:38
 *
 */
public class UtilisateurDAOMock implements UtilisateurDAO {
	private static Integer cpt=0;
	private List<Utilisateur> lstUtilisateurs = new ArrayList<Utilisateur>();
	
	/**
	*{@inheritedDoc}
	*/
	@Override
	public boolean authenticate(String email, String motDePasse) {
		Boolean result = false;
		return result;
	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public void insertUtilisateur(Utilisateur utilisateur) {
		utilisateur.setNoUtilisateur(cpt++);
		lstUtilisateurs.add(utilisateur);

	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public void truncateTableUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public List<Utilisateur> findAll() {
		return lstUtilisateurs;
	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public Utilisateur getUtilisateurByID(Integer noUtilisateur) {
		Utilisateur utilisateur = new Utilisateur();
		return utilisateur;
	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public void updateUtilisateur(Utilisateur utilisateur) {
		lstUtilisateurs.add(utilisateur);
	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public void deleteUtilisateur(Integer noUtilisateur) {
		lstUtilisateurs.remove(noUtilisateur);

	}
	/**
	*{@inheritedDoc}
	*/
	@Override
	public Utilisateur getUtilisateurByPseudo(String pseudo) {
		Utilisateur utilisateur = new Utilisateur();
		return utilisateur;
	}

	


}
