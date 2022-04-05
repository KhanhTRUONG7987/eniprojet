package fr.eni.ecole.projet.eniEncheres.dal;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.dal.article.ArticleVenduDAO;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAO;
import fr.eni.ecole.projet.eniEncheres.dal.enchere.EnchereDAO;
import fr.eni.ecole.projet.eniEncheres.dal.retrait.RetraitDAO;
import fr.eni.ecole.projet.eniEncheres.dal.utilisateur.UtilisateurDAO;

public class AppliTestDAL {

	private static ArticleVenduDAO daoArticle = DAOFact.getArticleVenduDAO();
	private static CategorieDAO daoCategorie = DAOFact.getCategorieDAO();
	private static EnchereDAO daoEnchere = DAOFact.getEnchereDAO();
	private static RetraitDAO daoRetrait = DAOFact.getRetraitDAO();
	private static UtilisateurDAO daoUser = DAOFact.getUtilisateurDAO();


	public static void main(String[] args) throws DALException {
		daoArticle.insert(new ArticleVendu(0, "Truc", "Truc qui fait qqch", setLocalDate))
		daoUser.insert(new Utilisateur(0,"Pouet", "Fremidoreur", "Jean", "jean-fremi@exemple.fr", "06.pouet", "avenue victor pouet","35600pouet","Pouet-sur-Villaine", "Pouet2022", 1000, TODO,));		
		
	}
}
