/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 3: Nivell 1, Fase 1
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

import java.util.Scanner;

public class M3_N1F1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		
		System.out.println("Introdueix el nom de 6 ciutats:");
		
		ciutat1 = sc.nextLine();
		ciutat2 = sc.nextLine();
		ciutat3 = sc.nextLine();
		ciutat4 = sc.nextLine();
		ciutat5 = sc.nextLine();
		ciutat6 = sc.nextLine();
		
		System.out.println(ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + ciutat4 +", " + ciutat5 + ", " + ciutat6);
		
		sc.close();
		
	}

}
