/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.bo;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 28 mars 2022
 * @version eniEncheres- V0.1
 * @since  28 mars 2022 - 16:37:12
 *
 */
public class Retrait {

	private Integer noArticle;
	private String rue;
	private String codePostal;
	private String ville;
	
	
	
	public Retrait() {
		super();
	}
	/**
	 * Constructeur.
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public Retrait(String rue, String codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	/**
	 * Getter pour rue.
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	/**
	 * Setter pour rue.
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		
		this.rue = rue;
	}
	/**
	 * Getter pour codePostal.
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * Setter pour codePostal.
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * Getter pour ville.
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * Setter pour ville.
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
		
	public Integer getNoArticle() {
		return noArticle;
	}
	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}
	/**
	*{@inheritedDoc}
	*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Retrait [rue=");
		builder.append(rue);
		builder.append(", codePostal=");
		builder.append(codePostal);
		builder.append(", ville=");
		builder.append(ville);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
