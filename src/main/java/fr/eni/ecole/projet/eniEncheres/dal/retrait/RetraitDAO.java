package fr.eni.ecole.projet.eniEncheres.dal.retrait;

import fr.eni.ecole.projet.eniEncheres.bo.Retrait;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

public interface RetraitDAO {
	
	public void insertRetrait(Retrait retrait)throws DALException;
	public void updateRetrait(Retrait retrait)throws DALException;
	public void deleteRetrait(Retrait retrait)throws DALException;

}
