package fr.eni.ecole.projet.eniEncheres.bll.Retrait;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Retrait;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;
import fr.eni.ecole.projet.eniEncheres.dal.retrait.RetraitDAO;

public class RetraitManagerImpl implements RetraitManager{
	private RetraitDAO dao = DAOFact.getRetraitDAO(); 

	@Override
	public void addRetrait(Retrait retrait) throws BLLException {
		
		try {
			dao.insertRetrait(retrait);
		} catch (DALException e) {
			throw new BLLException("Problème dans l'ajout du retrait");
		}
	}

	@Override
	public void updateRetrait(Retrait retrait) throws BLLException {
		try {
			dao.updateRetrait(retrait);
		} catch (DALException e) {
			throw new BLLException("Problème dans la modification du retrait");
		}
	}

	@Override
	public void deleteRetrait(Retrait retrait) throws BLLException {
		try {
			dao.deleteRetrait(retrait);
		} catch (DALException e) {
			throw new BLLException("Problème dans la suppression du retrait");
		}
		
	}
	

}
