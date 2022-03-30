/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 28 mars 2022
 * @version eniEncheres- V0.1
 * @since  28 mars 2022 - 15:54:25
 *
 */
public class ArticleVendu {

	private Integer noArticle;
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private Integer miseAPrix;
	private Integer prixVente;
	private String etatVente;
	private List<Enchere> lstEncheres = new ArrayList<Enchere>();
	
	/**
	 * Constructeur.
	 */
	public ArticleVendu() {
		super();
	}
	/**
	 * Constructeur.
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEncheres
	 * @param dateFinEncheres
	 * @param miseAPrix
	 * @param prixVente
	 * @param etatVente
	 */
	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			Integer miseAPrix, Integer prixVente, String etatVente) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}
	/**
	 * Constructeur.
	 * @param noArticle
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEncheres
	 * @param dateFinEncheres
	 * @param miseAPrix
	 * @param prixVente
	 * @param etatVente
	 */
	public ArticleVendu(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, Integer miseAPrix, Integer prixVente, String etatVente) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}
	/**
	 * Getter pour noArticle.
	 * @return the noArticle
	 */
	public Integer getNoArticle() {
		return noArticle;
	}
	/**
	 * Setter pour noArticle.
	 * @param noArticle the noArticle to set
	 */
	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}
	/**
	 * Getter pour nomArticle.
	 * @return the nomArticle
	 */
	public String getNomArticle() {
		return nomArticle;
	}
	/**
	 * Setter pour nomArticle.
	 * @param nomArticle the nomArticle to set
	 */
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	/**
	 * Getter pour description.
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Setter pour description.
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter pour dateDebutEncheres.
	 * @return the dateDebutEncheres
	 */
	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}
	/**
	 * Setter pour dateDebutEncheres.
	 * @param dateDebutEncheres the dateDebutEncheres to set
	 */
	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}
	/**
	 * Getter pour dateFinEncheres.
	 * @return the dateFinEncheres
	 */
	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}
	/**
	 * Setter pour dateFinEncheres.
	 * @param dateFinEncheres the dateFinEncheres to set
	 */
	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}
	/**
	 * Getter pour miseAPrix.
	 * @return the miseAPrix
	 */
	public Integer getMiseAPrix() {
		return miseAPrix;
	}
	/**
	 * Setter pour miseAPrix.
	 * @param miseAPrix the miseAPrix to set
	 */
	public void setMiseAPrix(Integer miseAPrix) {
		this.miseAPrix = miseAPrix;
	}
	/**
	 * Getter pour prixVente.
	 * @return the prixVente
	 */
	public Integer getPrixVente() {
		return prixVente;
	}
	/**
	 * Setter pour prixVente.
	 * @param prixVente the prixVente to set
	 */
	public void setPrixVente(Integer prixVente) {
		this.prixVente = prixVente;
	}
	/**
	 * Getter pour etatVente.
	 * @return the etatVente
	 */
	public String getEtatVente() {
		return etatVente;
	}
	/**
	 * Setter pour etatVente.
	 * @param etatVente the etatVente to set
	 */
	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}
	/**
	*{@inheritedDoc}
	*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleVendu [noArticle=");
		builder.append(noArticle);
		builder.append(", nomArticle=");
		builder.append(nomArticle);
		builder.append(", description=");
		builder.append(description);
		builder.append(", dateDebutEncheres=");
		builder.append(dateDebutEncheres);
		builder.append(", dateFinEncheres=");
		builder.append(dateFinEncheres);
		builder.append(", miseAPrix=");
		builder.append(miseAPrix);
		builder.append(", prixVente=");
		builder.append(prixVente);
		builder.append(", etatVente=");
		builder.append(etatVente);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
	
}
