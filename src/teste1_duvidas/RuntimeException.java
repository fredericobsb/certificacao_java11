package teste1_duvidas;

public class RuntimeException {

	public static void main(String[] args) {
		System.out.println(new RuntimeException());
		
		//ERRO de compilacao: Não existe construtor de String em RuntimeException.
		System.out.println(new RuntimeException("HELLO"));
		System.out.println(new RuntimeException(new RuntimeException("HELLO")));
	}

}
