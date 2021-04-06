package teste4_udemy;

import java.util.ArrayList;

public class Q63_remove_null {
    public static void main(String[] args) {
        var list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        //Object result1 = list.remove(0);
        //Object result2 = list.remove(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
        
        //list = new ArrayList<>();
        //list.add(10);
        //list.add("arroooooooooooh");
       // list.add(new Object());
        
       // teste1 = list.remove(0);
      //  Object teste2 = list.remove("arroooooooooooh");
      //  Object teste3 = list.remove(0);
    }
}
