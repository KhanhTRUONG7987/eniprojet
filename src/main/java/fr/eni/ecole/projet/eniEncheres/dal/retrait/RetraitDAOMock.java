package fr.eni.ecole.projet.eniEncheres.dal.retrait;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Retrait;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

public class RetraitDAOMock implements RetraitDAO{
	private static List<Retrait> lstRetrait = new ArrayList<Retrait>();

	@Override
	public void insertRetrait(Retrait retrait) throws DALException {
		lstRetrait.add(retrait);		
	}

	@Override
	public void updateRetrait(Retrait retrait) throws DALException {
		lstRetrait.set(retrait.getNoArticle(), retrait);
	}

	@Override
	public void deleteRetrait(Retrait retrait) throws DALException {
		lstRetrait.remove(retrait);
	}

}
