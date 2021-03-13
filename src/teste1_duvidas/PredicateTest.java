package teste1_duvidas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
 
class Employee {
    private String name;
    private int age;
    private double salary;
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        return name;
    }
}
 
public class PredicateTest {
    public static void main(String [] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("James", 25, 15000));
        list.add(new Employee("Lucy", 23, 12000));
        list.add(new Employee("Bill", 27, 10000));
        list.add(new Employee("Jack", 19, 5000));
        list.add(new Employee("Liya", 20, 8000));
        
        //Which of the following lambda expressions, if used to replace /*INSERT*/, 
        //prints [Jack, Liya] on to the console?
         
        //e -> e.getSalary() >= 10000 ==> imprime [Jack, Liya]
        process(list, e -> e.getSalary() >= 10000);
        
        //compile error
        //process(list, e -> {e.getSalary() >= 10000});
        
        //compile error
        //process(list, (Employee e) -> {return e.getSalary() += 10000;});
        
        //compile error 
        //process(list, (e) -> {e.getSalary() >= 10000;});
        System.out.println(list);
    }
    
    private static void process(List<Employee> list, Predicate<Employee> predicate) {
        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(predicate.test(iterator.next()))
                iterator.remove();
        }
    }
}