/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 3: Nivell 2
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n2;

import java.util.Scanner;

public class M3_N2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arrayNotes = new int[5][3];
		
		for(int i = 0; i < arrayNotes.length; i++) {
			
			for(int j = 0; j < arrayNotes[i].length; j++) {
				
				System.out.print("Introdueix la nota " + (i+1) + " de l'alumne " + (j+1) + ": ");
				
				int temp = sc.nextInt();
				
				if(temp < 0 || temp > 10) {
					
					System.out.println("Les notes són del 0 al 10!");
					j--;
					continue;
					
				}else {
					
					arrayNotes[i][j] = temp;
							
				}
			
			}//end for-j
			
		}//end for-i
		
		sc.close();
		
		for(int i = 0; i < arrayNotes.length; i++) {
			
			System.out.println("L'alumne " + (i+1) + mitjanaNotes(arrayNotes[i]));
			
		}
		
		
	}//end main
	
	public static String mitjanaNotes(int[] array) {
		
		double resultat = 0.0;
		
		for(int nota : array) {
			
			resultat += nota;
			
		}
		
		resultat /= 3;
		
		if(resultat < 5) {
			
			return " ha suspés amb un " + resultat;
			
		} else {
			
			return " ha aprovat amb un " + resultat;
			
		}
		
	}

}
