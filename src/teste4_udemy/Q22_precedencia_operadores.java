package teste4_udemy;

//ID = UK81527382

public class Q22_precedencia_operadores {
    public static void main(String[] args) {
        int x = 7;
        boolean res = x++ == 7 && ++x == 9 || x++ == 9;
        System.out.println("x = " + x);
        System.out.println("res = " + res);
    }
}
/*
 * Given statement:

boolean res = x++ == 7 && ++x == 9 || x++ == 9;

boolean res = (x++) == 7 && ++x == 9 || (x++) == 9; // Postfix operator has higher precedence than other available operators

boolean res = (x++) == 7 && (++x) == 9 || (x++) == 9; //Then comes prefix operators

boolean res = ((x++) == 7) && ((++x) == 9) || ((x++) == 9); //== operator comes next

boolean res = (((x++) == 7) && ((++x) == 9)) || ((x++) == 9); //&& has higher precedence over ||

Right hand side is left with just one operator '||', it is a binary operator, hence let's solve the left hand side first.

boolean res = ((7 == 7) && ((++x) == 9)) || ((x++) == 9); //x = 8

boolean res = (true && ((++x) == 9)) || ((x++) == 9); //x = 8

boolean res = (true && (9 == 9)) || ((x++) == 9); //x = 9

boolean res = (true && true) || ((x++) == 9); //x = 9

boolean res = true || ((x++) == 9); //x = 9, || is a short-circuit operator, given expression evaluates to true without evaluating `((x++) == 9)`

boolean res = true; //x = 9

So,

x = 9

res = true
 */