package fr.eni.ecole.projet.eniEncheres.bll.enchere;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Enchere;

public interface EnchereManager {
	
	public void addEnchere(Enchere enchere) throws BLLException;
	public Enchere getEnchere (Integer noEnchere) throws BLLException;
	public void updateEnchere(Enchere enchere) throws BLLException;
	public List<Enchere> getAllEnchere() throws BLLException;
	
}


