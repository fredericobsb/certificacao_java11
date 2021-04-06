package teste2_udemy;

//public class Questao25Split {

public class Questao25Split {
    public static void main(String[] args) {
        String str = "BERVERAGE";
        String [] arr = str.split("R", 3);
        System.out.println(String.join(".", arr));
    }
}
