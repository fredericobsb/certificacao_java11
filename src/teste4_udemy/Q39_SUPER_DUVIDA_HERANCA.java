package teste4_udemy;

class Basee {
    String msg = "INHALE"; //Line n1
}
 
class Derivedd extends Basee {
    Object msg = "EXHALE"; //Line n2
}
 
public class Q39_SUPER_DUVIDA_HERANCA {
    public static void main(String[] args) {
        Basee obj1 = new Basee(); //Line n3
        Basee obj2 = new Derivedd(); //Line n4
        Derivedd obj3 = (Derivedd) obj2; //Line n5
        var var = obj1.msg + "-" + obj2.msg + "-" + obj3.msg; //Line n6
        System.out.println(var); //Line n7
    }
}
