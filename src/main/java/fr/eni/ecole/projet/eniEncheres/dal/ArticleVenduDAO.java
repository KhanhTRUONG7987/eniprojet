package fr.eni.ecole.projet.eniEncheres.dal;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;

public interface ArticleVenduDAO {

	public void insertArticle(ArticleVendu article) throws DALException;
	public void update(ArticleVendu article) throws DALException;
	public void deleteVente(ArticleVendu article) throws DALException;
	public ArticleVendu selectById(Integer id) throws DALException;

}
