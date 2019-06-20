package bo;

import java.util.ArrayList;

public class Classe {
	
	private ArrayList<Eleve> elevesClasse;

	public Classe() {
		super();
		this.elevesClasse = new ArrayList<Eleve>();
	}

	public ArrayList<Eleve> getElevesClasse() {
		return elevesClasse;
	}

	public void setElevesClasse(ArrayList<Eleve> elevesClasse) {
		this.elevesClasse = elevesClasse;
	}

	@Override
	public String toString() {
		return "\nListe des eleves de la classe: " + elevesClasse ;
	}
	
	public void ajouterEleve(Eleve eleve) {
		
		this.elevesClasse.add(eleve);	
}


}
