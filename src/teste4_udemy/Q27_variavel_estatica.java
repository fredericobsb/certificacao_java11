package teste4_udemy;

//ID = UK81564728
//What will be the result of compiling and executing Test class?
class Counterr {
    static int ctr = 0;
    int count = 0;
}
 
public class Q27_variavel_estatica {
    public static void main(String[] args) {
        Counterr ctr1 = new Counterr();
        Counterr ctr2 = new Counterr();
        Counterr ctr3 = new Counterr();
        
        for(int i = 1; i <= 5; i++ ) {
            ctr1.ctr++;
            ctr1.count++;
            ctr2.ctr++;
            ctr2.count++;
            ctr3.ctr++;
            ctr3.count++;
        }
        
        System.out.println(ctr3.ctr + ":" + ctr3.count);
    }
}
