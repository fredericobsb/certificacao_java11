package teste1_duvidas;

public class NullStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		//The method append(Object) is ambiguous for the type StringBuilder
		System.out.println(sb.append(null).length());

	}

}
