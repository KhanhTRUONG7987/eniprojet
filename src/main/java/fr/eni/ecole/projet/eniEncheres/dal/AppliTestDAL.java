package fr.eni.ecole.projet.eniEncheres.dal;

import java.time.LocalDate;
import java.time.LocalDateTime;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.bo.Enchere;
import fr.eni.ecole.projet.eniEncheres.bo.Retrait;
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
		daoArticle.insertArticle(new ArticleVendu("Truc", "Truc qui fait qqch", LocalDate.of(2022, 4, 9), LocalDate.of(2022, 4, 18), 150, 2, 3, "Créée"));
		daoUser.insertUtilisateur(new Utilisateur(0,"Pouet", "Fremidoreur", "Jean", "jean-fremi@exemple.fr", "06.pouet", "avenue victor pouet","35600pouet","Pouet-sur-Villaine", "Pouet2022", 1000, false));
		daoCategorie.insert(new Categorie(1, "Informatique"));
		daoEnchere.insert(new Enchere(1, LocalDateTime.of(2022, 4, 22, 10, 14), 227, 1, 4));
		daoRetrait.insertRetrait(new Retrait("fouy", "35600", "Sainte-Marie"));
	}
}
