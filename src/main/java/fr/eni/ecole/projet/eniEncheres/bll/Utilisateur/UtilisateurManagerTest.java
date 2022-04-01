/**
 * 
 */

package fr.eni.ecole.projet.eniEncheres.bll.utilisateur;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 30 mars 2022
 * @version eniEncheres- V0.1
 * @since  30 mars 2022 - 09:17:09
 *
 */
public class UtilisateurManagerTest {

	/**
	 * Méthode en charge de 
	 * @param args
	 */
	private static UtilisateurManager manager = UtilisateurManagerSing.getInstance();
	public static void main(String[] args) {
		try {
			manager.addUtilisateur(new Utilisateur(0, "abbyTruong", "TRUONG", "Khanh", "abby79truong@gmail.com", "0781705292", "Puits Mauger", "35000", "Rennes", "iLoveYou123", 500, false));
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			manager.addUtilisateur(new Utilisateur(1, "leaBleu", "DUBOIS", "Lea", "leaDUBOIS@gmail.com", "0871705592", "de Nantes", "21000", "Redon", "iNeedYou123", 500, false));
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			manager.addUtilisateur(new Utilisateur(2, "jeremySan", "San", "Jeremy", "jeremySan@gmail.com", "0187705123", "du Boire", "44000", "Nantes", "iMissYou123", 500, false));
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			manager.getAllUtilisateurs().forEach(System.out::println);
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

}
