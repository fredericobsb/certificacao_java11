package secao3;

public class Snipet1FooBar {
public static void main(String[] args) {
	// do while statement  satisfies compiler's full initialization check
	int s, t = 0;  // s is an uninitialized local variable here
	do {
	    s = t++;
	} while (t < 1);
	System.out.println("s is " + s);   // s is now fully initialized
}
}
