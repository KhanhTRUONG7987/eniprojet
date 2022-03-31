package fr.eni.ecole.projet.eniEncheres.bll;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;

public interface ArticleVenduManager {
	
	public void addArticle(ArticleVendu article) throws BLLException;
	public void updateArticle (ArticleVendu article) throws BLLException;
	public void deletArticle(ArticleVendu article) throws BLLException;
	public ArticleVendu selectById(Integer noArticle) throws BLLException;
	public List<ArticleVendu> selectAll()throws BLLException;

}