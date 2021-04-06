package exame1_udemy;

********** DUVIDA ********************
//What will be the result of compiling and executing Test(Questao22) class?
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

/*
 * At Line n1, an instance of Counter is created and is referred by variable 'ctr'. ctr.count = 0.

Line n2 just defines the lambda expression, no changes are made to variable 'count' at Line n2.

At Line n3, ctr.count = 100;

At Line n4, code of Lambda expression of Line n2 is executed and it changes ctr.count to 20. 
ctr.count = 20.

Line n5 prints 20 on to the console. 
 * */
