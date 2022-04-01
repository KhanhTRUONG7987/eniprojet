package fr.eni.ecole.projet.eniEncheres.bll.categorie;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Categorie;

public interface CategorieManager {
	
	public void addCategorie(Categorie categorie) throws BLLException;
	public List<Categorie> getAllCategorie() throws BLLException;
	public Categorie getCategorie(Integer noCategorie) throws BLLException;

}
