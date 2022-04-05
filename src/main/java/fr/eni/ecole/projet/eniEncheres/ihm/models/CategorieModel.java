package fr.eni.ecole.projet.eniEncheres.ihm.models;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.eniEncheres.bo.Categorie;

public class CategorieModel {
	
	private Categorie current;
	private List<Categorie> lstCategories =  new ArrayList<Categorie>();
	private String message;
	
	
	public CategorieModel() {
		super();
	}


	public CategorieModel(Categorie current, List<Categorie> lstCategories, String message) {
		this.current = current;
		this.lstCategories = lstCategories;
		this.message = message;
	}


	public Categorie getCurrent() {
		return current;
	}


	public void setCurrent(Categorie current) {
		this.current = current;
	}


	public List<Categorie> getLstCategories() {
		return lstCategories;
	}


	public void setLstCategories(List<Categorie> lstCategories) {
		this.lstCategories = lstCategories;
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
		builder.append("CategorieModel [current=");
		builder.append(current);
		builder.append(", lstCategories=");
		builder.append(lstCategories);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
