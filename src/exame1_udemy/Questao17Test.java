package exame1_udemy;

class M {
    public void main(String[] args) { //Line n1
        System.out.println("M");
    }
}
 
class NN extends M {
    public static void main(String[] args) { //Line n2
        new M().main(args); //Line n3
    }
}
 
public class Questao17Test {
    public static void main(String[] args) {
        NN.main(args); //Line n4
    }
}
