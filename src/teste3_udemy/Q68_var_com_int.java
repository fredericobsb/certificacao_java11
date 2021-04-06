package teste3_udemy;

public class Q68_var_com_int {
    public static void main(String[] args) {
        int m = 20;
        int var = --m * m++ + m-- - --m;
        System.out.println("m = " + m);
        System.out.println("var = " + var);
    }
}
