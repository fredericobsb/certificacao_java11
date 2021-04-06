package teste3_udemy;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {}
class Dog extends Animal{}
 
public class Q48_list_paiUmTipo_filhoOutro {
    public static void main(String [] args) {
        List<Animal> list = new ArrayList<Dog>();
        list.add(0, new Dog());
        System.out.println(list.size() > 0);
    }
}
