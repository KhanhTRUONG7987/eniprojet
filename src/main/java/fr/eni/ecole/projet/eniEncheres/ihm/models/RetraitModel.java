package fr.eni.ecole.projet.eniEncheres.ihm.models;

import fr.eni.ecole.projet.eniEncheres.bo.Retrait;

public class RetraitModel {
	
	private Retrait current;
	private String message;
	
	
	
	public RetraitModel() {
		super();
	}

	public RetraitModel(Retrait current, String message) {
		super();
		this.current = current;
		this.message = message;
	}

	public Retrait getCurrent() {
		return current;
	}

	public void setCurrent(Retrait current) {
		this.current = current;
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
		builder.append("RetraitModel [");
		if (current != null) {
			builder.append("current=");
			builder.append(current);
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
