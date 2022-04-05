package fr.eni.ecole.projet.eniEncheres.ihm.models;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Enchere;

public class EnchereModel {
	
	private Enchere current;
	private List<Enchere> lstEncheres = new ArrayList<Enchere>();
	private String message;
	
	
	public EnchereModel() {
		super();
	}


	public EnchereModel(Enchere current, List<Enchere> lstEncheres, String message) {
		this.current = current;
		this.lstEncheres = lstEncheres;
		this.message = message;
	}


	public Enchere getCurrent() {
		return current;
	}


	public void setCurrent(Enchere current) {
		this.current = current;
	}


	public List<Enchere> getLstEncheres() {
		return lstEncheres;
	}


	public void setLstEncheres(List<Enchere> lstEncheres) {
		this.lstEncheres = lstEncheres;
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
		builder.append("EnchereModel [message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}

	
	

}
