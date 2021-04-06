package teste2_udemy;

//public class Questao21ASC2Code {

public class Questao21ASC2Code {
    public static void main(String[] args) {
        System.out.println(add(90, 7));
        System.out.println(add('a', 1)); //ASCII code for 'a' is 97 and 'b' is 98
    }
    
    //var type cannot be used as method parameters or method return type.
    public static var add(int v1, int v2) {
        return v1 + v2;
    }
}
