package teste3_udemy;

//public class Q5_TestEmployee {

class Employee {
    String name;
    int age;
    
    Employee() {
        Employee("Michael", 22); //Line n1
    }
    
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 
public class Q5_TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(); 
        System.out.println(emp.name + ":" + emp.age); //Line n2
    }
}


//What will be the result of compiling and executing TestEmployee class?
