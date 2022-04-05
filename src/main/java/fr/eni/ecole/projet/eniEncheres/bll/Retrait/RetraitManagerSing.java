package fr.eni.ecole.projet.eniEncheres.bll.Retrait;


public class RetraitManagerSing {
	private static RetraitManager instance;
	
	public static RetraitManager getInstance() {
		if (instance == null) {
			instance = new RetraitManagerImpl();
		}		
		return instance;
		
	}
}
