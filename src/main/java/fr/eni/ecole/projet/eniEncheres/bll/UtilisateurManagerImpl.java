/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.bll;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;
import fr.eni.ecole.projet.eniEncheres.dal.UtilisateurDAO;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 29 mars 2022
 * @version eniEncheres- V0.1
 * @since  29 mars 2022 - 16:05:48
 *
 */
public class UtilisateurManagerImpl implements UtilisateurManager {

	/**
	*{@inheritedDoc}
	*/
	
	private UtilisateurDAO dao = DAOFact.getUtilisateurDAO();
	
	@Override
	public void addUtilisateur(Utilisateur utilisateur) throws BLLException {
		if(!(utilisateur.getMotDePasse()).equalsIgnoreCase((utilisateur).getConfirmation())) {
			throw new BLLException("Password incorrect !");
		}
		try {
			dao.insertUtilisateur(utilisateur);
		} catch (DALException e) {
			e.printStackTrace();
			throw new BLLException("! Erreur "+e.getMessage());
		}

	}

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
	 * @throws BLLException 
	*/
	@Override
	public List<Utilisateur> getAllUtilisateurs() throws BLLException {
		try {
			return dao.findAll();
		} catch (DALException e) {
			e.printStackTrace();
		}
		throw new BLLException("");
	}

	/**
	*{@inheritedDoc}
	 * @throws BLLException 
	*/
	@Override
	public Utilisateur getUtilisateurByPseudo(String pseudo) throws BLLException {
		try {
			return dao.findAll().stream()
					.filter(x -> pseudo.equals(x.getPseudo()))
					.findAny()
					.orElse(null);
		} catch (DALException e) {
			
			e.printStackTrace();
		}
		throw new BLLException("");
	
	}

	/**
	*{@inheritedDoc}
	 * @throws BLLException 
	*/
	@Override
	public void updateUtilisateur(Utilisateur utilisateur) throws BLLException {
		try {
			dao.updateUtilisateur(utilisateur);
		} catch (DALException e) {
			e.printStackTrace();
		}
		throw new BLLException("");
	}

	/**
	*{@inheritedDoc}
	 * @throws BLLException 
	*/
	@Override
	public void deleteUtilisateur(Integer noUtilisateur) throws BLLException {
		try {
			dao.deleteUtilisateur(noUtilisateur);
		} catch (DALException e) {
			e.printStackTrace();
		}
		throw new BLLException("");

	}

}
