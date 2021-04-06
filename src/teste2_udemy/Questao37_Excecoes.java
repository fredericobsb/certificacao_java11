package teste2_udemy;

//What will be the result of compiling and executing Test class?

public class Questao37_Excecoes {
    private static void div(int i, int j) {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            throw (RuntimeException)e;
        }
    }
    
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(ArithmeticException e) {
            System.out.println("AE");
        } catch(RuntimeException e) {
            System.out.println("RE");
        }
    }
}

/*

Any RuntimeException can be thrown without any need it to be declared in throws clause 
of surrounding method.


`throw (RuntimeException)e;` doesn't cause any compilation error.


Even though variable 'e' is type casted to RuntimeException but exception object is 
still of ArithmeticException, which is caught in main method and 'AE' is printed to 
the console. 

 */
