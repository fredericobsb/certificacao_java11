package teste1_erros;

import java.util.ArrayList;
import java.util.List;

public class Questao55SubListInclusiveExclusive {
	    public static void main(String[] args) {
	        List<String> list;
	        list = new ArrayList<>(); //Line n1
	        list.add("A");
	        list.add("E");
	        list.add("I");
	        list.add("O");
	        list.add("U");
	        /*
	         * sublist => fromIndex é inclusive (0)
	         *         => toIndex é EXCLUISIVE (4)
	         * */
	        list.addAll(list.subList(0, 4)); //Line n2
	        System.out.println(list);
	    }
	}
