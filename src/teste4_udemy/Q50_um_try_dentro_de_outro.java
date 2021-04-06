package teste4_udemy;

public class Q50_um_try_dentro_de_outro {
    public static void main(String[] args) {
        try { //outer
            try { //inner
                System.out.println(1/0);
            } catch(ArithmeticException e) {
                System.out.println("INNER");
            } finally {
                System.out.println("FINALLY 1");
                
                /* a linha abaixo faz cair no catch que imprime "OUTER". 
                Uma vez que uma exce��o � tratada, ela nao cai no catch novamente, 
                 a nao ser que ela seja relan�ada: */
                //throw new ArithmeticException("deu paaaaaaaau!");
            }
        } catch(ArithmeticException e) {
            System.out.println("OUTER");
        } finally {
            System.out.println("FINALLY 2");
        }
    }
}
