package teste3_udemy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 
 //What will be the result of compiling and executing Test class?

public class Q2_iterator {
    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
        objects.add("Watch");
        objects.add("Arrow");
        objects.add("Anchor");
        objects.add("Drum");
        
        List<String> objects2 = new ArrayList<>();
        objects2.addAll(objects);
        
        ListIterator<String> iterator = objects.listIterator();
        while(iterator.hasNext()) {
            if(iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }
        
        System.out.println(objects);
        
        Iterator<String>iterator2 = objects2.iterator();
        while(iterator2.hasNext()) {
        	if(iterator2.next().startsWith("A")) {
        		iterator2.remove();
        	}
        }
        System.out.println(objects2);
    }
}



