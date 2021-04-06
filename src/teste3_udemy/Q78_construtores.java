package teste3_udemy;

//public class Q78_construtores {
class Employee_ {
    String name;
    int age;
    
    Employee_() {
        Employee_("Michael", 22); //Line n1
    }
    
    Employee_(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 
public class Q78_construtores {
    public static void main(String[] args) {
        Employee_ emp = new Employee_(); 
        System.out.println(emp.name + ":" + emp.age); //Line n2
    }
}
