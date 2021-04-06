package teste4_udemy;

public class Q8_interfaces {
    public static void main(String[] args) {
        Counter [] arr = new Counter[2]; //Line n2
        for(Counter ctr : arr) {
            System.out.println(ctr.count); //Line n3
            System.out.println(Counter.count);
        }
    }
}
