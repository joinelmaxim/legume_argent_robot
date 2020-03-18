package com.joinel.test2.adneom.nombre.premier.addition;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		int n = 0;
		int resultat = 0;
		boolean accord = true;
		String reponse = "";
		while (accord) {
			while (n <= 0) {
				try {
					System.out.println(" Veuillez entrer le nombre de nombres premiers que vous voulez additioner");
					Scanner sc = new Scanner(System.in);
					n = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Vous n'avez pas respecté les conditions");
					n = 0;
				}
			}
			App ap = new App();
			resultat = ap.somme_nombre_premiers(n);

			System.out.println(" La somme des " + n + " nombres premiers vaut " + resultat);
			n = 0;

			try {
				while (true) {
					System.out.println("Veuillez indiquer si vous voulez continuer [y/n]");
					Scanner sc1 = new Scanner(System.in);
					reponse = sc1.nextLine();
					if (reponse.toLowerCase().equals("n")) {
						accord = false;
						System.out.println("Fin du programme");
						break;
					}
					if (reponse.toLowerCase().equals("y")) {
						break;
					}else {
						System.out.println(" Veuillez indiquer y ou n");
					}
				}
				reponse = "";
			} catch (Exception e) {
				System.out.println(" Erreur, veuillez recommencer ");
			}
		}

	}

	public int somme_nombre_premiers(int n) {
		int SOM = 0;
		int compteur = 0;
		int iteration = 2;
		App ap = new App();
		if (n <= 0) {
			System.out.println("Les conditions ne sont pas bonnes, veuillez entrer un nombre > 0");
		} else {

			while (true) {
				if (ap.test_nombre_premiers_stream(iteration)) {
					SOM += iteration;
					compteur++;
					if (compteur == n) {
						break;
					}
				}
				iteration++;
			}
		}
		return SOM;
	}

	public boolean test_nombre_premiers(int nombre_a_tester) {
		int iteration = 1;
		boolean reponse = true;
		int resultat_operations = 0;
		if (nombre_a_tester > 1) {
			while (iteration < nombre_a_tester) {
				try {
					resultat_operations = (nombre_a_tester) % (iteration);
					if (iteration != 1 && iteration != nombre_a_tester && resultat_operations == 0) {
						reponse = false;
						break;
					}
				} catch (Exception e) {
					if (iteration < nombre_a_tester) {
					} else {
						break;
					}
				}
				iteration++;
			}
		} else {
		}
		return reponse;
	}
	
	public boolean test_nombre_premiers_stream(int nombre_a_tester) {
		boolean reponse = true;;
		long compteur_de_multiples = 0;
		
		
		if (nombre_a_tester > 1) {
			
			compteur_de_multiples = IntStream.iterate(1, ee -> ee+1).limit(nombre_a_tester).filter(ee -> nombre_a_tester%ee == 0 && ee !=1 && ee != nombre_a_tester).count();
			if(compteur_de_multiples > 0) {
				reponse = false;
			}
		}else {
			reponse = false;
		}
		return reponse;
	}

}
