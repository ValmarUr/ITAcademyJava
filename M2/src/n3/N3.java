package n3;

public class N3 {

	public static void main(String[] args) {
		
		int hour = 0, minutes = 0, seconds = 0;
		
		while(true) {
			
			try {
				Thread.sleep(50);
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
			
			//System.out.println(hour + ":" + minutes + ":" + seconds);
			System.out.printf("%02d:%02d:%02d\n", hour, minutes, seconds);
			
			seconds++;
		}
		
	}

}
