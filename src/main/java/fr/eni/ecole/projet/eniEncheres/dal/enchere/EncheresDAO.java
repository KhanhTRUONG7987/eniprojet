package fr.eni.ecole.projet.eniEncheres.dal.enchere;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Enchere;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

public interface EncheresDAO {
	
	public void insert(Enchere enchere) throws DALException;
	public List<Enchere> selectAll() throws DALException;
	public Enchere selectById(Integer id) throws DALException;


}
