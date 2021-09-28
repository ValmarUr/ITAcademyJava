package n3;

public class RevisioTipusException extends Exception{
	
	/*Excepció referent a la revisió de tipus integer: 
			ha de ser un valor positiu.*/
	
	public RevisioTipusException() {
		
	}
	
	public RevisioTipusException(String missatgeError) {
		
		super(missatgeError);
	}

}
