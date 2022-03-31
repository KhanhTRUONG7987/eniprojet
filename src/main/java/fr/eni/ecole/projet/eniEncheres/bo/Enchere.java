/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.bo;

import java.time.LocalDateTime;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 28 mars 2022
 * @version eniEncheres- V0.1
 * @since  28 mars 2022 - 16:38:49
 *
 */
public class Enchere {

	private Integer noEnchere;
	private LocalDateTime dateEnchere;
	private Integer montantEnchere;
	private Integer noArticle;
	private Integer noUtilisateur;
	
	/**
	 * Getter pour noEnchere.
	 * @return the noEnchere
	 */
	public Integer getNoEnchere() {
		return noEnchere;
	}
	/**
	 * Setter pour noEnchere.
	 * @param noEnchere the noEnchere to set
	 */
	public void setNoEnchere(Integer noEnchere) {
		this.noEnchere = noEnchere;
	}
	/**
	 * Getter pour dateEnchere.
	 * @return the dateEnchere
	 */
	public LocalDateTime getDateEnchere() {
		return dateEnchere;
	}
	/**
	 * Setter pour dateEnchere.
	 * @param dateEnchere the dateEnchere to set
	 */
	public void setDateEnchere(LocalDateTime dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	/**
	 * Getter pour montantEnchere.
	 * @return the montantEnchere
	 */
	public Integer getMontantEnchere() {
		return montantEnchere;
	}
	/**
	 * Setter pour montantEnchere.
	 * @param montantEnchere the montantEnchere to set
	 */
	public void setMontantEnchere(Integer montantEnchere) {
		this.montantEnchere = montantEnchere;
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
	 * Getter pour noUtilisateur.
	 * @return the noUtilisateur
	 */
	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}
	/**
	 * Setter pour noUtilisateur.
	 * @param noUtilisateur the noUtilisateur to set
	 */
	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	/**
	*{@inheritedDoc}
	*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enchere [noEnchere=");
		builder.append(noEnchere);
		builder.append(", dateEnchere=");
		builder.append(dateEnchere);
		builder.append(", montantEnchere=");
		builder.append(montantEnchere);
		builder.append(", noArticle=");
		builder.append(noArticle);
		builder.append(", noUtilisateur=");
		builder.append(noUtilisateur);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
