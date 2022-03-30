/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.dal;

import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Enchere;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 29 mars 2022
 * @version eniEncheres- V0.1
 * @since  29 mars 2022 - 12:01:44
 *
 */
public interface EnchereDAO {
	public void insertEnchere (Enchere enchere);
	public void selectEnchere (Enchere enchere);
	public void delete (Enchere enchere);
	public void update (Enchere enchere);
	public List<Enchere> selectAll();

}
