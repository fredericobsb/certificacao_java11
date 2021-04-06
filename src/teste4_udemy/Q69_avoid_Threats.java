package teste4_udemy;

public class Q69_avoid_Threats {
    public static void evaluate(Threat t) { //Line n5
        t = new Threat(); //Line n6
        t.name = "PHISHING"; //Line n7
    }
    
    public static Threat evaluate2(Threat t) { //Line n5
        t = new Threat(); //Line n6
        t.name = "PHISHING"; //Line n7
        return t;
    }
    
    public static void main(String[] args) {
        Threat obj = new Threat(); //Line n1
        obj.print(); //Line n2
        evaluate(obj); //Line n3
        obj.print(); //Line n4
        
        //tentando imprimir "PISHING"
        Threat obj2 = new Threat();
        obj2.print();
        obj2 = evaluate2(obj2);
        obj2.print();
        
    }
}
 
class Threat {
    String name = "VIRUS";
    
    public void print() {
        System.out.println(name);
    }
}
