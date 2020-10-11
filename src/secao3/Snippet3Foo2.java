package secao3;

public class Snippet3Foo2 {

	public static void main(String[] args) {
		byte b4 = 0b1111111;   // binary 127 prefix 0b
		System.out.println("b4 = " + b4);
		 
		short s4 = 0177;  // octal 127 - octal prefix 0 only
		System.out.println("s4 = " + s4);
		 
		int i4 = 0x007F; // hexidecimal 127 - hex prefix 0x
	    	System.out.println("i4 = " + i4);

	}

}
