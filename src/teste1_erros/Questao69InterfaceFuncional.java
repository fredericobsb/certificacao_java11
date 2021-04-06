package teste1_erros;

/**
 * 2) Interface Parent is a valid interface and it contains a default method, 
 *    3 static methods out of which 2 are private and one overriding abstract method 
 *    [toString()] but it doesn't contain non-overriding abstract method.
 * */
interface Parent {
    default void earn() {
        System.out.println("Earning for the family");
    }
 
    static void plan() {
        planRetirement();
        planChildrenEducation();
    }
 
    private static void planChildrenEducation() {
        //valid codes
    }
 
    private static void planRetirement() {
        //valid codes
    }
 
    String toString();
}
 /**
  *  3) Interface Child extends Parent and it declares a non-overriding abstract method play().
  *   As Parent interface doesn't have any non-overriding abstract method, therefore, 
  *   Child interface has only one non-overriding abstract method and therefore 
  *   it's a valid Functional interface.
  * */
interface Child extends Parent {
    void play();
}
 
public class Questao69InterfaceFuncional {
    public static void main(String[] args) {
    	/*
    	 * 1) The target type of a lambda expression must be a functional interface.
		   At Line n1, interface Child is the target type for lambda expression, 
		   which means Child must be a Functional Interface. 
		   Let's check if Child is a Functional interface or not.
		   
		   Functional interface must have only one non-overriding abstract method 
		   but Functional interface can have constant variables, static methods, 
		   default methods, private methods and overriding abstract methods 
		   [equals(Object) method, toString() method etc. from Object class]. 
    	 * */
        Child child = () -> System.out.println("PLAYING CRICKET..."); //Line n1
        child.play(); //Line n2
    }
}
