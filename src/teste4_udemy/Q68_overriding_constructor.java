package teste4_udemy;

class Person {
    String name;
    int age;
    
    Person() {
        Person("Rohit", 25);
    }
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 
public class Q68_overriding_constructor {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name + ":" + p.age);
    }
}
