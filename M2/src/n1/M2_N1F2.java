/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 2: Nivell 1, Fase 2
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

import java.util.ArrayList;

public class M2_N1F2 {

	public static void main(String[] args) {
		
		ArrayList<Character> llista = new ArrayList<Character>();
		llista.add('j');
		llista.add('u');
		llista.add('a');
		llista.add('n');
		llista.add(' ');
		llista.add('e');
		llista.add('m');
		llista.add('i');
		llista.add('l');
		llista.add('1'); //escrit malament per demostrar el resultat en cas d'error
		llista.add('o');
		
		
		for(int i = 0; i < llista.size(); i++) {
			
			char ch = llista.get(i);
			
			System.out.print(ch);
			
			
			if(ch >= 'a' && ch <= 'z') {
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u') {
					
					System.out.print(" VOCAL");
					
				} else {
					
					System.out.print(" CONSONANT");
					
				}
				
			}else if(ch >= '0' && ch <= '9') {
				
				System.out.print(" Els noms de persones no contenen números!");
				
			}
			
			System.out.println();
		}//end for
		
	}

}
