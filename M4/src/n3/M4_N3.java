/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 4: Nivell 3
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class M4_N3 {
	
	private static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
				
		//FASE 1
		int m1, m2, b5, b10, b20, b50, b100, b200, b500;
		int preuTotal = 0;
		
		String[] plats = new String[10];
		int[] preus = new int[10];
		
		//FASE 2
		omplirMenu(plats, preus);//omplir menú demanant les dades a l'usuari
		
		
		//mostrar els arrays en forma de menú
		System.out.println("\n-------MENÚ-------"); 
		
		for(int i = 0; i < plats.length; i++) {
			
			System.out.println("· " + plats[i] + " = " + preus[i] + "€");
			
		}
		System.out.println();
		
		//demanar menjar al client
		ArrayList<String> comanda = new ArrayList<String>();
		
		
		//NIVELL 2
		boolean seguirDemanant = false;
		
		do {
			
			System.out.println("Que vols menjar?");
			
			String triaPlat = sc.nextLine();
			
			//verificant que el plat demanat existeixi, executant una excepció en cas contrari
			try {
				verificarPlat(plats, triaPlat, comanda);
			}catch(PlatInexistentException e) {
				System.out.println("--El plat no existeix--");
				//e.printStackTrace();
			}
			
			
			//verificant si la resposta a "seguir demanant" és correcta
			boolean respostaOK = false; 
			
			while(!respostaOK) {
				
				System.out.println("Vols seguir demanant? Si/No");
				
				try {
					seguirDemanant = verificarSiNo(sc.nextLine());
					respostaOK = true;
				}catch (Exception e) {
					
					System.out.println("--Resposta incorrecta! Escriu (si) o (no)--");
				}
			}
			
			System.out.println();
			
		}while(seguirDemanant);
		
		sc.close();
		
		
		//FASE 3
		for(String str : comanda) {
			
			boolean coincideix = false;
			
			for(int i = 0; i < plats.length; i++) {
				
				if(str.equalsIgnoreCase(plats[i])) {
					
					preuTotal += preus[i];
					coincideix = true;
					break;
				}
			}
			
			if(!coincideix) {
				System.out.println("\"" + str + "\" no existeix.");
			}
		}
		
		System.out.println("Preu total de la comanda: " + preuTotal + "€");
		
		if(preuTotal >= 500) {
			b500 = preuTotal/500;
			System.out.println(b500 + (b500>1?" bitllets":" bitllet") + " de 500 ");
			preuTotal %= 500;
		}
		if(preuTotal >= 200) {
			b200 = preuTotal/200;
			System.out.println(b200 + (b200>1?" bitllets":" bitllet") + " de 200 ");
			preuTotal %= 200;
		}
		if(preuTotal >= 100) {
			b100 = preuTotal/100;
			System.out.println(b100 + (b100>1?" bitllets":" bitllet") + " de 100 ");
			preuTotal %= 100;
		}
		if(preuTotal >= 50) {
			b50 = preuTotal/50;
			System.out.println(b50 + (b50>1?" bitllets":" bitllet") + " de 50 ");
			preuTotal %= 50;
		}
		if(preuTotal >= 20) {
			b20 = preuTotal/20;
			System.out.println(b20 + (b20>1?" bitllets":" bitllet") + " de 20 ");
			preuTotal %= 20;
		}
		if(preuTotal >= 10) {
			b10 = preuTotal/10;
			System.out.println(b10 + (b10>1?" bitllets":" bitllet") + " de 10 ");
			preuTotal %= 10;
		}
		if(preuTotal >= 5) {
			b5 = preuTotal/5;
			System.out.println(b5 + (b5>1?" bitllets":" bitllet") + " de 5 ");
			preuTotal %= 5;
		}
		if(preuTotal >= 2) {
			m2 = preuTotal/2;
			System.out.println(m2 + (m2>1?" monedes":" moneda") +" de 2 ");
			preuTotal %= 2;
		}
		if(preuTotal >= 1) {
			m1 = preuTotal/1;
			System.out.println(m1 + (m1>1?" monedes":" moneda") +" de 1 ");
			preuTotal %= 1;
		}		

	}//end main
	
	
	//MÈTODES
	public static void omplirMenu(String[] plats, int[] preus) {
		
		for(int i = 0; i < plats.length; i++) {
						
			demanarPlat(plats, i);
			demanarPreu(plats, preus, i);

		}
		
	}//end omplirMenu
	
	public static void demanarPlat(String[] plats, int index) {
		
		String plat = "";
		
		do {
			
			System.out.print("Introduiu plat nº" + (index+1) + ": ");
			plat = sc.nextLine();
			
			//verificar si el nom del plat es repeteix a l'array
			try {
				for(int i = 0; i < index; i++) {
						if (plats[i].equals(plat)){
							throw new IntroduccioPlatException("El nom dels plats no es pot repetir");
						}
				}
			}catch(IntroduccioPlatException e) {
				System.err.println(e.getMessage());
				continue;
			}
			
			//verificar si el nom del plat no és massa curt
			try {
				if(plat.length() <= 3) {
					throw new IntroduccioPlatException("El nom dels plats ha de tenir més de 3 caràcters per ser vàlid");
				}else {
					break;//sortida del while loop
				}
			}catch(IntroduccioPlatException e) {
				System.err.println(e.getMessage());
			}
			
		}while(true);
		
		plats[index] = plat;
		
	}//end demanarPlat
	
	public static void demanarPreu(String[] plats, int[] preus, int index) {
		
		boolean correcte = false;
		int preu = 0;
		
		do {
			
			System.out.print("Preu " + plats[index] + "? ");
			
			//verificar que l'input sigui un nombre enter
			try {
				preu = sc.nextInt();
				correcte = true;
				sc.nextLine();//problema típic amb classe Scanner
			}catch(InputMismatchException e) {				
				System.err.println("Introdueix un nombre enter");
				sc.nextLine();//problema típic amb classe Scanner
				continue;
			}

			//verificar que el preu tingui un valor positiu 
			try {
				if(preu <= 0) {
					throw new RevisioTipusException("El preu d'un plat mai podrà ser negatiu o zero.");	
				}
			}catch (RevisioTipusException e) {
				System.err.println(e.getMessage());
				correcte = false;
			}
			
		}while(!correcte);
		
		preus[index] = preu;
	}
	
	public static void verificarPlat(String[] menu, String triaPlat, ArrayList<String> comanda) throws PlatInexistentException {
		
		for(String plat : menu) {
			
			if(plat.equalsIgnoreCase(triaPlat)) {
				
				comanda.add(triaPlat);
				return;
			}
			
		}
		
		throw new PlatInexistentException("El plat demanat no existeix al menú.");
		
	}//end verificarPlat
	
	
	public static boolean verificarSiNo(String resposta) throws Exception {
		
		if(resposta.equalsIgnoreCase("si")) {
			return true;
			
		}else if(resposta.equalsIgnoreCase("no")) {
			return false;
			
		}else {
			throw new Exception();
			
		}	
	}//end verificarSiNo
	
}