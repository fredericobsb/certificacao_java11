package teste2_udemy;

//public class Questao22RuntimeException {

public class Questao22RuntimeException {
    public static void main(String[] args) {
       
        System.out.println(new Throwable());
        System.out.println(new Throwable("minha msg de erro"));
        System.out.println(new Throwable("minha msg", new Throwable()));
        System.out.println(new Throwable(new Throwable()));
        
        System.out.println(new RuntimeException()); //Line n1
        System.out.println(new RuntimeException("HELLO")); //Line n2
        System.out.println(new RuntimeException(new RuntimeException("HELLO"))); //Line n3
        
        System.out.println(new Exception());
        System.out.println(new Exception("msg"));
        System.out.println(new Exception("msg", new Exception()));
        System.out.println(new Exception(new Exception()));
        
        
    }
}
