package fr.eni.ecole.projet.eniEncheres.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;

public class ArticleVenduDAOMock implements ArticleVenduDAO {
	private List<ArticleVendu> lstArticles = new ArrayList<ArticleVendu>();

	@Override
	public void insertArticle(ArticleVendu article) throws DALException {
		lstArticles.add(article);
	}

	@Override
	public void update(ArticleVendu article) throws DALException {

	}

	@Override
	public void deleteVente(ArticleVendu article) throws DALException {
		lstArticles.remove(article);
	}

	@Override
	public ArticleVendu selectById(Integer id) throws DALException {
		ArticleVendu article = new ArticleVendu();		
		lstArticles.get(id);
		return null;
	}

}
