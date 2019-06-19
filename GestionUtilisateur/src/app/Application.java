package app;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import bo.User;
import bo.UserJava8;
import util.Util;

public class Application {

	public static void main(String[] args) {

		Application app = new Application();
		
		//LocalTime lt1 = LocalTime.now();
		
		//for (int i = 0; i <= 500_000; i++) {
			app.executeJ7();
//		}
//		LocalTime lt2 = LocalTime.now();
//		Duration d = Duration.between(lt1, lt2);
//						
//		
//		
//		LocalTime lt3 = LocalTime.now();
//		
//		for (int i = 0; i <= 500_000; i++) {
			app.executeJ8();
//		}
//		LocalTime lt4 = LocalTime.now();
//		Duration d2 = Duration.between(lt3, lt4);
//		
//		System.out.println(d);
//		System.out.println(d2);
//		
//		
	}

	public void executeJ7() {
		// 1. instanciation d'une liste d'utilisateurs
		List<User> users = new ArrayList<User>();
		Util.mockList(users);

		// 2. afficher la liste utilisateur par utilisateur
		System.out.println("---- Liste de tous les utilisateurs: ----");
		// ajouter le for
		System.out.println(users);

		// 3. afficher un message avec le nom + prénom, par ancienneté d'adhesion
		users.sort(new Comparator<User>() {
			public int compare(User u1, User u2) {
				int dateAdhesionComp = u1.getCalendar().compareTo(u2.getCalendar());
				return (dateAdhesionComp != 0) ? dateAdhesionComp : u1.getNom().compareTo(u2.getNom());
			}
		});
		System.out.println("---- Liste des utilisateurs par ancienneté d'adhésion: ----");
		for (User user : users) {
			System.out.println(user);
			}
		
		// 4. Trier la liste des utilisateurs par nom + prénom décroissant (Z
		// en premier, A en dernier), retenir les 3 premiers utilisateurs,
		// puis, si le nom de l’utilisateur contient la lettre ‘A’, passer le
		// nom en majuscule

		users.sort(Collections.reverseOrder(new Comparator<User>() {
			public int compare(User u1, User u2) {
				int nomComp = u1.getNom().compareTo(u2.getNom());
				return (nomComp != 0) ? nomComp : u1.getPrenom().compareTo(u2.getPrenom());
			}
		}));
		
		System.out.println("---- Liste des 3 1ers utilisateurs triés"
				+ " par ordre décroissant: ---- \n(mise en capitales des noms contenant un a)");
		for (int i = 0; i < 3; i++) {
			if (i < users.size()) {
				User user = users.get(i);
				if (user.getNom().toLowerCase().contains("a")) {
					user.setNom(user.getNom().toUpperCase());
				}
				System.out.println(user);
			}

		}
		
		
		// 5. afficher la liste utilisateur par utilisateur
		System.out.println("---- Liste de tous les utilisateurs: ----");		
		System.out.println(users);
	}
	
	public void executeJ8() {
		
		// 1. instanciation d'une liste d'utilisateurs
		List<UserJava8> usersJava8 = new ArrayList<UserJava8>();
		Util.mockList8(usersJava8);
		
		// 2. afficher la liste utilisateur par utilisateur
		System.out.println("---- Liste de tous les utilisateurs: ----");
		usersJava8.stream().forEach(System.out::println);
		
		// 3. afficher un message avec le nom + prénom, par ancienneté d'adhesion
		
		System.out.println("---- Liste des utilisateurs par ancienneté d'adhésion: ----");
		usersJava8.stream()
				.sorted((u1, u2) -> u1.getDateAdhesion().compareTo(u2.getDateAdhesion()))
				.forEach(u -> System.out.println ("Bonjour " + u.getPrenom()));
				
		
		
		// 4. Trier la liste des utilisateurs par nom + prénom décroissant (Z
		// en premier, A en dernier), retenir les 3 premiers utilisateurs,
		// puis, si le nom de l’utilisateur contient la lettre ‘A’, passer le
		// nom en majuscule
		
		System.out.println("---- Liste des 3 1ers utilisateurs triés"
				+ " par ordre décroissant: ---- \n(mise en capitales des noms contenant un a)");
		List<UserJava8> desc = usersJava8
			.stream()
			.limit(3)
			.sorted((u1, u2) -> u2.getNom().compareTo(u1.getNom()))
			.map(userJava8 -> {
				if (userJava8.getNom().toLowerCase().contains("a"))
				userJava8.setNom(userJava8.getNom().toUpperCase());
				return userJava8;
		})
			.collect(Collectors.toList());
			
			if (!desc.isEmpty())
				System.out.println(desc);
		
	
		// 5. afficher la liste utilisateur par utilisateur
		System.out.println("---- Liste de tous les utilisateurs: ----");	
		System.out.println(usersJava8);

		
		
	}
	
	 

}