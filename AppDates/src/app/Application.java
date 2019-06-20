package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
	
	private ArrayList<LocalDate> listeDatesSaisies = new ArrayList<LocalDate>();
	private ArrayList<LocalTime> listeTempsSaisis = new ArrayList<LocalTime>();
	private ArrayList<LocalDateTime> listeTempsDatesSaisis = new ArrayList<LocalDateTime>();
	private Scanner scanner = new Scanner (System.in);

	public static void main(String[] args) {
		
		Application app = new Application();
		app.ajouterDates();
		app.ajouterTemps();
		app.ajouterTpsDates();
		app.runApp();					
		
		
	}

	
	public void runApp() {
		
		int choix = 0;				
		
		System.out.println("----------------- Bienvenue -----------------");
		while (choix != 7) {
			
			System.out.println("\t1. Saisir une date");
			System.out.println("\t2. Saisir un temps");
			System.out.println("\t3. Saisir un temps et une date");
			System.out.println("\t4. Afficher les éléments saisis");
			System.out.println("\t5. Afficher le temps écoulé entre deux dates");
			System.out.println("\t6. Afficher le temps écoulé entre deux temps");
			System.out.println("\t7. Quitter");
			System.out.println("----------------------------------------------");
			System.out.println("Que souhaitez-vous faire? :");
			choix = scanner.nextInt();
			
			
			switch(choix) {
			case 1: 
				
				System.out.println("Saisir une date");
				System.out.println("Saisir le jour: ");
				int day = 0;
				int month = 0;
				int year = 0;
				day = scanner.nextInt();
				System.out.println("Saisir le mois (format MM): ");
				month = scanner.nextInt();
				System.out.println("Saisir l'année (format AAAA): ");
				year = scanner.nextInt();
				
				LocalDate dateSaisie = LocalDate.of (year, month, day);
				
				listeDatesSaisies.add(dateSaisie);
								
				break;
				
			case 2:
				
				System.out.println("Saisir un temps");
				
				System.out.println("Saisir l'heure: ");
				int hour = 0;
				int min = 0;
				int sec = 0;
				hour = scanner.nextInt();
				System.out.println("Saisir les minutes: ");
				min = scanner.nextInt();
				System.out.println("Saisir les secondes: ");
				sec = scanner.nextInt();
				
				LocalTime tempsSaisi = LocalTime.of (hour, min, sec);
				
				listeTempsSaisis.add(tempsSaisi);
				
				break;
				
			case 3:
				System.out.println("Saisir un temps et une date");
				
				System.out.println("Saisir le jour: ");
				day = scanner.nextInt();
				
				System.out.println("Saisir le mois (format MM): ");
				month = scanner.nextInt();
				
				System.out.println("Saisir l'année (format AAAA): ");
				year = scanner.nextInt();
				
				System.out.println("Saisir l'heure: ");
				hour = scanner.nextInt();
				
				System.out.println("Saisir les minutes: ");
				min= scanner.nextInt();
				
				System.out.println("Saisir les secondes: ");
				sec = scanner.nextInt();
				
				LocalDateTime tempsDateSaisi = LocalDateTime.of (year, month, day, hour, min, sec);
				
				listeTempsDatesSaisis.add(tempsDateSaisi);				
				
				break;
				
				
			case 4:
				
				menuAffichage();
				break;
				
			case 5:
				deltaDates();
				break;
				
			case 6:
				deltaTemps();
				break;
				
			case 7:
				System.out.println("Fermeture de l'application");
				break;
			default:
				System.out.println("Je n'ai pas compris la requete");
				break;
			}
		}
		scanner.close();
		
		
		
		
	}
	
	
	public void ajouterDates() {
		LocalDate currentDate = LocalDate.now();
		LocalDate date1 = currentDate.withDayOfMonth(28).withYear(2013).withMonth(1);
		LocalDate date2 = currentDate.withDayOfMonth(15).withYear(2015).withMonth(3);
		LocalDate date3 = currentDate.withDayOfMonth(01).withYear(1999).withMonth(6);
		LocalDate date4 = currentDate.withDayOfMonth(11).withYear(1994).withMonth(11);
		LocalDate date5 = currentDate.withDayOfMonth(19).withYear(2019).withMonth(6);
		LocalDate date6 = currentDate.withDayOfMonth(4).withYear(2005).withMonth(4);
		LocalDate date7 = currentDate.withDayOfMonth(14).withYear(2013).withMonth(7);
		listeDatesSaisies.add(date1);
		listeDatesSaisies.add(date2);
		listeDatesSaisies.add(date3);
		listeDatesSaisies.add(date4);
		listeDatesSaisies.add(date5);
		listeDatesSaisies.add(date6);
		listeDatesSaisies.add(date7);
		
	}

	public void ajouterTemps() {
		LocalTime currentTime = LocalTime.now();
		LocalTime tps1 = currentTime.withHour(12).withMinute(13).withSecond(10);
		LocalTime tps2 = currentTime.withHour(2).withMinute(31).withSecond(7);
		LocalTime tps3 = currentTime.withHour(9).withMinute(45).withSecond(20);
		LocalTime tps4 = currentTime.withHour(21).withMinute(6).withSecond(34);
		LocalTime tps5 = currentTime.withHour(15).withMinute(23).withSecond(47);
		LocalTime tps6 = currentTime.withHour(10).withMinute(58).withSecond(56);
		listeTempsSaisis.add(tps1);
		listeTempsSaisis.add(tps2);
		listeTempsSaisis.add(tps3);
		listeTempsSaisis.add(tps4);
		listeTempsSaisis.add(tps5);
		listeTempsSaisis.add(tps6);
	}
	
	public void ajouterTpsDates() {
	
		LocalDateTime dateTime1 = LocalDateTime.of(2015, 11, 6, 14, 56, 35);
		LocalDateTime dateTime2 = LocalDateTime.of(1997, 5, 16, 8, 45, 16);
		LocalDateTime dateTime3 = LocalDateTime.of(1987, 1, 12, 6, 24, 5);
		listeTempsDatesSaisis.add(dateTime1);
		listeTempsDatesSaisis.add(dateTime2);
		listeTempsDatesSaisis.add(dateTime3);
	}
	
	public void trierFiltrerDates() {
		
		int choix2 = 0;
		
		while (choix2 != 7) {
			
			System.out.println("\t1. Trier les dates par année");
			System.out.println("\t2. Trier les dates sur le mois");
			System.out.println("\t3. Trier les dates sur le jour");
			System.out.println("\t4. Filtrer les dates par année");
			System.out.println("\t5. Filtrer les dates sur le mois");
			System.out.println("\t6. Filtrer les dates sur le jour");
			System.out.println("\t7. Revenir au menu précédent");
			System.out.println("----------------------------------------------");
			
			System.out.println("Que souhaitez-vous faire? :");
			choix2 = scanner.nextInt();
		
			
			switch(choix2) {
			
			case 1:
				listeDatesSaisies.stream()
					.sorted((d1, d2) -> d1.getYear() - (d2.getYear()))
					.forEach(System.out::println);
				break;
			case 2:
				listeDatesSaisies.stream()
				.sorted((d1, d2) -> d1.getMonth().compareTo(d2.getMonth()))
				.forEach(System.out::println);
			break;
			
			case 3:
				listeDatesSaisies.stream()
				.sorted((d1, d2) -> d1.getDayOfMonth() - (d2.getDayOfMonth()))
				.forEach(System.out::println);
			break;
			
			case 4:
				System.out.println("Saisir un filtre (annee): ");
				int filtreUtilisateur = scanner.nextInt();
				List<LocalDate> datesFiltrees = listeDatesSaisies.stream()
					.filter(dateSaisie -> filtreUtilisateur == (dateSaisie.getYear()))
					.collect(Collectors.toList());
				if (!datesFiltrees.isEmpty())
					System.out.println(datesFiltrees + "\n");
				break;
							
			case 5:
				System.out.println("Saisir un filtre (mois): ");
				int filtreUtilisateur2 = scanner.nextInt();
				List<LocalDate> datesFiltrees2 = listeDatesSaisies.stream()
					.filter(dateSaisie -> filtreUtilisateur2 == (dateSaisie.getMonth().getValue()))
					.collect(Collectors.toList());
				if (!datesFiltrees2.isEmpty())
					System.out.println(datesFiltrees2 + "\n");
				
			break;
			
			case 6:
				System.out.println("Saisir un filtre (jour): ");
				int filtreUtilisateur3 = scanner.nextInt();
				List<LocalDate> datesFiltrees3 = listeDatesSaisies.stream()
					.filter(dateSaisie -> filtreUtilisateur3 == (dateSaisie.getDayOfMonth()))
					.collect(Collectors.toList());
				if (!datesFiltrees3.isEmpty())
					System.out.println(datesFiltrees3 + "\n");
				
			break;
			
			default:
				System.out.println("Je n'ai pas compris la requete");
				break;
			}
		}
	}

	
	public void trierFiltrerTemps() {
		int choix = 0;
		
		while (choix != 7) {
			
			System.out.println("\t1. Trier les temps par heure");
			System.out.println("\t2. Trier les temps par minutes");
			System.out.println("\t3. Trier les temps par secondes");
			System.out.println("\t4. Filtrer les temps par heure");
			System.out.println("\t5. Filtrer les temps par minutes");
			System.out.println("\t6. Filtrer les temps par secondes");
			System.out.println("\t7. Revenir au menu précédent");
			System.out.println("----------------------------------------------");
			
			System.out.println("Que souhaitez-vous faire? :");
			choix = scanner.nextInt();
			
			switch(choix) {
			case 1:
				listeTempsSaisis.stream()
					.sorted((d1, d2) -> d1.getHour() - (d2.getHour()))
					.forEach(System.out::println);
				break;
			case 2:
				listeTempsSaisis.stream()
				.sorted((d1, d2) -> d1.getMinute() - (d2.getMinute()))
				.forEach(System.out::println);
			break;
			
			case 3:
				listeTempsSaisis.stream()
				.sorted((d1, d2) -> d1.getSecond() - (d2.getSecond()))
				.forEach(System.out::println);
			break;
			
			case 4:
				System.out.println("Saisir un filtre (heures): ");
				int filtreUtilisateur = scanner.nextInt();
				List<LocalTime> tempsFiltres = listeTempsSaisis.stream()
					.filter(tempsSaisi -> filtreUtilisateur == (tempsSaisi.getHour()))
					.collect(Collectors.toList());
				if (!tempsFiltres.isEmpty())
					System.out.println(tempsFiltres + "\n");
				break;
							
			case 5:
				System.out.println("Saisir un filtre (minutes): ");
				int filtreUtilisateur2 = scanner.nextInt();
				List<LocalTime> tempsFiltres2 = listeTempsSaisis.stream()
					.filter(tempsSaisi -> filtreUtilisateur2 == (tempsSaisi.getMinute()))
					.collect(Collectors.toList());
				if (!tempsFiltres2.isEmpty())
					System.out.println(tempsFiltres2 + "\n");
				break;
				
			
			case 6:
				System.out.println("Saisir un filtre (secondes): ");
				int filtreUtilisateur3 = scanner.nextInt();
				List<LocalTime> tempsFiltres3 = listeTempsSaisis.stream()
					.filter(tempsSaisi -> filtreUtilisateur3 == (tempsSaisi.getSecond()))
					.collect(Collectors.toList());
				if (!tempsFiltres3.isEmpty())
					System.out.println(tempsFiltres3 + "\n");
				break;

			
			default:
				System.out.println("Je n'ai pas compris la requete");
				break;
			}
		}
		
	}
	
	public void trierFiltrerTpsDates() {
		int choix = 0;
		
		while (choix != 7) {
			
			System.out.println("\t1. Trier les dates par année");
			System.out.println("\t2. Trier les dates sur le mois");
			System.out.println("\t3. Trier les dates sur le jour");
			System.out.println("\t4. Trier les temps par heure");
			System.out.println("\t5. Trier les temps par minutes");
			System.out.println("\t6. Trier les temps par secondes");
			System.out.println("\t7. Revenir au menu précédent");
			System.out.println("----------------------------------------------");
			
			System.out.println("Que souhaitez-vous faire? :");
			choix = scanner.nextInt();
			
			switch(choix) {
			case 1:
				listeDatesSaisies.stream()
					.sorted((d1, d2) -> d1.getYear() - (d2.getYear()))
					.forEach(System.out::println);
				break;
			case 2:
				listeDatesSaisies.stream()
				.sorted((d1, d2) -> d1.getMonth().compareTo(d2.getMonth()))
				.forEach(System.out::println);
			break;
			
			case 3:
				listeDatesSaisies.stream()
				.sorted((d1, d2) -> d1.getDayOfMonth() - (d2.getDayOfMonth()))
				.forEach(System.out::println);
			break;
			case 4:
				listeTempsSaisis.stream()
					.sorted((d1, d2) -> d1.getHour() - (d2.getHour()))
					.forEach(System.out::println);
				break;
			case 5:
				listeTempsSaisis.stream()
				.sorted((d1, d2) -> d1.getMinute() - (d2.getMinute()))
				.forEach(System.out::println);
			break;
			
			case 6:
				listeTempsSaisis.stream()
				.sorted((d1, d2) -> d1.getSecond() - (d2.getSecond()))
				.forEach(System.out::println);
			break;
			
			default:
				System.out.println("Je n'ai pas compris la requete");
				break;
			}
		}
	}
	
	public void menuAffichage() {
		
		int choix = 0;
		
		while (choix != 4) {
			
			System.out.println("\t1. Afficher les dates saisies");
			System.out.println("\t2. Afficher les temps saisis");
			System.out.println("\t3. Afficher les temps et les dates saisis");
			System.out.println("\t4. Revenir au menu précédent");
			System.out.println("----------------------------------------------");
			
			System.out.println("Que souhaitez-vous faire? :");
			choix = scanner.nextInt();
			
			switch(choix) {
			
			case 1:
				trierFiltrerDates();				
				break;
				
			case 2:
				trierFiltrerTemps();
				break;
				
			case 3:
				trierFiltrerTpsDates();
				break;	
				
			case 4:
				System.out.println("Retour au menu principal");
				break;
			default:
				System.out.println("Je n'ai pas compris la requete");
				break;
			}
			
			
		}
	}
	
	public void deltaDates() {
		
	
		
		System.out.println(listeDatesSaisies);
		System.out.println("Choisissez deux dates pour lesquelles vous souhaitez calculer la difference");
		
		System.out.println("1ère date: ");
		int date1 = scanner.nextInt();
				
		System.out.println("2ème date: ");
		int date2 = scanner.nextInt();
		
		
		
//		Period period = Period.between(date1, date2);
//		System.out.println(period.toString());
		
		
		
	}
	
	public void deltaTemps () {
		
	}
}
