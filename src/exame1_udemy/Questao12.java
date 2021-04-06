package exame1_udemy;

public class Questao12  {
    private static void div(int i, int j)  {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            Exception ex = new Exception(e);
            throw ex;
        }
    }
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(Exception e) {
            System.out.println("END");
        }
 }
}

