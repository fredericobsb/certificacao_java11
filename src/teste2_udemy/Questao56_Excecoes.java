package teste2_udemy;

import java.io.IOError;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.BrokenBarrierException;

class Base {
    public void log() throws NullPointerException {//unchecked
        System.out.println("Base: log()");
    }
    
    public void log2() throws RuntimeException {//unchecked
        System.out.println("Base: log()");
    }
    
    public void log3() throws Exception {//checked
        System.out.println("Base: log()");
    }
    
    public void log4() throws Throwable {//checked
        System.out.println("Base: log()");
    }
    
}
 
class Derived extends Base {
    public void log() throws ArithmeticException, RuntimeException, NullPointerException {
        System.out.println("Derived: log()");
    }
    
    
    
    /*Se o metodo log2 da classe superior(Base)lançar exceção NÃO checada, só pode sobrescrever com excecoes nao checadas*/
    public void log2() throws ArithmeticException, RuntimeException, NullPointerException, IOError, VirtualMachineError,
    	ThreadDeath, OutOfMemoryError, StackOverflowError, IndexOutOfBoundsException, ArrayIndexOutOfBoundsException,
    	NumberFormatException, ClassCastException{
        System.out.println("Derived: log2() - nao checada");
    }
    
    /*se o metodo log3 da classe superior (BAse) lançar exceção checada, o metodo
     * log3 da classe que sobrescreveu(Derived) pode lançar excecoes checadas e nao checadas.*/
    public void log3() throws RuntimeException, IOException, SQLException, BrokenBarrierException, 
    	NullPointerException, ArithmeticException, StackOverflowError, OutOfMemoryError, Error, IOError, 
    	ThreadDeath, VirtualMachineError, Error, IOError{
    		System.out.println("Derived: log3() - checada");
    }
    
    /* Mesma coisa do de cima, mas o log da classe Base lançou Throwable, ao invés de Exception*/
    public void log4() throws RuntimeException, IOException, SQLException, BrokenBarrierException, 
    	NullPointerException, ArithmeticException, StackOverflowError, OutOfMemoryError, Error, 
    	IOError, ThreadDeath, VirtualMachineError, Error, IOError, Throwable{
    		System.out.println("Derived: log4() - checada");
    }
}
 
	public class Questao56_Excecoes {
	    public static void main(String[] args) {
	        Base obj = new Derived();
	        obj.log();
	    }
	}

/*
 NullPointerException extends RuntimeException. Overriding method may or may not throw 
 any RuntimeException. Only thing to remember is that if overridden method throws 
 any unchecked exception or Error, then overriding method must not throw 
 any checked exceptions.

So, method log() in Derived class correctly overrides Base class's method.

Rest is simple polymorphism. 'obj' refers to an instance of Derived class 
and hence obj.log(); invokes method log() of Derived class, which prints 
"Derived: log()" on to the console.
 */
