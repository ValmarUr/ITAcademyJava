/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 1: Nivell 1, Fase 4
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n1;

public class N1F4 {

	public static void main(String[] args) {
		
		//part nom
		String nom = "Lionel";
		String cognom1 = "Messi";
		String cognom2 = "Cuccittini";
		
		String nomComplet = nom + " " + cognom1 + " " + cognom2;
		
		//part data
		int dia = 24;
		int mes = 6;
		int any = 1987;
		
		String dataNaixement = dia + "/" + mes + "/" + any;
		
		//part traspàs
		boolean esDeTraspas = false;
		
		if((any % 4 == 0 && any % 100 != 0) || (any % 100 == 0 && any % 400 == 0)) {
				esDeTraspas = true;	

		}
		
		String strCert = "L'any " + any + " és de traspàs.";
		String strFals = "L'any " + any + " no és de traspàs.";

		
		//mostrar a la consola
		System.out.println("El meu nom és " + nomComplet);
		System.out.println("Vaig néixer el " + dataNaixement);
		if(esDeTraspas) {
			System.out.println(strCert);
			
		} else {
			System.out.println(strFals);
			
		}

	}

}
