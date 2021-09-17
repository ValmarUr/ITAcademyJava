/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 2: Nivell 1, Fase 4
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

import java.util.ArrayList;

public class M2_N1F4 {

	public static void main(String[] args) {
		
		ArrayList<Character> nom = new ArrayList<Character>();
		nom.add('J');
		nom.add('U');
		nom.add('A');
		nom.add('N');
		nom.add(' ');
		nom.add('E');
		nom.add('M');
		nom.add('I');
		nom.add('L');
		nom.add('I');
		nom.add('O');
		
		ArrayList<Character> cognom = new ArrayList<Character>();
		cognom.add('F');
		cognom.add('E');
		cognom.add('R');
		cognom.add('N');
		cognom.add('A');
		cognom.add('N');
		cognom.add('D');
		cognom.add('E');
		cognom.add('Z');
		
		ArrayList<Character> fullName = new ArrayList<Character>();
		fullName.addAll(nom);
		fullName.add(' ');
		fullName.addAll(cognom);
		
		nom.clear();
		cognom.clear();
		
		System.out.println(fullName);
		
	}

}
