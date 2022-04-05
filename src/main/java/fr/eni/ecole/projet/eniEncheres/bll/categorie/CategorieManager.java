package fr.eni.ecole.projet.eniEncheres.bll.categorie;

import java.util.List;


import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;

public interface CategorieManager {
	
	/**
	 * @param categorie
	 * @throws BLLException
	 */
	public void addCategorie(Categorie categorie) throws BLLException;
	/**
	 * @return
	 * @throws BLLException
	 */
	public List<Categorie> getAllCategorie() throws BLLException;
	/**
	 * @param noCategorie
	 * @return
	 * @throws BLLException
	 */
	public Categorie getCategorie(Integer noCategorie) throws BLLException;

}
