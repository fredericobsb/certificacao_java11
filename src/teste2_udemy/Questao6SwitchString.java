package teste2_udemy;

public class Questao6SwitchString {
    public static void main(String[] args) {
        switch ("HELLO") {
            case "HELLO":
                System.out.print(1);
            default:
                System.out.print(2);
            case "null":
                System.out.print(3);
        }
    }
}
