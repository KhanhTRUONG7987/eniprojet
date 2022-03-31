/**
 * 
 */
package fr.eni.ecole.projet.eniEncheres.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Utilisateur;

/**
 * Classe en charge de
 * @author tjolly2022
 * @date 30 mars 2022
 * @version eniEncheres- V0.1
 * @since  30 mars 2022 - 11:27:43
 *
 */
public class UtilisateurModel {
	private Utilisateur current;
	private List<Utilisateur> lsUtilisateurs = new ArrayList<Utilisateur>();
	private String message;
	/**
	 * Constructeur.
	 */
	public UtilisateurModel() {
		super(); 
	}
	/**
	 * Constructeur.
	 * @param current
	 * @param lsUtilisateurs
	 * @param message
	 */
	public UtilisateurModel(Utilisateur current, List<Utilisateur> lsUtilisateurs, String message) {
		super();
		this.current = current;
		this.lsUtilisateurs = lsUtilisateurs;
		this.message = message;
	}
	/**
	 * Getter pour current.
	 * @return the current
	 */
	public Utilisateur getCurrent() {
		return current;
	}
	/**
	 * Setter pour current.
	 * @param current the current to set
	 */
	public void setCurrent(Utilisateur current) {
		this.current = current;
	}
	/**
	 * Getter pour lsUtilisateurs.
	 * @return the lsUtilisateurs
	 */
	public List<Utilisateur> getLsUtilisateurs() {
		return lsUtilisateurs;
	}
	/**
	 * Setter pour lsUtilisateurs.
	 * @param lsUtilisateurs the lsUtilisateurs to set
	 */
	public void setLsUtilisateurs(List<Utilisateur> lsUtilisateurs) {
		this.lsUtilisateurs = lsUtilisateurs;
	}
	/**
	 * Getter pour message.
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * Setter pour message.
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	*{@inheritedDoc}
	*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtilisateurModel [current=");
		builder.append(current);
		builder.append(", lsUtilisateurs=");
		builder.append(lsUtilisateurs);
		builder.append(", message=");
		builder.append(message);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
