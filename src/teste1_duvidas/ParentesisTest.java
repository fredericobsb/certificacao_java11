package teste1_duvidas;

interface ITester{
	void test();
}

public class ParentesisTest {

	public static void main(String[] args) {
		ITester obj = () -> System.out.println("KEELP CALM");//imprime nada

	}

}
