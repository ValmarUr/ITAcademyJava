/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 3: Nivell 1, Fase 2
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

import java.util.Arrays;

public class M3_N1F2 {

	public static void main(String[] args) {
		
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		ciutat1 = "Berlin";
		ciutat2 = "Madrid";
		ciutat3 = "Lisboa";
		ciutat4 = "Barcelona";
		ciutat5 = "Roma";
		ciutat6 = "Napoles";
		
		String[] arrayCiutats = new String[6];
		arrayCiutats[0] = ciutat1;
		arrayCiutats[1] = ciutat2;
		arrayCiutats[2] = ciutat3;
		arrayCiutats[3] = ciutat4;
		arrayCiutats[4] = ciutat5;
		arrayCiutats[5] = ciutat6;
		
		
		System.out.println("Ciutats per ordre alfabètic");
		
		
		Arrays.sort(arrayCiutats);
		
		for(String ciutat : arrayCiutats) {
			
			System.out.println(ciutat);
			
		}
	
	}

}
