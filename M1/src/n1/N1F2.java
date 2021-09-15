/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 1: Nivell 1, Fase 2
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

public class N1F2 {

	public static void main(String[] args) {
		
		final int ANY_INICIAL = 1948;
		int intervalTraspas = 4;
		int anyNaixement = 1986;
		int counter = 0;
		
		System.out.println("Anys de traspàs des de " + ANY_INICIAL + " fins " + anyNaixement + ":");
		
		for(int i = ANY_INICIAL; i <= anyNaixement; i += intervalTraspas) {
			
			if(i % 100 != 0 || (i % 100 == 0 && i % 400 == 0)) {
					
				System.out.print(i + " ");
				counter++;
			}
		}
		
		System.out.println("\n\nNombre d'anys de traspàs des de " + ANY_INICIAL + " fins " + anyNaixement + ": " + counter);
	}

}
