/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.dal;

import fr.eni.ecole.projet.eniEncheres.dal.article.ArticleVenduDAO;
import fr.eni.ecole.projet.eniEncheres.dal.article.ArticleVenduDAOMock;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAO;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAOMock;
import fr.eni.ecole.projet.eniEncheres.dal.enchere.EnchereDAO;
import fr.eni.ecole.projet.eniEncheres.dal.utilisateur.UtilisateurDAO;
import fr.eni.ecole.projet.eniEncheres.dal.utilisateur.UtilisateurDAOMock;

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
	
	public static EnchereDAO getEnchereDAO() {
		return new EnchereDAOMock();
	}
	
	public static ArticleVenduDAO getArticleVenduDAO() {
		return new ArticleVenduDAOMock();
	}
	
	public static RetraitDAO getRetraitDAO() {
		return new RetraitDAOMock();
	}
	
	
}
