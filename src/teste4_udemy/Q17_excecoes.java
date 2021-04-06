package teste4_udemy;

class TestException extends Exception {
    public TestException() {
        super();
    }
    
    public TestException(String s) {
        super(s);
    }
}
 
public class Q17_excecoes {
    public void m1() throws __________ {
        throw new TestException();
    }
}

/* fill in the blank with one option.
 
 	RuntimeException
 	Error
 	Object
 	Exception
 */
