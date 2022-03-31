package fr.eni.ecole.projet.eniEncheres.dal.article;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

public interface ArticleVenduDAO {

	public void insertArticle(ArticleVendu article) throws DALException;
	public void update(ArticleVendu article) throws DALException;
	public void deleteVente(ArticleVendu article) throws DALException;
	public ArticleVendu selectById(Integer noArticle) throws DALException;
	public List<ArticleVendu> selectAllArticles() throws DALException;
}
