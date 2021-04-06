package teste2_udemy;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Questao69_Excecoes {
    public static void main(String[] args) {
        try {
            find();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    static void find() throws Exception {
        try {
            System.out.print(1);
            throw new FileNotFoundException("FNF");
        } catch(FileNotFoundException ex) {
            System.out.print(2);
            throw new IOException("IO");
        } catch(IOException ex) {
            System.out.print(3);
            throw new Exception("EXP");
        } finally {
            System.out.print(4);
            throw new Exception("FINALLY");
        }
    }
}

/*
  Method find() declares to throw Exception and the throw statements inside this method 
     is throwing the Subclasses of Exception, hence no issues in find() method.

  main(String []) method also provide legal try-catch block, hence the given code 
    compiles successfully.


 Throwable is the root class of the exception hierarchy and it contains some 
   useful constructors:


1. public Throwable() {...} : No-argument constructor

2. public Throwable(String message) {...} : Pass the detail message

3. public Throwable(String message, Throwable cause) {...} : 
	Pass the detail message and the cause

4. public Throwable(Throwable cause) {...} : Pass the cause


Exception and RuntimeException classes also provide similar constructors.


Throwable class also contains methods, which are inherited by all the subclasses 
	(Exception, RuntimeException etc.)

1. public String getMessage() {...} : Returns the detail message 
	(E.g. detail message set by 2nd and 3rd constructor)

2. public String toString() {} :

Returns a short description of this throwable. The result is the concatenation of:

the name of the class of this object

": " (a colon and a space)

the result of invoking this object's getLocalizedMessage() method


If getLocalizedMessage returns null, then just the class name is returned.



Let's check the execution:

main(String []) method invokes find() and first statement inside try-block gets executed, 
	1 is printed on to the console.

Next statement is executed and an instance of FileNotFoundException is thrown.

Matching catch-handler is available, so control goes inside the first catch-handler 
	and 2 is printed on to the console. An instance of IOException is thrown by the 
	catch-block but another catch-block at the same level are not executed.

As finally-block always executes, hence, 4 is printed on to the console and an 
   Exception instance is thrown by the finally-block.


Control goes back to the calling method main(String []), catch-handler is executed 
and it prints FINALLY on to the console.


Hence output is: 124FINALLY
 */