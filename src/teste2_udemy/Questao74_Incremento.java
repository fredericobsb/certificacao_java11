package teste2_udemy;

public class Questao74_Incremento {
    public static void main(String [] args) {
        var a = 3; //Line n1
        var b = 5; //Line n2
        var c = 7; //Line n3
        var d = 9; //Line n4
        boolean res = --a + --b < 1 && c++ + d++ > 1;//a=2, b=4, c=7, d = 9
        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b", a, b, c, d, res);
        
         a = 3; //Line n1
         b = 5; //Line n2
         c = 7; //Line n3
         d = 9; //Line n4
        boolean res2 = --a + --b < 1 & c++ + d++ > 1;//a=2, b=4, c=8, d = 10
        System.out.println("");
        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b", a, b, c, d, res2);
    }
}
