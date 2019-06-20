package bo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Eleve {
	
	private String nom;
	private ArrayList<Integer> listeNotes;
	
	
	public Eleve(String nom) {
		super();
		this.nom = nom;
		this.listeNotes = new ArrayList<Integer>();
		
	}
	
	
	
	

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public ArrayList<Integer> getListeNotes() {
		return listeNotes;
	}
	
	public void setListeNotes(ArrayList<Integer> listeNotes) {
		this.listeNotes = listeNotes;
	}
	
	@Override
	public String toString() {
		return "\nNom: " + nom + ", liste de notes: " + listeNotes;
	}
	
	
	public void ajouterNote() {
			
			int note = (int) (Math.random() * 20);
			this.listeNotes.add(note);	
	}
	
	// retourne la liste de notes par ordre croissant
	public List<Integer> getNotes() {
		List<Integer> classement =
				listeNotes.stream()	
				.sorted((d1, d2) -> d1 - d2)
				.collect(Collectors.toList());
		return classement;
	}
	
	// retourne la note la plus faible
	public void getNoteMin() {
		
		
	}
	
	// retourne la note la plus élevée
	public void getNoteMax() {
		
		
	}
	
	// retourne la moyenne de l'élève
	public void getMoyenne() {
		
		
	}
	

}
