package localVariableInitialization13;

public class Snippet6Foo2 {

	public static void main(String[] args) {
		byte b7 = 0b0000_0001;
		char c7 = 0x0_07F;
		short s7 = 011_11;
		int i7 = 1_000_000;
		long d7 = 1_000_000L;
		float f7 = 1_000.000_000f;
		 double l7 = 1.000_0000e10;
		 
		System.out.println("b7 = " + b7);
		System.out.println("c7 = " + c7);
		System.out.println("s7 = " + s7);
		System.out.println("i7 = " + i7);
		System.out.println("l7 = " + l7);
		System.out.println("f7 = " + f7);
		System.out.println("d7 = " + d7);
	}

}
