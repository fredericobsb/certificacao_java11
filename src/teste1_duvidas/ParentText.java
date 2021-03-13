package teste1_duvidas;

class Parent{
	String quote = "MONEY DOESN'T GROWN ON TREES";
}

class Child extends Parent{
	String quote = "LIVE LIFE KING SIZE";
}

class GrandChild extends Child{
	String quote = "PLAY PLAY PLAY";
}


public class ParentText {

	public static void main(String[] args) {
		GrandChild gc = new GrandChild();
		
		
		System.out.println( ((Parent)gc).quote );//MONEY DOESN'T GROWN ON TREES
		System.out.println( ((Child)gc).quote );//LIVE LIFE KING SIZE 
		System.out.println( ((GrandChild)gc).quote );//PLAY PLAY PLAY 
	}

}
