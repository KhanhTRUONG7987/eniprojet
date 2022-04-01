package fr.eni.ecole.projet.eniEncheres.dal.categorie;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

public class CategorieDAOMock implements CategorieDAO {

	private static Integer cpt=0;
	private List<Categorie> lstCategorie = new ArrayList<>();
	
	public void insert (Categorie categorie) {
		categorie.setNoCategorie(cpt++);
		lstCategorie.add(categorie);
	}
	
	public List<Categorie> selectAll(){
		return lstCategorie;
	}

	@Override
	public Categorie selectById(Integer id) throws DALException {
		Categorie categorieTest = new Categorie();
		categorieTest.setNoCategorie(id);
		for (Categorie categorie : lstCategorie) {
			if (categorieTest.getNoCategorie() == categorie.getNoCategorie()) {
				categorieTest = categorie;
			}
		}		
		return categorieTest;
	}
	
}
