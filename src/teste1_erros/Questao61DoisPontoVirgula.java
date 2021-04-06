package teste1_erros;
/**
 * 2 ponto e virgula no for causa looping infinito:OutOfMemoryError
 * */
public class Questao61DoisPontoVirgula {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            for(;;) {
                sb.append("1Z0-815");
                System.out.println(sb);
            }
        } catch(Exception e) {
            System.out.println("Exception!!!");
        }
        System.out.println("Main ends!!!");
    }
}
