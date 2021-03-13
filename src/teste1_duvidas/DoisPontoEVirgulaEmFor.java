package teste1_duvidas;

public class DoisPontoEVirgulaEmFor {

	public static void main(String[] args) {
		int i = 0;
		String res = null;
		for(String [] s = {"A","B","C","D"};;res = String.join(".", s)) {
			if(i++ == 0)
				continue;
			else
				break;
		}
		System.out.println(res);
	}

}
