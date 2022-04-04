package fr.eni.ecole.projet.eniEncheres.bll.categorie;

import fr.eni.ecole.projet.eniEncheres.bll.ArticleVendu.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;

public class CategorieManagerTest {
	
	private static CategorieManager manager = CategorieManagerSing.getInstance();
	
	public static void main(String[] args) throws BLLException {
		manager.addCategorie(new Categorie(1, "Informatique"));
		manager.addCategorie(new Categorie(2, "Ameublement"));
		manager.addCategorie(new Categorie(3, "V�tement"));
		manager.addCategorie(new Categorie(4, "Sport & Loisirs"));

		manager.getAllCategorie().forEach(System.out::println);
		System.out.println();
		System.out.println(manager.getCategorie(1));
		
		
	}

}
