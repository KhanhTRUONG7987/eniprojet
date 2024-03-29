package fr.eni.ecole.projet.eniEncheres.dal.enchere;

import java.time.LocalDateTime;

import fr.eni.ecole.projet.eniEncheres.bo.Enchere;
import fr.eni.ecole.projet.eniEncheres.dal.DALException;
import fr.eni.ecole.projet.eniEncheres.dal.DAOFact;

public class EnchereDAOTest {
	
	private static EnchereDAO dao = DAOFact.getEnchereDAO();
	
	public static void main(String[] args) throws DALException {
		
		dao.insert(new Enchere(1, LocalDateTime.of(0, 0, 0, 0, 0), 250, 1, 1));
	}

}
