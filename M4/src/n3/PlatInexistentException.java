package n3;

public class PlatInexistentException extends Exception{

	/*Excepció referent a la revisió de plats de la comanda:
	 		no és pot demanar un plat que no apareix al menú.*/
	
	public PlatInexistentException() {
		
	}
	
	public PlatInexistentException(String missatgeError) {
		
		super(missatgeError);
	}
	
}
