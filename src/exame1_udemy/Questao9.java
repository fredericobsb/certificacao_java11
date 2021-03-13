package exame1_udemy;

public class Questao9 {
	static String msg; //Line 2
    public static void main(String[] args) {
        String msg; //Line 4
        if(args.length > 0) {
            msg = args[0]; //Line 6
        }
        System.out.println(msg); //Line 8
    }
}
