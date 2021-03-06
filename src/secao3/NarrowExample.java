package secao3;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Narrowing
*/
 
public class NarrowExample {
    public static void main(String[] args) {
 
         // First lets print out some ranges:
        System.out.println("A byte has a range of " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
 
        // We'll show character ranges both as unicode ranges and int ranges
        System.out.println("A char has a range of " + String.format("\\u%04x  to \\u%04x", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE));
        System.out.println("A char has a range of " + (int) Character.MIN_VALUE + "  to " + (int) Character.MAX_VALUE);
        System.out.println("A short has a range of " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("An int has a range of " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("A long has a range of " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
 
        System.out.println("A float has a range of " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("A double has a range of " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        
        //snipet1-NarrowExample
       // We will set each variable to its maximum value in its value range
		byte b = 127;
		char c = 65535;
		short s = 32767;
		
		// Implicit narrowing can no longer be done because the literal does not fit the container it is assigned to.
		byte b1 = (byte) 128;
		char c1 = (char) 65536;
		short s1 = (short) 32768;
		
		float f2 =  (float) 0.0;
		 
		byte b2 = (byte) 0.0; 
		char c2 = (char) 0.0;
		short s2 = (short) 0.0;
		int i2 = (int) 0.0;
		long l2 = (long) 0.0;
		
		//snipet4-NarrowExample
		int myIntVariable = 1;
		 
		byte b3 = (byte) myIntVariable;
		char c3 = (char) myIntVariable;
		short s3 = (short) myIntVariable;
    }
}
