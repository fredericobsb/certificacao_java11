package exame1_udemy;

/*
 * Limite do byte = 127.
 * */
public class Questao18 {

        public static void main(String[] args) {
            byte var = 100;
            switch(var) {
                case 100:
                    System.out.println("var is 100");
                    break;
                case 200:
                    System.out.println("var is 200");
                    break;
                default:
                    System.out.println("In default");
            }
      }
}
