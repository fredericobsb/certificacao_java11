package teste3_udemy;

public class Q78_heranca {
    public static void main(String[] args) {
        AA obj1 = new CC();
        AA obj2 = new BB();
        CC obj3 = (CC)obj1;
        CC obj4 = (CC)obj2;
        obj3.print();
    }
}
