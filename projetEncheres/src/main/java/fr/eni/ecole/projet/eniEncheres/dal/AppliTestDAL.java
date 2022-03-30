package fr.eni.ecole.projet.eniEncheres.dal;

import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;

public class AppliTestDAL {

	private static ArticleVenduDAO dao = DAOFact.getArticleVenduDAO();
	private static CategorieDAO dao = DAOFact.getCategorieDAO();
	private static EnchereDAO dao = DAOFact.getEnchereDAO();
	private static RetraitDAO dao = DAOFact.getRetraitDAO();
	private static UtilisateurDAO dao = DAOFact.getUtilisateurDAO();


	public static void main(String[] args) throws DALException {
		dao.insert(new ArticleVendu(0, "Truc", "Truc qui fait qqch", setLocalDate))
		dao.insert(new Utilisateur(0,"Pouet", "Fremidoreur", "Jean", "jean-fremi@exemple.fr", "06.pouet", "avenue victor pouet","35600pouet","Pouet-sur-Villaine", "Pouet2022", 1000, TODO,));		
		
	}
}
