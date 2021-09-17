/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 2: Nivell 2 Piràmide
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n2;

import java.util.Scanner;

public class M2_N2_Piramide {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introdueix un nombre sencer (piràmide invertida): ");
		
		int num = sc.nextInt();
		
		System.out.println();
		
		
		for(int i = 0; i < num; i++) {
			
			for(int j = i; j > 0; j--) {
				
				System.out.print(" ");
			}
			
			for(int k = (num-i)*2; k > 1; k--) {
				
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		sc.close();
		
	}

}
