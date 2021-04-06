package teste4_udemy;

public class Q58_string_repeat {
    public static void main(String[] args) {
        String str = "*";
        /*INSERT*/
        str = str.repeat(5);
        System.out.println(str);
        
        str = "*";
        for(var var = 0; var < 4; var++) {
        	str += "*";
        }
        System.out.println(str);
    }
}
