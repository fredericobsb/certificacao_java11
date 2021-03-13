package teste1_duvidas;

class MyClass{
	
	MyClass(){
		System.out.println(101);
	}
}

class MySubClass extends MyClass{
	protected MySubClass() {
		System.out.println(202);
	}
}

public class Construtores1 {
	public static void main(String[] args) {
		System.out.println(new MySubClass());
	}
}
