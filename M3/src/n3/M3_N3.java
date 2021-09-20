/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 3: Nivell 3
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n3;

import java.util.Scanner;
import java.util.ArrayList;

public class M3_N3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Seqüència de Fibonacci fins número: ");
		
		int limit = sc.nextInt();	
		
		sc.close();
		
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		
		fibonacci.add(0);		
		fibonacci.add(1);
		
		int i = 0;
		
		while(fibonacci.get(i) < limit) {
			
			if(fibonacci.size() == i + 1) {
				
				fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i));
			}
			
			System.out.print(fibonacci.get(i) + " ");
			i++;
			
		}
		
		//print número límit si coincideix amb algun de la seqüència
		if(fibonacci.get(i) == limit) {
			
			//en cas de coincidir l'1, codi per poder activar el segon 1 de la seqüència
			if(limit == 1) {
				System.out.print(fibonacci.get(i) + " ");
			}
			
			System.out.println(fibonacci.get(i));
			
		}
	
	}

}
