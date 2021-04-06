package teste3_udemy;

public class Q16_excecao {
    public static void main(String[] args) {
        check(); //Line n1
    }
    
    private static void check() throws Exception { //Line n2
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line n3
    }
}