package teste1_duvidas;

import java.util.ArrayList;
import java.util.List;

public class ArrayDuvida {

	public static void main(String[] args) {
		Boolean [] arr = new Boolean[3];
		List<Boolean>list = new ArrayList<>();
		list.add(arr[0]);
		list.add(arr[1]);
		System.out.println(arr[0]);
		if(list.remove(0)) {
			list.remove(1);
		}
		
		System.out.println(list);
	}

}
