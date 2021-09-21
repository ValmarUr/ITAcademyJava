/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 4: Nivell 1 Fase 2
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.ArrayList;

public class M4_N1F2 {

	public static void main(String[] args) {
		
		int moneda1€ = 1;
		int moneda2€ = 2;
		int bitllet5€ = 5;
		int bitllet10€ = 10;
		int bitllet20€ = 20;
		int bitllet50€ = 50;
		int bitllet100€ = 100;
		int bitllet200€ = 200;
		int bitllet500€ = 500;
		int preuTotal = 0;
		
		String[] plats = new String[10];
		int[] preus = new int[10];
		
		HashMap<String, Integer> preuPlat = new HashMap<String, Integer>();
		
		preuPlat.put("Bufalina", 12);
		preuPlat.put("4 Formaggi", 12);
		preuPlat.put("Pino Daniele", 18);
		preuPlat.put("Margherita", 9);
		preuPlat.put("Prosciutto", 10);
		preuPlat.put("Parmiggiana", 11);
		preuPlat.put("Al Tonno", 13);
		preuPlat.put("Carbonara", 11);
		preuPlat.put("Massimo Troise", 17);
		preuPlat.put("Ortolana", 12);
		
		int counter = 0;
		
		for(Entry<String, Integer> entry : preuPlat.entrySet()) {
			
			plats[counter] = entry.getKey();
			preus[counter] = entry.getValue();
			counter++;
			
		}
		
		System.out.println("-------MENÚ-------");
		
		for(int i = 0; i < plats.length; i++) {
			
			System.out.println("· " + plats[i] + " = " + preus[i] + "€");
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> comanda = new ArrayList<String>();
		
		do {
			
			System.out.println("Que vols menjar?");
			
			
			
			
		}while(1);
		
		
	}

}
