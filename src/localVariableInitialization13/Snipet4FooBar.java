package localVariableInitialization13;

public class Snipet4FooBar {

	public static void main(String[] args) {
		// while statement  satisfies compiler's full initialization check only if condition is staticly known
		int u, v = 4;  // u is an uninitialized local variable here
		while (v < 1) {
		    u = v++;		 
		}
		 System.out.println("u is " + u);
	}
}
