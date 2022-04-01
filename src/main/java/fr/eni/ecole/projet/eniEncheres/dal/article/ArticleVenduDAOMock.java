package fr.eni.ecole.projet.eniEncheres.dal.article;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

public class ArticleVenduDAOMock implements ArticleVenduDAO {
	private static Integer cpt = 0;	
	private List<ArticleVendu> lstArticles = new ArrayList<ArticleVendu>();

	@Override
	public void insertArticle(ArticleVendu article) throws DALException {
		article.setNoArticle(cpt++);
		lstArticles.add(article);
	}

	@Override
	public void update(ArticleVendu article) throws DALException {
		lstArticles.add(article);
	}

	@Override
	public void deleteVente(ArticleVendu article) throws DALException {
		lstArticles.remove(article);
	}

	@Override
	public ArticleVendu selectById(Integer noArticle) throws DALException {
		ArticleVendu article = new ArticleVendu();	
		article.setNoArticle(noArticle);
		for (ArticleVendu articleVendu : lstArticles) {
			if (article.getNoArticle() == articleVendu.getNoArticle()) {
				article = articleVendu;
			}
		}		
		return article;
	}

	@Override
	public List<ArticleVendu> selectAllArticles() throws DALException {
		return lstArticles;
	}

}
