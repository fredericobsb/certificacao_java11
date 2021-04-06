package teste3_udemy;

import java.util.ArrayList;
import java.util.List;

public class Q44_arrays {
    public static void main(String[] args) {
        String [] arr = {"EARTH", "MOON", "SUN", "PLUTO"};
        var list = new ArrayList<>(List.of(arr));
        var list2 = List.of(arr);
        list.set(3, "JUPITER"); //Line n1
        list.forEach(str -> System.out.println(str)); //Line n2
    }
}

/*
Which of the following options can replace /INSERT/ such that output is:

EARTH

MOON

SUN

JUPITER
*/
