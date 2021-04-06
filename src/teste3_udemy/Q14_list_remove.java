package teste3_udemy;

import java.util.ArrayList;
import java.util.List;

//public class Q14_list_remove {

public class Q14_list_remove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(7);
        list.add(50);
        list.add(17);
        list.add(10);
        list.add(5);
        
        list.removeIf(a -> a % 10 == 0);
        
        System.out.println(list);
    }
}


//What will be the result of compiling and executing Test class?
