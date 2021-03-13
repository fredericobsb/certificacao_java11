package teste1_duvidas;

public class StringRevisarMetodos {

	public static void main(String[] args) {
		String str = "frederico_lopes_ramos";
		char [] value = {'A', 'B', 'C', 'D', 'E'};
		
		str = String.copyValueOf(value);
		System.out.println(str);//AB
		
		str = String.copyValueOf(value, 0, 4);
		System.out.println(" **************** ");
		System.out.println(str);
		
		str = String.format(str, args);
		System.out.println("---------- format ----------");
		System.out.println(str);
		
		str = String.join(";", str);
		System.out.println(" join ==> " + str);
	}
}
