package app;


import bo.Classe;
import bo.Eleve;

public class Application {

	public static void main(String[] args) {
		
		Eleve eleve1 = new Eleve("Dupont");
		
		for (int i = 0; i <10; i++) {
			eleve1.ajouterNote();
		}
		
		System.out.println(eleve1);
		
		Eleve eleve2 = new Eleve("Durand");
		
		for (int i = 0; i <10; i++) {
			eleve2.ajouterNote();
		}
		
		System.out.println(eleve2);
		
		
		Eleve eleve3 = new Eleve("Morin");
		
		for (int i = 0; i <10; i++) {
			eleve3.ajouterNote();
		}
		
		System.out.println(eleve3);
		
		Classe classe = new Classe ();
		classe.ajouterEleve(eleve1);
		classe.ajouterEleve(eleve2);
		classe.ajouterEleve(eleve3);
		
		System.out.println(classe);
		
		classe.getElevesClasse().stream()
			.forEach(eleve -> {
				System.out.println(eleve.getNom());
				System.out.println(eleve.getNotes());
			});
		
				
				
			}
			
	}

		
