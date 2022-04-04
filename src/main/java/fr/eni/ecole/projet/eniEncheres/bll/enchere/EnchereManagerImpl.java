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
			throw new BLLException("Probl�me � l'insertion de l'ench�re");
		}
	}

	@Override
	public Enchere getEnchere(Integer noEnchere) throws BLLException {
		try {
			Enchere enchere = dao.selectById(noEnchere);
			return enchere;
		} catch (DALException e) {
			throw new BLLException("Probl�me � la s�lection de l'ench�re");
		}
	}

	@Override
	public void updateEnchere(Enchere enchere) throws BLLException {
		try {
			dao.update(enchere);
		} catch (DALException e) {
			throw new BLLException("Probl�me � la mise � jour de l'ench�re");
		}
	}

	@Override
	public List<Enchere> getAllEnchere() throws BLLException {
		try {
			return dao.selectAll();
		} catch (DALException e) {
			throw new BLLException("Probl�me � la s�lection des ench�res");
		}
	}



}
