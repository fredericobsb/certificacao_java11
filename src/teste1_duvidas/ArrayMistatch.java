package teste1_duvidas;

import java.util.Arrays;

public class ArrayMistatch {

	public static void main(String[] args) {
		//APRENDENDO MISMATCH
		int [] array1 = {100,200};//,200,300,400,500
		int [] array2 = {100, 200, 300,400, 500};
		
		/* Finds and returns the index of the first mismatch between two intarrays, 
		 * otherwise return -1 if no mismatch is found. */
		System.out.println(Arrays.mismatch(array1, array2));
		
		System.out.println(Arrays.mismatch(array2, array1));

		String [] arrayString1 = {"Alfa","Beta","Charlie","Delta"};
		String [] arrayString2 = {"Alfa","Beta","Charlie"};
		System.out.println(Arrays.mismatch(arrayString1, arrayString2));
		
	}

}
