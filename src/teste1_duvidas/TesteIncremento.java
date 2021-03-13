package teste1_duvidas;

public class TesteIncremento {

	 int  i1 = 10;
	static int i2 = 20;
	
	private  void change1(int val) {
		i1 = ++val;
		i2 = val++;
	}
	
	private static void change2(int val) {
		i1 = --val;
		i2 = val--;
	}
	
	public static void main(String[] args) {
		change1(5);
		change2(5);
		System.out.println(i1 + i2);
	}
}
