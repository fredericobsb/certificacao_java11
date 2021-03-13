package teste1_duvidas;
/*
 *  Estouro de memoria: StackOverflow
 * */
public class TesteDeMain {

	public static void main(String[] args) {
		try {
			main(args);
		}catch(Exception ex) {
			System.out.println("CATCH");
		}
		System.out.println("OUT");
	}
}
