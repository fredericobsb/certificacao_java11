package teste4_udemy;

//What will be the result of compiling and executing Test class?
public class Q31_precedencia_operadores {
    public static void main(String [] args) {
        String text = "RISE ";
        text = text + (text = "ABOVE ");
        System.out.println(text);
    }
}

/*
 Given statement:

text = text + (text = "ABOVE ");

text = "RISE " + (text = "ABOVE "); //Left operand of + operator is evaluated first, text --> "RISE "

text = "RISE " + "ABOVE "; //Right operand of + operator is evaluated next, text --> "ABOVE "

text = "RISE ABOVE "; //text --> "RISE ABOVE "


Hence `System.out.println(text);` print 'RISE ABOVE ' on to the console.
 */