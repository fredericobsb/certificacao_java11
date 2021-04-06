package teste4_udemy;

interface Operator {
	int operate(int i, int j);
}
 
public class Q60_interfaces {
	public static void main(String[] args) {
		/*INSERT*/
		Operator opr = (int x, int y) -> {return x + y;};
		
		//Operator opr2 = (x, y) -> return x+ y;
		
		Operator opr3 = (x1, y1) -> {return x1 + y1;};
		
		Operator opr4 = (x2, y2) -> x2 + y2;
		
		//Operator opr5 = x3, y3 -> x3 + y3;
		
		System.out.println(opr.operate(10, 20));
	}
} 
