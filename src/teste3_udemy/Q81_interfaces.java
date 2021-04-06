package teste3_udemy;

//public class Q81_interfaces {

interface Equalityy {
    boolean equals(Object obj);
}
 
public class Q81_interfaces {
    public static void main(String[] args) {
        Equalityy eq = x -> true;
        System.out.println(eq.equals(null));
    }
}
