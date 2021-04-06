package teste2_udemy;

import java.util.ArrayList;
import java.util.List;

//public class Questao7ListRemove {

public class Questao7ListRemove {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");
        
        if(fruits.remove("grape"))
            fruits.remove("papaya");
        
        System.out.println(fruits);
    }
}
