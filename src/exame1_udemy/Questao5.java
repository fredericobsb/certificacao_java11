package exame1_udemy;

interface Operation {
    int operate(int x, int y);
}

//teste
interface OperacaoComDouble {
	double operacao (double x, double y);
}
 
public class Questao5 {
    public static void main(String[] args) {
        //int x = 10;//Lambda expression's parameter x cannot redeclare another local variable defined in an enclosing scope. 
       // int y = 20;//Lambda expression's parameter x cannot redeclare another local variable defined in an enclosing scope. 
        Operation o1 = (x, y) -> x * y; 
        System.out.println(o1.operate(5, 10));
        
        //teste
        OperacaoComDouble o2 = (x, y) -> x / y;
        System.out.println("teste double => " + o2.operacao(20.4, 2.0));
    }
}