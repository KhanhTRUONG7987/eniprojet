/**
 * 
 */

package fr.eni.ecole.projet.eniEncheres.bll.utilisateur;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 29 mars 2022
 * @version eniEncheres- V0.1
 * @since  29 mars 2022 - 16:59:17
 *
 */
public class UtilisateurManagerSing {
	private static UtilisateurManager instance;
	public static UtilisateurManager getInstance() {
		if(instance==null) {
			instance = new UtilisateurManagerImpl();
		}
		return instance;
	}
}
