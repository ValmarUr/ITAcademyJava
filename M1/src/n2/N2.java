package n2;

public class N2 {

	public static void main(String[] args) {
		
		double varDouble = 3.1416;
		int varInt = (int)varDouble;
		float varFloat = (float)varDouble;
		String varString = Double.toString(varDouble); 
		
		System.out.println(varDouble + " double\n" +
							varInt + " int\n" +
							varFloat + " float\n" +
							varString + " string");
		
	}

}
