package teste3_udemy;

interface Equality {
    boolean equals(Object obj);
}
 
public class Q3_lambda {
    public static void main(String[] args) {
        Equality eq = x -> true;
        System.out.println(eq.equals(null));
    }
}
