package teste2_udemy;

//public class Questao8Null {

public class Questao8Null {
    public static void main(String[] args) {
        m1(null);
    }
    
    static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }
    
    static void m1(String s) {
        System.out.println("String");
    }
    
  //  static void m1(StringBuilder s) {
   //     System.out.println("String");
   // }
    
    static void m1(Object s) {
        System.out.println("Object");
        //System.out.println(null);
    }
}
