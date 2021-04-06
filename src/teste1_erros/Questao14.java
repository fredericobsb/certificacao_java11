package teste1_erros;
/*
 *  there is no rule regarding return type for overloaded methods,
 *  return type can be same or different. 
 
 * */
	class Car {
	    void speed(Byte val) { //Line n1
	        System.out.println("DARK"); //Line n2
	    } //Line n3
	 
	    void speed(byte... vals) {
	        System.out.println("LIGHT");
	    }
	    
	    void speed(boolean vals) {
	    	System.out.println("boolean teste");
	    }
	}
	 
	public class Questao14 {
	    public static void main(String[] args) {
	        byte b = 10; //Line n4
	        new Car().speed(b); //Line n5
	        Boolean variavel = true;
	        new Car().speed(variavel);
	    }
	}
