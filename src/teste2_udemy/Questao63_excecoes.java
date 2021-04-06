package teste2_udemy;

public class Questao63_excecoes {
    private static String s;
    public static void main(String[] args) {
    /*
     * NullPointerException extends RuntimeException and in multi-catch syntax 
     * we can't specify multiple Exceptions related to each other in multilevel 
     * inheritance.
	 */
        try {
            System.out.println(s.length());
        } catch(NullPointerException | RuntimeException ex) {
            System.out.println("DONE");
        }
        
        /*
         * mas se eu lançar uma exceção do mesmo nivel da outra, aí compila:
    	 */
            try {
                System.out.println(s.length());
            } catch(NullPointerException | ArithmeticException | NumberFormatException |
            		ClassCastException | IndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("DONE");
            }
    }
}
