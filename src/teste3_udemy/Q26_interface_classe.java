package teste3_udemy;

interface M {
    public static void log() {
        System.out.println("M");
    }
}
 
abstract class Aa {
    public static void log() { 
        System.out.println("N");
    }
}
 
class MyClass extends Aa implements M {}
 
public class Q26_interface_classe {
    public static void main(String[] args) {
        M obj1 = new MyClass();
       // obj1.log(); //obj1.log() => Line n1
        M.log();
        
        Aa obj2 = new MyClass();
        obj2.log(); //Line n2
        
        MyClass obj3 = new MyClass();
        obj3.log(); //Line n3
    }
}
