package fr.eni.ecole.projet.eniEncheres.bll;

import java.time.LocalDate;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;
import fr.eni.ecole.projet.eniEncheres.dal.article.ArticleVenduDAO;

public class ArticleVenduManagerImpl implements ArticleVenduManager{
	
	private ArticleVenduDAO dao = DAOFact.getArticleVenduDAO();

	@Override
	public void addArticle(ArticleVendu article) throws BLLException {
		if (article.getDateFinEncheres().isBefore(article.getDateDebutEncheres())) {
			throw new BLLException("Date de fin antérieure à date de début de l'enchère");
		}
		if (article.getDateDebutEncheres().isBefore(LocalDate.now())) {
			throw new BLLException("Date de début d'enchère invalide");
		}
		try {
			dao.insertArticle(article);
		} catch (DALException e) {
			throw new BLLException(" Problème dans l'insertion de l'article");
		}
		
	}

	@Override
	public void updateArticle(ArticleVendu article) throws BLLException {
		try {
			dao.update(article);
		} catch (DALException e) {
			throw new BLLException(" Problème dans la mise à jour de l'article");		
		}
	}

	@Override
	public void deletArticle(ArticleVendu article) throws BLLException {
		try {
			dao.deleteVente(article);
		} catch (DALException e) {
			throw new BLLException(" Problème dans la suppression de l'article");		
		}
	}

	@Override
	public ArticleVendu selectById(Integer noArticle) throws BLLException {
		try {
			ArticleVendu article = dao.selectById(noArticle);			
			return article;
			
		} catch (DALException e) {
			throw new BLLException(" Problème dans la recherche de l'article");
		}
	}

	@Override
	public List<ArticleVendu> selectAll() throws BLLException {
		try {
			return dao.selectAllArticles();
		} catch (DALException e) {
			throw new BLLException(" Problème dans l'affichage des articles");
		}
	}

}
