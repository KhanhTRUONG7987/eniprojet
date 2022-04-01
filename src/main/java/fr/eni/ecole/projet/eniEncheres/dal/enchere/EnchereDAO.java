/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.dal.enchere;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Enchere;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 29 mars 2022
 * @version eniEncheres- V0.1
 * @since  29 mars 2022 - 12:01:44
 *
 */
public interface EnchereDAO {
	public void insertEnchere (Enchere enchere)throws DALException;
	public void selectEnchere (Integer enchere)throws DALException;
	public void delete (Enchere enchere)throws DALException;
	public void update (Enchere enchere)throws DALException;
	public List<Enchere> selectAll()throws DALException;

}
