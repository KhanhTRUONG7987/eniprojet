/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 28 mars 2022
 * @version eniEncheres- V0.1
 * @since  28 mars 2022 - 16:48:59
 *
 */
public class Categorie {
	
	private Integer noCategorie;
	private String libelle;
	private List<ArticleVendu> lstArticlesVendus = new ArrayList<ArticleVendu>();
	/**
	 * Constructeur.
	 */
	public Categorie() {
		super();
	}
	
	/**
	 * Constructeur.
	 * @param libelle
	 */
	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}

	/**
	 * Constructeur.
	 * @param noCategorie
	 * @param libelle
	 */
	public Categorie(Integer noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}

	/**
	 * Getter pour noCategorie.
	 * @return the noCategorie
	 */
	public Integer getNoCategorie() {
		return noCategorie;
	}

	/**
	 * Setter pour noCategorie.
	 * @param noCategorie the noCategorie to set
	 */
	public void setNoCategorie(Integer noCategorie) {
		this.noCategorie = noCategorie;
	}

	/**
	 * Getter pour libelle.
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter pour libelle.
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter pour lstArticlesVendus.
	 * @return the lstArticlesVendus
	 */
	public List<ArticleVendu> getLstArticlesVendus() {
		return lstArticlesVendus;
	}

	/**
	 * Setter pour lstArticlesVendus.
	 * @param lstArticlesVendus the lstArticlesVendus to set
	 */
	public void setLstArticlesVendus(List<ArticleVendu> lstArticlesVendus) {
		this.lstArticlesVendus = lstArticlesVendus;
	}

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", lstArticlesVendus="
				+ lstArticlesVendus + "]";
	}
	
	
	
}
