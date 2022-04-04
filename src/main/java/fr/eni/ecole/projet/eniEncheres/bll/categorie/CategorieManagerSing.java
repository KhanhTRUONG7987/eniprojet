package fr.eni.ecole.projet.eniEncheres.bll.categorie;

public class CategorieManagerSing {
	private static CategorieManager instance;
	/**
	 * @return
	 */
	public static CategorieManager getInstance() {
		if(instance==null) {
			instance = new CategorieManagerImpl();
		}
		return instance;
	}

}
