/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 3: Nivell 1, Fase 4
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

public class M3_N1F4 {

	public static void main(String[] args) {
		
		String strBarcelona = "Barcelona";
		String strBerlin = "Berlin";
		String strLisboa = "Lisboa";
		String strMadrid = "Madrid";
		String strNapoles = "Napoles";
		String strRoma = "Roma";
		
		
		char[] barcelona = new char[strBarcelona.length()];
		char[] berlin = new char[strBerlin.length()];
		char[] lisboa = new char[strLisboa.length()];
		char[] madrid = new char[strMadrid.length()];
		char[] napoles = new char[strNapoles.length()];
		char[] roma = new char[strRoma.length()];
		
		//omplint arrays lletra per lletra
		stringToCharArray(strBarcelona, barcelona);
		stringToCharArray(strBerlin, berlin);
		stringToCharArray(strLisboa, lisboa);
		stringToCharArray(strMadrid, madrid);
		stringToCharArray(strNapoles, napoles);
		stringToCharArray(strRoma, roma);
		

		System.out.println("Ciutats amb els noms invertits:");
		
		//mostrant per consola els arrays invertits
		mirrorPrint(barcelona);
		mirrorPrint(berlin);
		mirrorPrint(lisboa);
		mirrorPrint(madrid);
		mirrorPrint(napoles);
		mirrorPrint(roma);
		
	}//end main
		
	
	//METODES
	
	public static void stringToCharArray(String str, char[] array){
			
		int strlen = str.length(); //perquè no hagi de fer el càlcul cada iteració
		
		for(int i = 0; i < strlen; i++) { 
			
			array[i] = str.charAt(i); 
			
		}
			
	}
	
	public static void mirrorPrint(char[] array){
		
		for(char ch : array) { System.out.print(ch); }
		
		System.out.print(" - ");

		for(int i = array.length-1; i >= 0; i--) { System.out.print(array[i]); }
		
		System.out.println();
		
	}

}
