package teste1_erros;

public class Questao77 {
    public static void main(String[] args) {
        for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
            System.out.println(x + y + z);
        }
    }
}

/*
 * In the given for loop:

[ForInit] = int x = 10, y = 11, z = 12: It is allowed. 3 variables are declared and initialized. x = 10, y = 11 & z = 12.

[Expression] = y > x && z > y = (y > x) && (z > y) [Relational operator has higher precedence than logical AND]. This expression is valid and results in boolean value.

[ForUpdate] = y++, z -= 2. It is allowed. y is incremented by 1 and z is decremented by 2.

Let's check the loop's iteration:

1st iteration: x = 10, y = 11, z = 12. (y > x) && (z > y) = (11 > 10) && (12 > 11) = true && true = true. Loop's body is executed and prints x + y + z = 10 + 11 + 12 = 33 on to the console.

2nd iteration: [ForUpdate] is executed. y = 12, z = 10. (y > x) && (z > y) = (12 > 10) && (10 > 12) = true && false = false.

Control goes out of for loop and program terminates successfully.


Loop's body executes once and prints 33 on to the console.
 * **/
