package fr.eni.ecole.projet.eniEncheres.bll.categorie;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;
import fr.eni.ecole.projet.eniEncheres.dal.categorie.CategorieDAO;

public class CategorieManagerImpl implements CategorieManager {

	private CategorieDAO dao = DAOFact.getCategorieDAO();

	/**
	 *
	 */
	@Override
	public void addCategorie(Categorie categorie) throws BLLException {
		try {
			dao.insert(categorie);
		} catch (DALException e) {
			throw new BLLException("Probl�me � l'insertion de la cat�gorie");
		}
	}

	/**
	 *
	 */
	@Override
	public List<Categorie> getAllCategorie() throws BLLException {
		try {
			return dao.selectAll();
		} catch (DALException e) {
			throw new BLLException("Probl�me � la s�lection des cat�gories");
		}
	}

	/**
	 *
	 */
	@Override
	public Categorie getCategorie(Integer noCategorie) throws BLLException {
		try { 
			Categorie categorie = dao.selectById(noCategorie);
			return categorie;
		} catch (DALException e) {
			throw new BLLException("Probl�me � la s�lection de la cat�gorie");
		}
	}

}
