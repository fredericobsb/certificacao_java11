package teste3_udemy;

interface Printable {
    void print(String msg);
}
 
public class Q22_lambda {
    public static void main(String[] args) {
       
    	Printable obj = x -> System.out.println(x);
       
       Printable obj2 = (msg) -> {System.out.println(msg);};
       
       Printable obj3 = String msg -> {System.out.println(msg);};
       
       Printable obj4 = msg -> {System.out.println(msg);};
       
       Printable obj5 = msg -> {System.out.println(msg)};
       
       Printable obj6 = y - > System.out.println(y);
       
       Printable obj7 = msg -> System.out.println(msg);
       
       Printable obj8 = (String msg) -> {System.out.println(msg);return;};
       
       Printable obj9 = (msg) -> System.out.println(msg);
       
       Printable obj10 = (String msg) -> {System.out.println(msg);};
       
        obj.print("WINNERS NEVER QUIT");
    }
}
