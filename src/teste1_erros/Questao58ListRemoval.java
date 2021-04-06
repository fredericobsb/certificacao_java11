package teste1_erros;

import java.util.ArrayList;
import java.util.List;
/**
 * List cannot accept primitives, it can accept objects only. 
 * So, when 15 and 25 are added to the list, then auto-boxing feature 
 * converts these to wrapper objects of Integer type. 
 * */
public class Questao58ListRemoval {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(15);
        list.add(25);
        list.remove(Integer.valueOf(15));
 
        System.out.println(list);
    }
}

