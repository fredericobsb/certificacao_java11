package teste1_duvidas;

public class VarDuvida {

	public static void main(String[] args) {
		int elements = 0;
		Object [] arr = {"A", "E", "I", new Object(), "O", "U"};
		for(var obj : arr) {
			if(obj instanceof String) {
				continue;
			}else {
				break;
			}
			elements++; //unreacheble code
		}
		System.out.println(elements);
	}
}
