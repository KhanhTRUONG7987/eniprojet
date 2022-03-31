package fr.eni.ecole.projet.eniEncheres.dal.categorie;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Categorie;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

public interface CategorieDAO {
	
	public void insert(Categorie categorie) throws DALException;
	public List<Categorie> selectAll() throws DALException;
	public Categorie selectById(Integer id) throws DALException;

}
