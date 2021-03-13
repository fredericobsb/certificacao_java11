package exame1_udemy;
/*
 * What will be the result of compiling and executing above code?
 * */
class Shape {
    int side = 0; //Line n1
 
    int getSide() { //Line n2
        return side;
    }
}
 
class Square extends Shape {
    private int side = 4; //Line n3
 
    protected int getSide() { //Line n4
        return side;
    }
}
 
public class Questao19 {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s.side + ":" + s.getSide());// 0:0
        
        Shape s2 = new Square();
        System.out.println(s2.side + ":" + s2.getSide());//0:4
    }
}
