/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.dal.utilisateur;

import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 29 mars 2022
 * @version eniEncheres- V0.1
 * @since  29 mars 2022 - 15:45:48
 *
 */
public class UtilisateurDAOTest {

	/**
	 * Méthode en charge de 
	 * @param args
	 */
	
	public static UtilisateurDAO dao = DAOFact.getUtilisateurDAO();
	
	public static void main(String[] args) {
		try {
			dao.insertUtilisateur(new Utilisateur(0, "abbyTruong", "TRUONG", "Khanh", "abby79truong@gmail.com", "0781705292", "Puits Mauger", "35000", "Rennes", "iLoveYou123", 500, false));
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dao.insertUtilisateur(new Utilisateur(0, "leaBleu", "DUBOIS", "Lea", "leaDUBOIS@gmail.com", "0871705592", "de Nantes", "21000", "Redon", "iNeedYou123", 500, false));
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dao.insertUtilisateur(new Utilisateur(0, "jeremySan", "San", "Jeremy", "jeremySan@gmail.com", "0187705123", "du Boire", "44000", "Nantes", "iMissYou123", 500, false));
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			dao.findAll().forEach(System.out::println);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
