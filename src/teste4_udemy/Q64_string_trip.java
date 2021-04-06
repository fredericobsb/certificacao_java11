package teste4_udemy;

public class Q64_string_trip {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ELECTROTHERMAL"); //Line n1
        sb.setLength(7); //Line n2
        System.out.print(sb.toString().strip()); //Line n3
        System.out.print(":"); //Line n4
        sb.setLength(14); //Line n5
        System.out.println(sb.toString().strip()); //Line n6
    }
}
