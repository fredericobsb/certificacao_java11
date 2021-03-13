package teste1_duvidas;

import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
		//APRENDENDO COMPARE
		int [] array1 = {100};//,200,300,400,500
		int [] array2 = {100, 200, 300,400, 500};
		System.out.println(Arrays.compare(array1, array2));//imprime -4 (ta faltando 4 no array1)
		System.out.println(Arrays.compare(array2, array1));//imprime 4   (ta sobrando 4 no array2)
		
		int [] array3 = {100,200};
		System.out.println(Arrays.compare(array3, array2));//imprime -3
		System.out.println(Arrays.compare(array2, array3));//imprime 3
		
		int [] array4 = {100,200,300};
		System.out.println(Arrays.compare(array4, array2));//imprime -2
		System.out.println(Arrays.compare(array2, array4));//imprime 2
		
		int [] array5 = {100,200,300, 400};
		System.out.println(Arrays.compare(array5, array2));//imprime -1
		System.out.println(Arrays.compare(array2, array5));//imprime 1
		
		int [] array6 = {100,200,300, 400, 500};
		System.out.println(Arrays.compare(array6, array2));//imprime 0
		System.out.println(Arrays.compare(array2, array6));//imprime 0
		
		String [] b = {"A", "B", "C"};
		String [] c = {"A"};
		System.out.println(Arrays.compare(b, c));//imprime 2
		System.out.println(Arrays.compare(c, b));//imprime -2
		
		int [] arrayVazio = {};
		int [] arrayDois = {100, 200};
		System.out.println(Arrays.compare(arrayVazio, arrayDois));//imprime -2
		System.out.println(Arrays.compare(arrayDois, arrayVazio));//imprime 2
		
		System.out.println(Arrays.mismatch(arrayVazio, arrayDois));//imprime 0
		System.out.println(Arrays.mismatch(arrayDois, arrayVazio));//imprime 0
		
		int [] arrayEraVazio = {100};
		System.out.println(Arrays.mismatch(arrayEraVazio, arrayDois));//imprime 1
		System.out.println(Arrays.mismatch(arrayDois, arrayEraVazio));//imprime 1
		
		int [] arrayCheio = {100, 200};
		System.out.println(Arrays.mismatch(arrayCheio, arrayDois));//imprime -1
		System.out.println(Arrays.mismatch(arrayDois, arrayCheio));//imprime -1
	}

}
