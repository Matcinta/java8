package bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class UserJava8 {

	
	private String nom;
	private String prenom;
		
	private LocalDate dateAdhesion;
	
	
	public UserJava8(String nom, String prenom, LocalDate dateAdhesion) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateAdhesion = dateAdhesion;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public LocalDate getDateAdhesion() {
		return dateAdhesion;
	}


	public void setDateAdhesion(LocalDate dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}


	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return "\tNom : " + nom 
				+ ", \tPrenom : " + prenom
				+ ", \tDate d'adhesion: " + dateAdhesion.format(formatter) + "\n";
	}
	
	
	
}
