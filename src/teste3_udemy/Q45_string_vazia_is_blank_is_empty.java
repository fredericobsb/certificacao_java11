package teste3_udemy;

public class Q45_string_vazia_is_blank_is_empty {
    public static void main(String[] args) {
        String str = " "; //single space
        boolean b1 = str.isEmpty();
        boolean b2 = str.isBlank();
        System.out.println(b1 + " : " + b2); //Line n1
        
        str.strip(); //Line n2
        b1 = str.isEmpty();
        b2 = str.isBlank();
        System.out.println(b1 + " : " + b2); //Line n3
    }
}
