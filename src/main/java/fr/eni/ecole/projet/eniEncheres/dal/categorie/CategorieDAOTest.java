package fr.eni.ecole.projet.eniEncheres.dal.categorie;

import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;

public class CategorieDAOTest {
	private static CategorieDAO dao = DAOFact.getCategorieDAO();
	
	public static void main(String[] args) throws DALException {
		
		dao.insert(new Categorie(1, "Informatique"));
		dao.insert(new Categorie(2, "Ameublement"));
		dao.insert(new Categorie(3, "V�tements"));
		dao.insert(new Categorie(4, "Sport & Loisir"));
		
		dao.selectAll().forEach(System.out::println);
		
		dao.selectById();
	}
	
}