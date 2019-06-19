package bo;


import java.text.SimpleDateFormat;
import java.util.Calendar;


public class User {

	
	private String nom;
	private String prenom;
		
	private Calendar calendar;
	
	

	public User(String nom, String prenom, Calendar calendar) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.calendar = calendar;
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


	


	public Calendar getCalendar() {
		return calendar;
	}


	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}


	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		return "\tNom : " + nom 
				+ ", \tPrenom : " + prenom
				+ ", \tDate d'adhesion: " + sdf.format(calendar.getTime()) + "\n";
	}
	
	
	
}
