package teste3_udemy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

//public class Q13_predicate {

class Furniture {
    private String name;
    private double weight;
    private double price;
 
    public Furniture(String name, double weight, double salary) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
 
    public String getName() {
        return name;
    }
 
    public double getWeight() {
        return weight;
    }
 
    public double getPrice() {
        return price;
    }
 
    public String toString() {
        return name;
    }
}
 
public class Q13_predicate {
    public static void main(String [] args) {
        List<Furniture> list = new ArrayList<>();
        list.add(new Furniture("Chair", 10.2, 40));
        list.add(new Furniture("Table", 23.7, 300));
        list.add(new Furniture("Sofa", 41, 900));
        list.add(new Furniture("Bed", 45, 1500));
        list.add(new Furniture("Cabinet", 51, 2000));
 
        process(list, f -> f.getWeight() < 45);
    }
 
    private static void process(List<Furniture> list, Predicate<Furniture> predicate) {
        Iterator<Furniture> iterator = list.iterator();
        while(iterator.hasNext()) {
            Furniture f = iterator.next();
            if(predicate.test(f))
                System.out.print(f + " ");
        }
    }
}
