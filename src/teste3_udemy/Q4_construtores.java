package teste3_udemy;

// //For the class Apple, which option, if used to replace /*INSERT*/, 
//will print GREEN on to the console?

public class Q4_construtores {
    public String color;
    
    public Q4_construtores(String color) {
        /*INSERT*/
    }
    
    public static void main(String [] args) {
    	Q4_construtores apple = new Q4_construtores("GREEN");
        System.out.println(apple.color);
    }
}
/*
1)color = GREEN;
2) this.color = color;
3) this.color = GREEN;
4) color = color;
*/