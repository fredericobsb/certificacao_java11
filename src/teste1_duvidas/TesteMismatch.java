package teste1_duvidas;

import java.util.Arrays;

public class TesteMismatch {

	public static void main(String[] args) {
		char[] c1 = {'T','A','L','L'}; 
		char[] c2 = {'T','A','L','K'};
		System.out.println(Arrays.mismatch(c1, c2));
		System.out.println(Arrays.compare(c1, c2));
		System.out.println(Arrays.mismatch(c1, c2) * Arrays.compare(c1, c2));
		
		//Treino de mismatch
		char[] c3 = {'a','b','c','d','e','f','g'};
		char[] c4 = {'a','b','c','d','e','f','g','h'};
		
		System.out.println(Arrays.mismatch(c3, c4));
		System.out.println(Arrays.compare(c3,c4));
		System.out.println(Arrays.compare(c4,c3));
	}

}
