package localVariableInitialization13;

public class Snipet3FooBar {

	public static void main(String[] args) {
		// while statement  satisfies compiler's full initialization check only if condition is staticly known
		System.out.println("pqp");
		int u, v = 0;  // u is an uninitialized local variable here
		while (true) {
		    u = v++;
		    break;
		}
		 System.out.println("u is " + u);   // u is now fully initialized

	}

}
