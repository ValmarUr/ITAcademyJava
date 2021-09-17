/*
 * IT ACADEMY -- Itinerari mentoritzat JAVA
 * 
 * 		MODUL 2: Nivell 3
 * 
 * 		Alumne: Juan Emilio Fernández Reinaldos
 * 
 */

package n3;

public class M2_N3 {

	public static void main(String[] args) {
		
		int hour = 0, minutes = 0, seconds = 0;
		
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (seconds == 60) {
				minutes++;
				seconds = 0;
			}
			if (minutes == 60) {
				hour++;
				minutes = 0;
			}
			if (hour == 24) {
				hour = 0;
			}
			
			
			System.out.printf("%02d:%02d:%02d\n", hour, minutes, seconds);
			
			seconds++;
		}
		
	}

}
