/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 3: Nivell 1, Fase 3
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 	
 */

package n1;

public class M3_N1F3 {

	public static void main(String[] args) {
		
		//inicialitzo les variables en ordre alfabètic perquè en l'anterior fase ja ho estaven 
		String[] arrayCiutats = new String[6];
		arrayCiutats[0] = "Barcelona";
		arrayCiutats[1] = "Berlin";
		arrayCiutats[2] = "Lisboa";
		arrayCiutats[3] = "Madrid";
		arrayCiutats[4] = "Napoles";
		arrayCiutats[5] = "Roma";
		
		String[] arrayCiutatsModificades = new String[arrayCiutats.length];
	
		
		System.out.println("Ciutats modificades per ordre alfabètic:");
		
		for(int i = 0; i < arrayCiutats.length; i++){
			
			arrayCiutatsModificades[i] = arrayCiutats[i].replace('a', '4');
			
		}
		
		for(String ciutat : arrayCiutatsModificades) {
			
			System.out.println(ciutat);
		}
		
	}

}
