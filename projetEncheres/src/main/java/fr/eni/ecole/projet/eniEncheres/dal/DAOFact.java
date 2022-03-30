package fr.eni.ecole.projet.eniEncheres.dal;

import fr.eni.ecole.projet.eniEncheres.dal.ArticleVenduDAO;
import fr.eni.ecole.projet.eniEncheres.dal.ArticleVenduDAOImpl;
import fr.eni.ecole.projet.eniEncheres.dal.CategorieDAO;
import fr.eni.ecole.projet.eniEncheres.dal.CategorieDAOImpl;
import fr.eni.ecole.projet.eniEncheres.dal.EnchereDAO;
import fr.eni.ecole.projet.eniEncheres.dal.EnchereDAOImpl;
import fr.eni.ecole.projet.eniEncheres.dal.RetraitDAO;
import fr.eni.ecole.projet.eniEncheres.dal.RetraitDAOImpl;
import fr.eni.ecole.projet.eniEncheres.dal.UtilisateurDAO;
import fr.eni.ecole.projet.eniEncheres.dal.UtilisateurDAOImpl;

public class DAOFact {
	
	public static ArticleVenduDAO getArticleVenduDAO() {
		return new ArticleVenduDAOImpl();
	}
	
	public static CategorieDAO getCategorieDAO() {
		return new CategorieDAOImpl();
	}
	
	public static EnchereDAO getEnchereDAO() {
		return new EnchereDAOImpl();
	}
	
	public static RetraitDAO getRetraitDAO() {
		return new RetraitDAOImpl();
	}

	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOImpl();
	}
	
}
