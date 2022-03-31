/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.dal;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 29 mars 2022
 * @version eniEncheres- V0.1
 * @since  29 mars 2022 - 15:42:13
 *
 */
public class DAOFact {
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOMock();
	}

	public static CategorieDAO getCategorieDAO() {
		return new CategorieDAOMock();
	}
	
}
