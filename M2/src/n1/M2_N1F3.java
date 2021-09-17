/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 2: Nivell 1, Fase 3
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

import java.util.HashMap;
import java.util.Map.Entry;

public class M2_N1F3 {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] nom = {'J','u','a','n',' ','E','m','i','l','i','o'};
		
		
		for(int i = 0; i < nom.length; i++) {
			
			int counter = 0;
			
			for(int j = 0; j < nom.length; j++) {
				
				if(nom[i] == nom[j]) {
					counter++;
				}
			}
			
			System.out.print(nom[i]);
			map.put(nom[i], counter);
		}
		
		System.out.println();
		
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			char key = entry.getKey();
			int value = entry.getValue();
			System.out.println("clau='" + key + "', valor=" + value);
			
		}
		
	}

}
