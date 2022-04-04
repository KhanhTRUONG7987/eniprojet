package fr.eni.ecole.projet.eniEncheres.bll.enchere;

import java.time.LocalDateTime;

import fr.eni.ecole.projet.eniEncheres.bll.BLLException;
import fr.eni.ecole.projet.eniEncheres.bo.Enchere;

public class EnchereManagerTest {
	
	private static EnchereManager manager = EnchereManagerSing.getInstance();
	
	public static void main(String[] args) throws BLLException{
		manager.addEnchere(new Enchere(1, LocalDateTime.of(2022, 4, 9, 0, 0), 250, 1, 1));
		manager.addEnchere(new Enchere(2, LocalDateTime.of(2022, 6, 25, 0, 0), 280, 1, 1));
		manager.addEnchere(new Enchere(3, LocalDateTime.of(2022, 9, 27, 0, 0), 330, 1, 1));
		System.out.println();
		
		manager.getEnchere(2);
		System.out.println();
		
		manager.getAllEnchere().forEach(System.out::println);
		
	
	
	}

}
