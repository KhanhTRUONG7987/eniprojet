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
	private Utilisateur utilisateur;
	private Categorie categorie;
	private String etatVente;
	private List<Enchere> lstEncheres = new ArrayList<Enchere>();
	
	
	public ArticleVendu() {
		super();
	}
	
	
	
	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			Integer miseAPrix, Integer prixVente, Utilisateur utilisateur, Categorie categorie, String etatVente) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.utilisateur = utilisateur;
		this.categorie = categorie;
		this.etatVente = etatVente;
	}

	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			Integer miseAPrix, Utilisateur utilisateur, Categorie categorie, String etatVente) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.utilisateur = utilisateur;
		this.categorie = categorie;
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
	 * @return the noUtilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	/**
	 * @param noUtilisateur the noUtilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * @return the noCategorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param noCategorie the noCategorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the lstEncheres
	 */
	public List<Enchere> getLstEncheres() {
		return lstEncheres;
	}
	
	/**
	 * @param lstEncheres the lstEncheres to set
	 */
	public void setLstEncheres(List<Enchere> lstEncheres) {
		this.lstEncheres = lstEncheres;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleVendu [");
		if (noArticle != null) {
			builder.append("noArticle=");
			builder.append(noArticle);
			builder.append(", ");
		}
		if (nomArticle != null) {
			builder.append("nomArticle=");
			builder.append(nomArticle);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}
		if (dateDebutEncheres != null) {
			builder.append("dateDebutEncheres=");
			builder.append(dateDebutEncheres);
			builder.append(", ");
		}
		if (dateFinEncheres != null) {
			builder.append("dateFinEncheres=");
			builder.append(dateFinEncheres);
			builder.append(", ");
		}
		if (miseAPrix != null) {
			builder.append("miseAPrix=");
			builder.append(miseAPrix);
			builder.append(", ");
		}
		if (prixVente != null) {
			builder.append("prixVente=");
			builder.append(prixVente);
			builder.append(", ");
		}
		if (utilisateur != null) {
			builder.append("noUtilisateur=");
			builder.append(utilisateur);
			builder.append(", ");
		}
		if (categorie != null) {
			builder.append("noCategorie=");
			builder.append(categorie);
			builder.append(", ");
		}
		if (etatVente != null) {
			builder.append("etatVente=");
			builder.append(etatVente);
			builder.append(", ");
		}
		if (lstEncheres != null) {
			builder.append("lstEncheres=");
			builder.append(lstEncheres);
			builder.append(", ");
		}
		if (super.toString() != null) {
			builder.append("toString()=");
			builder.append(super.toString());
		}
		builder.append("]");
		return builder.toString();
	}
	
}
