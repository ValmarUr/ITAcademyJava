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
		
		//demanar menjar al client
		ArrayList<String> comanda = new ArrayList<String>();
		
		prendreComanda(comanda);

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
			
			System.out.println("\nQue vols menjar?");
			
			String triaPlat = sc.nextLine();
			
			llista.add(triaPlat);
			
			System.out.println("Vols seguir demanant? 1:Si/0:No");
			
			seguirDemanant = sc.nextInt();
			
			sc.nextLine(); //problema típic amb classe Scanner
			
		}while(seguirDemanant == 1);
		
		sc.close();
		
	}

}
