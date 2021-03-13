package teste1_duvidas;

interface Profitable{
	double profitPercentage = 42.0;
}

class Business implements Profitable{
	double profitPercentage = 50.0;
}

public class InstanciandoInterface {
	public static void main(String[] args) {
		Profitable obj = new Business();
		
		//imprime 42.0
		System.out.println(obj.profitPercentage);
	}
}
