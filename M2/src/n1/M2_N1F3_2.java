/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 2: Nivell 1, Fase 3
 * 
 * 		Correció: lineas 26 a 39, codi optimitzable
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

import java.util.HashMap;
import java.util.Map.Entry;

public class M2_N1F3_2 {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] nom = {'J','u','a','n',' ','E','m','i','l','i','o'};
		
		
		for(char ch : nom) {
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch) + 1);
				
			}else {
				
				map.put(ch, 1);
				
			}
			
			System.out.print(ch);
			
		}
		
		
		System.out.println();
		
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			char key = entry.getKey();
			int value = entry.getValue();
			System.out.println("clau='" + key + "', valor=" + value);
			
		}
		
	}

}
