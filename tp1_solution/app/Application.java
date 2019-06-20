package app;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bo.ClientJ7;
import bo.ClientJ8;
import util.Util;

public class Application {
	/**
	 * L'objectif de ce tp est de proposer deux implémentations à l'exécution identique
	 * La premiere implémentation ne devra pas employer les nouveautés Java8 (usage de boucles pour les opérations)
	 * La deuxième implémentation devra faire appel aux nouveautés Java8 (lambda, stream, dates)
	 * 
	 * Une fois les deux implémentations misent en place, un système de comparaison des performances pourra être mis en place 
	 * 
	 */
	public static void main(String[] args) {
		Application app = new Application();
		app.executeJ7();
		app.executeJ8();
	}
	
	public void executeJ7() {
		// Creation de la liste
		List<ClientJ7> clients = Util.get10ClientJ7();
		
		// Affichage de la liste
		for (ClientJ7 client : clients) {
			System.out.println(client);
		}
		
		// Afficher un message par ordre d'ancienneté
		clients.sort(new Comparator<ClientJ7> () {
			@Override
			public int compare(ClientJ7 c1, ClientJ7 c2) {
				return c1.getAdhesion().compareTo(c2.getAdhesion());
		}});
		for (ClientJ7 client : clients) {
			System.out.println("Bonjour " + client.getFirstName() + " " + client.getName());
		}
		
		// Trier, limiter à 3, puis upperCase si A
		clients.sort(new Comparator<ClientJ7> () {
			@Override
			public int compare(ClientJ7 c1, ClientJ7 c2) {
				int nameComp = c1.getName().compareTo(c2.getName()) * -1;
				return nameComp != 0 ? nameComp : c1.getFirstName().compareTo(c2.getFirstName()) * -1;
		}});
		for (int i=0; i<3; i++) {
			if (i < clients.size()) {
				ClientJ7 tmp = clients.get(i);
				if (tmp.getName().toLowerCase().contains("a"))
					tmp.setName(tmp.getName().toUpperCase());
			}
		}
		
		// Affichage de la liste
		for (ClientJ7 client : clients) {
			System.out.println(client);
		}
		
	}
	
	public void executeJ8() {
		List<ClientJ8> clients = Util.get10ClientJ8();
		
		// Affichage de la liste
		clients.stream().forEach(System.out::println);
		
		// Afficher un message par ordre d'ancienneté
		clients.stream()
			.sorted((c1, c2) -> c1.getAdhesion().compareTo(c2.getAdhesion()))
			.forEach(c -> System.out.println("Bonjour " + c.getFirstName() + " " + c.getName()));
		
		// Trier, limiter à 3, puis upperCase si A
		List<ClientJ8> list = clients.stream()
			.sorted((c1, c2) -> {
				int nameComp = c1.getName().compareTo(c2.getName()) * -1;
				return nameComp != 0 ? nameComp : c1.getFirstName().compareTo(c2.getFirstName()) * -1;
			})
			.limit(3)
			.filter(c -> c.getName().toLowerCase().contains("a"))
			.map(c -> {
				c.setName(c.getName().toUpperCase());
				return c;
			})
			.collect(Collectors.toList());
		
		// Affichage de la liste
		clients.stream().forEach(System.out::println);
		
	}

}
