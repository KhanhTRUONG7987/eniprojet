package fr.eni.ecole.projet.eniEncheres.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Categorie;

public class CategorieDAOMock {

	private static Integer cpt=0;
	private List<Categorie> lstCategorie = new ArrayList<>();
	
	public void insert (Categorie categorie) {
		categorie.setNoCategorie(cpt++);
		lstCategorie.add(categorie);
	}
	
	public List<Categorie> selectAll(){
		return lstCategorie;
	}
	
	public selectById 
	
}
