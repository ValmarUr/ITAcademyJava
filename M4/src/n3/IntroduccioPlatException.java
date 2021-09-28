package n3;

public class IntroduccioPlatException extends Exception{
	
	/*Excepció referent a l'introducció del nom del plat: 
			no és pot repetir i ha de tenir més de 3 caràcters.*/
	
	public IntroduccioPlatException() {
		
	}
	
	public IntroduccioPlatException(String missatgeError) {
		
		super(missatgeError);
	}

}
