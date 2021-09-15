package n3;

import java.util.Arrays;

public class N3 {

	public static void main(String[] args) {
		
		//array inicial
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(Arrays.toString(array));
		
		//rotar array com a la imatge d'exemple
		int temp = array[array.length-1];
		
		for(int i = array.length-1; i > 0 ; i--) {
			
			array[i] = array[i-1];
		}
		
		array[0] = temp;
		
		//array resultant
		System.out.println(Arrays.toString(array));
		
		System.out.println();
		

		//array inicial
		int[] array2 = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(Arrays.toString(array2));
		
		//invertir array
		for(int i = 0; i < array2.length/2; i++) {
			
			temp = array2[i];
			array2[i] = array2[array2.length - 1 - i];
			array2[array2.length - 1 - i] = temp;
			
		}
		
		//array resultant
		System.out.println(Arrays.toString(array2));
		
	}

}
