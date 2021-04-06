package teste2_udemy;

interface I1 {
    void m1();
}
 
interface I2 extends I1 {
    //void m2();
}
 
interface I3 extends I2 {
    //void m3();
}
 
interface I4{
    String toString();
}
//Which of the above statements can replace /INSERT/ 
//such that there is no compilation error?

public class Questao65_Lambda {
	
    public static void main(String[] args) {
    	
       I1 i1 = () -> System.out.println(1);
       
       I2 i2 = () -> System.out.println(2);
       
       I3 i3 = () -> System.out.println(3);
       
       I4 i4 = () -> System.out.println(4);
       
       I4 i5 = () -> "";
    }
}

/*
 * O alvo de lambda expression deve ser uma Functional interface.

* Functional interface deve ter APENAS 1 abstract method sem ser sobrescrito. 
* Functional interface pode ter constant variables, static methods, 
	default methods, private methods and overriding abstract methods [equals(Object) method, toString() method etc. from Object class].

Let's check which of the given interfaces are Functional interfaces...

* Interface I1 contains only one non-overriding abstract method m1() 
	and hence it is a Functional interface.

* Interface I2 extends I1 and therefore it has two non-overriding abstract methods
 	m1() and m2(). I2 is NOT a Functional interface.

* Interface I3 extends I2 and therefore it has three non-overriding abstract methods 
 	m1(), m2() and m3(). I3 is NOT a Functional interface.

* Interface I4 contains only one overriding abstract method toString() 
	and therefore it is NOT a Functional interface.


Out of the given 4 interfaces, only I1 is the Functional interface and hence can be used as the target type of the lambda expression.


Let's check the validity of the lambda expression:

`() -> System.out.println(1);` is the correct implementation of `void m1();` method and therefore can be assigned to target type I1.


Out of given 5 statements only statement number 1 will successfully replace the /INSERT/.
 */
