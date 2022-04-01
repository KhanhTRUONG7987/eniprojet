package fr.eni.ecole.projet.eniEncheres.bll.ArticleVendu;

import java.time.LocalDate;

import fr.eni.ecole.projet.eniEncheres.bll.utilisateur.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;

public class ArticleVenduManagerTest {
	
	private static ArticleVenduManager manager = ArticleVenduManagerSing.getInstance();

	public static void main(String[] args) throws BLLException {
		
			ArticleVendu art1 = new ArticleVendu("Armoire Ikaé", "Armoire Penderie", LocalDate.of(2022, 4, 9), LocalDate.of(2022, 5, 15), 150, 11, 4, "EC");
			ArticleVendu art2 = new ArticleVendu("Armoire Akié", "Armoire Penderie", LocalDate.of(2022, 4, 9), LocalDate.of(2022, 5, 15), 132, 11, 4, "EC");
			ArticleVendu art3 = new ArticleVendu("Armoire Ekai", "Armoire Penderie", LocalDate.of(2022, 4, 9), LocalDate.of(2022, 4, 11), 113, 11, 4, "EC");
			
			manager.addArticle(art1);
			manager.addArticle(art2);
			manager.addArticle(art3);
	
			manager.selectAll().forEach(System.out::println);
			
			manager.deleteArticle(art3);
			
			manager.selectAll().forEach(System.out::println);
			System.out.println();
			System.out.println(manager.selectById(1));
			
	
	}
	
}
