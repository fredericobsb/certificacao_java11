package teste1_duvidas;

public class VarPalavra {

	public static void main(String[] args) {
		
		//Variable must provide either dimension expressions or an array initializer
		var arr0 = new int[];
		
		var arr1 = new int[] {10};
		
		var arr2 = new String [][] {};
		
		var arr3 = new char[][] {{}};
		
		//Array initializer needs an explicit target-type
		var arr4 = {10, 20, 30}; 
		
		var arr5 = new int[] {10, 20, 30}; 
		
		var arr6 = new String [][] {new String[]{"LOOK"}, new String[] {"UP"}};
		
		var arr7 = new int[] {2,3,4};
	}
}
