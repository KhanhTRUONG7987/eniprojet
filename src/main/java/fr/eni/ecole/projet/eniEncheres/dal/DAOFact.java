/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.dal;

import fr.eni.ecole.projet.eniEncheres.dal.article.ArticleVenduDAO;
import fr.eni.ecole.projet.eniEncheres.dal.article.ArticleVenduDAOImpl;
import fr.eni.ecole.projet.eniEncheres.dal.article.ArticleVenduDAOMock;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAO;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAOImpl;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAOMock;
import fr.eni.ecole.projet.eniEncheres.dal.enchere.EnchereDAO;
import fr.eni.ecole.projet.eniEncheres.dal.enchere.EnchereDAOImpl;
import fr.eni.ecole.projet.eniEncheres.dal.enchere.EnchereDAOMock;
import fr.eni.ecole.projet.eniEncheres.dal.retrait.RetraitDAO;
import fr.eni.ecole.projet.eniEncheres.dal.retrait.RetraitDAOImpl;
import fr.eni.ecole.projet.eniEncheres.dal.retrait.RetraitDAOMock;
import fr.eni.ecole.projet.eniEncheres.dal.utilisateur.UtilisateurDAO;
import fr.eni.ecole.projet.eniEncheres.dal.utilisateur.UtilisateurDAOImpl;
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
		return new UtilisateurDAOImpl();
	}

	public static CategorieDAO getCategorieDAO() {
		return new CategorieDAOImpl();
	}
	
	public static EnchereDAO getEnchereDAO() {
		return new EnchereDAOImpl();
	}
	
	public static ArticleVenduDAO getArticleVenduDAO() {
		return new ArticleVenduDAOImpl();
	}
	
	public static RetraitDAO getRetraitDAO() {
		return new RetraitDAOImpl();
	}
	
	
}
