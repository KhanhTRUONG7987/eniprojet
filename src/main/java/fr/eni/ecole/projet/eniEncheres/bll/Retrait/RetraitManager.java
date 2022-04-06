package fr.eni.ecole.projet.eniEncheres.bll.Retrait;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Retrait;

public interface RetraitManager {

	public void addRetrait(Retrait retrait) throws BLLException;
	public void updateRetrait(Retrait retrait) throws BLLException;
	public void deleteRetrait(Retrait retrait) throws BLLException;
	public void findAll(Retrait retrait) throws BLLException;
	
}
