package exame1_udemy;

********** DUVIDA ********************
class Counter {
    int count = 0;
}
interface SetCounter {
    void set(Counter ctr);
}
 
public class Questao22 {
    public static void main(String[] args) {
        Counter ctr = new Counter(); //Line n1
        SetCounter obj = x -> x.count = 20; //Line n2
        ctr.count = 100; //Line n3
        obj.set(ctr); //Line n4
        System.out.println(ctr.count); //Line n5
    }
}
