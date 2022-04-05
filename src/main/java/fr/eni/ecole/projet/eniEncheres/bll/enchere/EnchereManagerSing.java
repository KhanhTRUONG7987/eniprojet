package fr.eni.ecole.projet.eniEncheres.bll.enchere;

public class EnchereManagerSing {
	
	private static EnchereManager instance;
	public static EnchereManager getInstance() {
		if(instance==null) {
			instance = new EnchereManagerImpl();
		}
		return instance;
	}

}
