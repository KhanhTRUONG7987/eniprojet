package fr.eni.ecole.projet.eniEncheres.dal.enchere;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Enchere;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

public class EnchereDAOMock implements EnchereDAO{

	private static Integer cpt = 0;
	private List<Enchere> lstEncheres = new ArrayList<>();
	@Override
	public void insert(Enchere enchere) throws DALException {
		enchere.setNoEnchere(cpt++);
		lstEncheres.add(enchere);
	}

	public Enchere selectById(Integer enchere) throws DALException {
		Enchere enchereTest = new Enchere();
		enchereTest.setNoEnchere(enchere);
		return enchereTest;
	}

	public void delete(Enchere enchere) throws DALException {
		lstEncheres.remove(enchere);
	}

	public void update(Enchere enchere) throws DALException {
		lstEncheres.set(enchere.getNoArticle(), enchere);
	}

	public List<Enchere> selectAll() throws DALException {
		return lstEncheres;
	}


}
