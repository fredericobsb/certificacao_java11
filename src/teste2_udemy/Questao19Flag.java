package teste2_udemy;

//public class Questao19Flag {

public class Questao19Flag {
    public static void main(String [] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        boolean flag4 = false;
        
        System.out.println(!flag1 == flag2 != flag3 == !flag4); //Line n1
        System.out.println(flag1 = flag2 != flag3 == !flag4); //Line n2
    }
}
