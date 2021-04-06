package exame1_udemy;

public class Questao24 {

        private static void m(int x) {
            System.out.println("INT VERSION");
        }
        
        private static void m(char x) {
            System.out.println("CHAR VERSION");
            
        }

        
        public static void main(String [] args) {
            byte i = '5';
            m(i);
            m('5');
        }
    }
/*
 * Method m is overloaded and which overloaded method to invoke, is decided at compile time.

m(i) is tagged to m(int) as i is of int type and m('5') is tagged to m(char) as '5' is char literal.

`m(i);` prints int version on to the console.

`m('5');` prints char version on to the console. 
 * */
