package teste3_udemy;

class A {
    public String toString() {
        return null;
    }
}
 
public class Q18_soma_de_null {
    public static void main(String [] args) {
        String text = null;
        String inferno = "null";
        text = text + new A(); //Line n1
        System.out.println(text.length()); //Line n2
        text = text + inferno;
        System.out.println(text.length());
    }
}
