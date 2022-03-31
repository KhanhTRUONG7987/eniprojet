package fr.eni.ecole.projet.eniEncheres.dal;

import fr.eni.ecole.projet.eniEncheres.bo.Categorie;

public class CategorieDAOTest {
	private static CategorieDAO dao = DAOFact.getCategorieDAO();
	
	public static void main(String[] args) throws DALException {
		
		dao.insert(new Categorie(1, "Informatique"));
		dao.insert(new Categorie(2, "Ameublement"));
		dao.insert(new Categorie(3, "Vêtements"));
		dao.insert(new Categorie(4, "Sport & Loisir"));
		
		dao.selectAll().forEach(System.out::println);
		
		dao.selectById();
	}
	
}
