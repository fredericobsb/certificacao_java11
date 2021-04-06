package teste1_erros;

public class Questao13 {
    public static void main(String [] args) {
        boolean status = true;
        System.out.println(status = false || status = true || status = false);
        System.out.println(status);
    }
}
