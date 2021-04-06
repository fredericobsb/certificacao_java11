package exame1_udemy;

public class Questao15 {
    public static void main(String[] args) {
        for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
            System.out.println(x + y + z);
        }//proximo: y = 12, z = 10
    }
}
/*Basic/Regular for loop has following form:

   for ( [ForInit] ; [Expression] ; [ForUpdate] ) 
   {...}

 * Multiple comma separated statements are allowed for [ForInit] and [ForUpdate] expressions, 
 * 	where as [Expression] must be single expression which results in boolean or Boolean.
 * 
 * 1st iteration: x = 10, y = 11, z = 12. (y > x) && (z > y) = (11 > 10) && (12 > 11) = true && true = true. 
 * Loop's body is executed and prints x + y + z = 10 + 11 + 12 = 33 on to the console.

   2nd iteration: [ForUpdate] is executed. y = 12, z = 10. (y > x) && (z > y) = (12 > 10) && (10 > 12) = true && false = false. 
 */