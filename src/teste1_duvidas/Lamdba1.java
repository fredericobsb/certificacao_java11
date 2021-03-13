package teste1_duvidas;

interface Display{
	void disp(String s);
}

public class Lamdba1 {

	public static void main(String[] args) {
		/*
		 *  QUAIS DEVEM SER OS ARGUMENTOS DE method, PARA QUE ELE IMPRIMA "LAMBDA" ?
		 * */
		
		//s -> s.toUpperCase(), "lambda" ==> imprime nada.
		
		//s -> System.out.println(s.toUpperCase()) ==> o metodo method precisa de 2 argumentos.
		
		//s -> System.out.println(s.toUpperCase()), "lambda" ==> Imprimiu LAMBDA !!!
		
		//method(s -> {System.out.println(s.toUpperCase()) }, "lambda" ==> erro compilacao.
		method(s -> System.out.println(s.toUpperCase()), "lambda");
	}
	
	public static void method(Display obj, String text) {
		obj.disp(text);
	}
}
