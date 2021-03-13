package teste1_duvidas;

import java.util.ArrayList;
import java.util.List;

public class SubListTest {

	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("C");
		list.add("Z");
		list.add("A");
		list.add("R");
		list.subList(1, 2);
		System.out.println("delimitador 1 = " + String.join("",list));
		System.out.println("delimitador 2 = " + String.join(".",list));
		System.out.println("delimitador 3 = " + String.join("-",list));
		System.out.println("delimitador 4 = " + String.join("/",list));
		
		list = list.subList(1, 2);
		System.out.println("--------------------------");
		System.out.println(list);
	}

}
