package exame1_udemy;

public class Questao3 {
	private static void test() throws Exception {
        throw new Exception();
    }
    
    public static void main(String [] args)  {
        try {
            test();
        } finally {
            System.out.println("GAME ON");
        }
    }
}
