package fr.eni.ecole.projet.eniEncheres.dal.article;

import java.time.LocalDate;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;

public class ArticleVenduDAOTest {

	public static ArticleVenduDAO dao = DAOFact.getArticleVenduDAO();
	
	public static void main(String[] args) throws DALException {
		
		ArticleVendu art1 = new ArticleVendu("Armoire Ikaé", "Armoire Penderie", LocalDate.of(2022, 4, 9), LocalDate.of(2022, 5, 15), 150, 11, 4, "EC");
		ArticleVendu art2 = new ArticleVendu("Armoire Akié", "Armoire Penderie", LocalDate.of(2022, 4, 9), LocalDate.of(2022, 5, 15), 132, 11, 4, "EC");
		ArticleVendu art3 = new ArticleVendu("Armoire Ekai", "Armoire Penderie", LocalDate.of(2022, 4, 9), LocalDate.of(2022, 4, 2), 113, 11, 4, "EC");
		
		dao.insertArticle(art1);
		dao.insertArticle(art2);
		dao.insertArticle(art3);
	
		dao.selectAllArticles().forEach(System.out::println);
		System.out.println(dao.selectById(2));
		dao.deleteVente(art2);
		dao.selectAllArticles().forEach(System.out::println);
		dao.update(art3);
		
	}

}
