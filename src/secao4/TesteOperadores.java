package secao4;

public class TesteOperadores {

	public static void main(String[] args) {
		int number  = 10;
		int result = 0;
		
		//teste1 - resultado é sempre zero
		for(int i = 10; i <= 50; i += 10) {
			number = i;
			result = --number - number--;
			System.out.println("i = " + i + ", number = " + number + ", result = " + result);
		}
		
		//teste2 - resultado é sempre 2
		for(int i = 10; i <= 50; i += 10) {
			number = i;
			result = number-- - --number;
			System.out.println("i = " + i + ", number = " + number + ", result = " + result);
		}

	}

}
