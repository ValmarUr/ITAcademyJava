/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 2: Nivell 2 Escala
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n2;

import java.util.Scanner;

public class M2_N2_Escala {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introdueix un nombre sencer (escala nombres): ");
		
		int num = sc.nextInt();
		
		System.out.println();
		
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		sc.close();
		
	}

}
