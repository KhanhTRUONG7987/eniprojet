package fr.eni.ecole.projet.eniEncheres.bll.enchere;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Enchere;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;
import fr.eni.ecole.projet.eniEncheres.dal.enchere.EnchereDAO;

public class EnchereManagerImpl implements EnchereManager {
	
	private EnchereDAO dao = DAOFact.getEnchereDAO();

	@Override
	public void addEnchere(Enchere enchere) throws BLLException {
		try {
			dao.insert(enchere);
		} catch (DALException e) {
			throw new BLLException("Problème à l'insertion de l'enchère");
		}
	}

	@Override
	public Enchere getEnchere(Integer noEnchere) throws BLLException {
		try {
			Enchere enchere = dao.selectById(noEnchere);
			return enchere;
		} catch (DALException e) {
			throw new BLLException("Problème à la sélection de l'enchère");
		}
	}

	@Override
	public void updateEnchere(Enchere enchere) throws BLLException {
		try {
			dao.update(enchere);
		} catch (DALException e) {
			throw new BLLException("Problème à la mise à jour de l'enchère");
		}
	}

	@Override
	public List<Enchere> getAllEnchere() throws BLLException {
		try {
			return dao.selectAll();
		} catch (DALException e) {
			throw new BLLException("Problème à la sélection des enchères");
		}
	}



}
