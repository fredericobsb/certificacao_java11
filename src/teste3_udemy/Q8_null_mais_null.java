package teste3_udemy;

class A {
    public String toString() {
        return null;
    }
}
 
public class Q8_null_mais_null {
    public static void main(String [] args) {
        String text = null;
        text = text + new A(); //Line n1
        System.out.println(text.length()); //Line n2
    }
}
