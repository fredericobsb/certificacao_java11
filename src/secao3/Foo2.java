package secao3;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Initializing Primitive Data Variables to literals
*/
 
public class Foo2 {
    public static void main(String[] args) {
 
         // You can set all of the numeric primitive data variables to a literal number
        // from 0 to 127.
        byte b = 127;
        char c = 127;
        short s = 127;
        int i = 127;
        long l = 127;
        float f = 127;
        double d = 127;
 
        // boolean can only be set to true or false
        boolean isTrue = false;
 
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("isTrue = " + isTrue);
    }
}