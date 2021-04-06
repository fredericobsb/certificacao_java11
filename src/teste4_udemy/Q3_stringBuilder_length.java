package teste4_udemy;

public class Q3_stringBuilder_length {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + ":" + sb.toString().length());
    }
}
