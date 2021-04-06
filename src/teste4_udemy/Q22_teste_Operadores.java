package teste4_udemy;

public class Q22_teste_Operadores {
	public static void main(String[] args) {
		boolean a1 = true;
		int x = 5;
		
		if(++x < 6 || x++ > 5)
			++x;
		System.out.println(x);//x = 8
		
		if(x > 8 | x++ == 8)
			System.out.println(" se x == 9, leu o 2 lado x => " + x);
		
		x = 5;
		if(++x < 6 && x++ > 5)
			++x;
		System.out.println(x);//x =6, nao leu o 2 lado
		x = 5;
		if(x++ > 8 & x++ == 8)
			++x;
			System.out.println(" se x == 6, nao leu o 2 lado x => " + x);
		
		x = 2;
		System.out.println(x % 2);
		
	}
}
