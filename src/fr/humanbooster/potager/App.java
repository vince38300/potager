package fr.humanbooster.potager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.humanbooster.potager.business.Famille;
import fr.humanbooster.potager.business.Graine;
import fr.humanbooster.potager.util.ComparateurDeGrainesSurSemaineMin;

public class App {
	private static ArrayList<Graine> graines = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Famille> familles = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		familles.add(new Famille("aromatique"));
		familles.add(new Famille("légume"));
		familles.add(new Famille("haricot"));
		familles.add(new Famille("fruit"));

		graines.add(new Graine("carotte", 13, 14, 5, 60, familles.get(1)));
		graines.add(new Graine("courgette", 22, 23, 75, 120, familles.get(3)));
		graines.add(new Graine("haricot", 22, 23, 15, 100, familles.get(1)));
		graines.add(new Graine("laitue", 13, 14, 25, 55, familles.get(1)));
		graines.add(new Graine("oignon", 14, 14, 8, 40, familles.get(0)));

		// pour rentrer un float xx.xxf
		graines.add(new Graine("radis", 14, 16, 2.5f, 45, familles.get(2)));
		graines.add(new Graine("tomate", 21, 24, 80, 90, familles.get(3)));
		
		

		// Scanner scan = new Scanner(System.in);
		do {
			afficherMenu();
			int choix = scan.nextInt();
			traiterChoix(choix);
		} while (true);

	}

	public static void afficherMenu() {
		System.out.println("1-Voir la liste des graines triées par semaine de plantation");
		System.out.println("2-Voir la liste des graines triées par catégorie puis sur le nom de la graine");
		System.out.println("3-Connaître ce qu'il est possible de planter en précisant une date, exemple : 07/04/2018");
		System.out.println("4-Ajouter une graine");
		System.out.println("5-Quitter");
	 System.out.println(graines);
	}

	public static void traiterChoix(int choix) {

		switch (choix) {
		case 1:
			 listerGraineTrierParSemaine();
			break;
		case 2:
			 listerGraineTrierParcategorie();
			break;
		case 3:
			// planterALaDate(String dateStr);
			break;
		case 4:
			AjouterGraine();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println(graines);
			break;
		}

	}

	public static void AjouterGraine() {
		
		//declaré en local car si commun plante
		Scanner scan1 = new Scanner(System.in);

		System.out.println("Veuillez saisir le nom de la graine");
		String nomGraine = scan1.nextLine();
		System.out.println("Veuillez saisir la semaine de plantation min ");
		int semaineMin = Integer.parseInt(scan1.nextLine());
		System.out.println("Veuillez saisir la semaine de plantation max ");
		int semaineMax = Integer.parseInt(scan1.nextLine());
		System.out.println("Veuillez saisir l'espace entre les pieds ");
		float espacePied = Float.parseFloat(scan1.nextLine());
		System.out.println("Veuillez saisir l'espace entre les lignes ");
		float espaceLigne = Float.parseFloat(scan1.nextLine());
		
		// affiche liste famille
		for (Famille familles : familles) {
			System.out.println("famille " + familles.getNom() + " sont Id est " + familles.getId());
		}
		System.out.println("Veuillez saisir le numero de famille ");
		
		int numFamille = Integer.parseInt(scan1.nextLine());
		// recupd nom de la famille pour l'associer
		for (Famille famille : familles) {
			if (famille.getId() == numFamille) {
				graines.add(new Graine(nomGraine, semaineMin, semaineMax, espacePied, espaceLigne, famille));
				break;
			}
		}

	}
	
	// pour comparer il faut creer un package utils 
	//definir l'argument de compraison 
	//affichage d'une erreur 
	//click pour generer la class comparateur 
	//et remplir la class
	
	public static void listerGraineTrierParSemaine(){
		Collections.sort(graines, new ComparateurDeGrainesSurSemaineMin());
	
	}
	
	
	public static void listerGraineTrierParcategorie(){
		Collections.sort(graines, new ComparateurlisterGraineTrierParcategorie());
	System.out.println(graines);
	}
	
}
