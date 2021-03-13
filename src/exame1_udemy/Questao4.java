package exame1_udemy;

public class Questao4 {
	private static String print(String... args) {
        return String.join("-", args); //Line n1
    }
    
    private static Object print(Object... args) {
        String str = "";
        for(Object obj : args) {
            if(obj instanceof String) { //Line n2
                str += (String) obj; //Line n3
            }
        }
        return str; //Line n4
    }
    
    public static void main(String... args) {
        Object obj1 = new String("SPORT"); //Line n5
        Object obj2 = new String("MAD"); //Line n6
        System.out.println(print(obj1, obj2)); //Line n7
    }
}
