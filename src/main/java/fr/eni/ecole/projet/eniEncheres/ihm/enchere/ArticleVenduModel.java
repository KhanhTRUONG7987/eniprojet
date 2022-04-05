/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.ihm.enchere;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.ArticleVendu;


/**
 * Classe en charge de
 * @author tjolly2022
 * @date 30 mars 2022
 * @version eniEncheres- V0.1
 * @since  30 mars 2022 - 11:27:43
 *
 */
public class ArticleVenduModel {
	private ArticleVendu current;
	private List<ArticleVendu> lsUtilisateurs = new ArrayList<ArticleVendu>();
	private String message;
	
	public ArticleVenduModel() {
		super();
	}

	public ArticleVenduModel(ArticleVendu current, List<ArticleVendu> lsUtilisateurs, String message) {
		super();
		this.current = current;
		this.lsUtilisateurs = lsUtilisateurs;
		this.message = message;
	}

	public ArticleVendu getCurrent() {
		return current;
	}

	public void setCurrent(ArticleVendu current) {
		this.current = current;
	}

	public List<ArticleVendu> getLsUtilisateurs() {
		return lsUtilisateurs;
	}

	public void setLsUtilisateurs(List<ArticleVendu> lsUtilisateurs) {
		this.lsUtilisateurs = lsUtilisateurs;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleVenduModel [");
		if (current != null) {
			builder.append("current=");
			builder.append(current);
			builder.append(", ");
		}
		if (lsUtilisateurs != null) {
			builder.append("lsUtilisateurs=");
			builder.append(lsUtilisateurs);
			builder.append(", ");
		}
		if (message != null) {
			builder.append("message=");
			builder.append(message);
		}
		builder.append("]");
		return builder.toString();
	}
	
		
	
}
