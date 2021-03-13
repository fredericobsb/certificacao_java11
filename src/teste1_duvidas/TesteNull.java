package teste1_duvidas;

public class TesteNull {

	public static void main(String[] args) {
		String text = null;
		//System.out.println(text.repeat(3));//null pointer
		
		//System.out.println(null + null + null);//compile error
		
		System.out.println(null + "null" + null);//imprimiu nullnullnull
		
		//System.out.println(text *= 3);//compile error

	}

}
