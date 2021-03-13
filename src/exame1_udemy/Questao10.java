package exame1_udemy;

/*
 * For the class Test, which of the following options, if used to replace INSERT, 
 * will print "BUY 2 GET 1 FREE" on to the console?
	
	int day = 3
	Integer day = 3
	int day = '3'
	nenhuma
 * */
public class Questao10 {
	public static void main(String[] args) {
        /*INSERT*/
		char day = '3'; //esse sim.
        switch(day) {
            case '3':
                System.out.println("BUY 2 GET 1 FREE");
                break;
            default:
                System.out.println("SORRY!!! NO SALE");
        }
    }
}
