package teste1_erros;

import java.util.List;

public class Questao27 {
    public static void main(String[] args) {
        var festivals = List.of("DIWALI", "CHRISTMAS", "EID");
        festivals.removeIf(str -> str.length() == 3);
        System.out.println(festivals);
    }
}

/*
 * Local variable Type inference was added in JDK 10.

Reserved type name var is allowed in JDK 10 onwards for local variable declarations 
with initializers, enhanced for-loop indexes, and index variables declared in traditional 
for loops. For example,

var x = "Java"; //x infers to String

var m = 10; //m infers to int


Given statement:

var festivals = List.of("DIWALI", "CHRISTMAS", "EID"); => festivals refers to a List of String type.


Static List.of() overloaded methods were added in Java 9 and these return an unmodifiable 
list containing passed elements. So, above list object referred by festivals is unmodifiable.


removeIf(Predicate<? super E> filter) method was added as a default method in 
Collection<E> interface in JDK 8 and it removes all the elements of this collection that satisfy the given predicate.

Interface java.util.function.Predicate<T> declares below non-overriding abstract method:

boolean test(T t);


Lambda expression passed to removeIf(Predicate) method is: `str -> str.length() == 3` 
and is a valid lambda expression for Predicate<String> interface.


There is no compilation error in the code but calling removeIf(Predicate) method 
on unmodifiable list 'festivals' throws an 
exception(java.lang.UnsupportedOperationException) at runtime.
 */