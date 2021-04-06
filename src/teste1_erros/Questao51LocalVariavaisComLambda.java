package teste1_erros;
/**
 * Lambda expression's parameter x cannot redeclare another local variable
 *  defined in an enclosing scope. 
 * */
interface Operation {
    int operate(int x, int y);
}
 
public class Questao51LocalVariavaisComLambda {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        Operation o1 = (x, y) -> x * y; 
        System.out.println(o1.operate(5, 10));
    }
}
