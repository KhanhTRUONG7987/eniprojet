/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.ihm.models;

import java.time.LocalDate;
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
	private List<ArticleVendu> lstArticlesVendus = new ArrayList<ArticleVendu>();
	private String message;
	
	public ArticleVenduModel() {
		super();
	}

	public ArticleVenduModel(ArticleVendu current, List<ArticleVendu> lstArticlesVendus, String message) {
		super();
		this.current = current;
		this.lstArticlesVendus = lstArticlesVendus;
		this.message = message;
	}

	public ArticleVendu getCurrent() {
		return current;
	}

	public void setCurrent(ArticleVendu current) {
		this.current = current;
	}

	public List<ArticleVendu> getLstArticlesVendus() {
		return lstArticlesVendus;
	}

	public void setLstArticlesVendus(List<ArticleVendu> lstArticlesVendus) {
		this.lstArticlesVendus = lstArticlesVendus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setVenteTermine() {
		if (current.getDateFinEncheres()==LocalDate.now()) {
			current.setEtatVente("Terminée");
		}		
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
		if (lstArticlesVendus != null) {
			builder.append("lstArticlesVendus=");
			builder.append(lstArticlesVendus);
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
