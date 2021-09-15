package n1;

public class N1F3 {

	public static void main(String[] args) {
		
		int anyNaix = 1987;
		boolean esDeTraspas = false;
		
		if((anyNaix % 4 == 0 && anyNaix % 100 != 0) || (anyNaix % 100 == 0 && anyNaix % 400 == 0)) {
				
				esDeTraspas = true;	
				
		}
		
		String strCert = "L'any " + anyNaix + " és de traspàs.";
		String strFals = "L'any " + anyNaix + " no és de traspàs.";

		
		if(esDeTraspas) {
			
			System.out.println(strCert);
			
		} else {
			
			System.out.println(strFals);
			
		}
		
	}

}
