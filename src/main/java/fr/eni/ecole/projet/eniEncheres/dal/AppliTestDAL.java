package fr.eni.ecole.projet.eniEncheres.dal;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;
import fr.eni.ecole.projet.eniEncheres.dal.article.ArticleVenduDAO;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAO;
import fr.eni.ecole.projet.eniEncheres.dal.enchere.EnchereDAO;
import fr.eni.ecole.projet.eniEncheres.dal.utilisateur.UtilisateurDAO;

public class AppliTestDAL {

	private static EnchereDAO dao = DAOFact.getEnchereDAO();


	public static void main(String[] args) throws DALException {
		dao.insert(new ArticleVendu(0, "Truc", "Truc qui fait qqch", setLocalDate));
		dao.insert(new Utilisateur(0,"Pouet", "Fremidoreur", "Jean", "jean-fremi@exemple.fr", "06.pouet", "avenue victor pouet","35600pouet","Pouet-sur-Villaine", "Pouet2022", 1000, TODO,));		
		
	}
}
