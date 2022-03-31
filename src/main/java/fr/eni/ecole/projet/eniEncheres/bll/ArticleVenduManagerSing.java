package fr.eni.ecole.projet.eniEncheres.bll;

public class ArticleVenduManagerSing {
	private static ArticleVenduManager instance;
	
	public static ArticleVenduManager getInstance() {
		if (instance == null) {
			instance = new ArticleVenduManagerImpl();
		}		
		return instance;
		
	}

}
