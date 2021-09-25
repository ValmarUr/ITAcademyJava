/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 4: Nivell 2
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class M4_N2 {

public static void main(String[] args) {
		
		//FASE 1
		int m1, m2, b5, b10, b20, b50, b100, b200, b500;
		int preuTotal = 0;
		
		String[] plats = new String[10];
		int[] preus = new int[10];
		
		//FASE 2
		HashMap<String, Integer> preuPlat = new HashMap<String, Integer>();
		
		omplirMap(preuPlat); //diccionari de dades precarregat
		
		//omplir els 2 arrays amb les dades del diccionari
		int counter = 0;
		
		for(Entry<String, Integer> entry : preuPlat.entrySet()) {
			
			plats[counter] = entry.getKey();
			preus[counter] = entry.getValue();
			counter++;	
		}
		
		//mostrar els arrays en forma de menú
		System.out.println("-------MENÚ-------"); 
		
		for(int i = 0; i < plats.length; i++) {
			
			System.out.println("· " + plats[i] + " = " + preus[i] + "€");
			
		}
		System.out.println();
		
		//demanar menjar al client
		ArrayList<String> comanda = new ArrayList<String>();
		
		prendreComanda(comanda);

		
		//FASE 3
		for(String str : comanda) {
			
			boolean coincideix = false;
			
			for(int i = 0; i < plats.length; i++) {
				
				if(str.equalsIgnoreCase(plats[i])) {
					
					preuTotal += preus[i];
					coincideix = true;
					break;
				}
			}
			
			if(!coincideix) {
				System.out.println("\"" + str + "\" no existeix.");
			}
		}
		
		System.out.println("Preu total de la comanda: " + preuTotal + "€");
		
		if(preuTotal >= 500) {
			b500 = preuTotal/500;
			System.out.println(b500 + (b500>1?" bitllets":" bitllet") + " de 500 ");
			preuTotal %= 500;
		}
		if(preuTotal >= 200) {
			b200 = preuTotal/200;
			System.out.println(b200 + (b200>1?" bitllets":" bitllet") + " de 200 ");
			preuTotal %= 200;
		}
		if(preuTotal >= 100) {
			b100 = preuTotal/100;
			System.out.println(b100 + (b100>1?" bitllets":" bitllet") + " de 100 ");
			preuTotal %= 100;
		}
		if(preuTotal >= 50) {
			b50 = preuTotal/50;
			System.out.println(b50 + (b50>1?" bitllets":" bitllet") + " de 50 ");
			preuTotal %= 50;
		}
		if(preuTotal >= 20) {
			b20 = preuTotal/20;
			System.out.println(b20 + (b20>1?" bitllets":" bitllet") + " de 20 ");
			preuTotal %= 20;
		}
		if(preuTotal >= 10) {
			b10 = preuTotal/10;
			System.out.println(b10 + (b10>1?" bitllets":" bitllet") + " de 10 ");
			preuTotal %= 10;
		}
		if(preuTotal >= 5) {
			b5 = preuTotal/5;
			System.out.println(b5 + (b5>1?" bitllets":" bitllet") + " de 5 ");
			preuTotal %= 5;
		}
		if(preuTotal >= 2) {
			m2 = preuTotal/2;
			System.out.println(m2 + (m2>1?" monedes":" moneda") +" de 2 ");
			preuTotal %= 2;
		}
		if(preuTotal >= 1) {
			m1 = preuTotal/1;
			System.out.println(m1 + (m1>1?" monedes":" moneda") +" de 1 ");
			preuTotal %= 1;
		}		

	}//end main
	
	
	//MÈTODES
	public static void omplirMap(HashMap<String, Integer> hm) {
		
		hm.put("Bufalina", 12);
		hm.put("4 Formaggi", 12);
		hm.put("Pino Daniele", 18);
		hm.put("Margherita", 9);
		hm.put("Prosciutto", 10);
		hm.put("Parmiggiana", 11);
		hm.put("Al Tonno", 13);
		hm.put("Carbonara", 11);
		hm.put("Massimo Troise", 17);
		hm.put("Ortolana", 12);
		
	}
	
	public static void prendreComanda(ArrayList<String> llista) {
		
		Scanner sc = new Scanner(System.in);
		
		int seguirDemanant = 0;
		
		do {
			
			System.out.println("Que vols menjar?");
			
			String triaPlat = sc.nextLine();
			
			llista.add(triaPlat);
			
			System.out.println("Vols seguir demanant? 1:Si/0:No");
			
			seguirDemanant = sc.nextInt();
			
			sc.nextLine(); //problema típic amb classe Scanner
			
			System.out.println();
			
		}while(seguirDemanant == 1);
		
		sc.close();
		
	}//end prendreComanda
	
}