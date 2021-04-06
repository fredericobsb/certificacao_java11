package teste1_erros;

/*
 * The static method of subclass cannot hide the instance method of superclass. 
 * static main(String []) method at Line n2 tries to hide the instance main(String []) 
 * method at Line n1 and hence Line n2 causes compilation error. 
 * */

class M {
    public void main(String[] args) { //Line n1
        System.out.println("M");
    }
}
 
class N extends M {
    public static void main(String[] args) { //Line n2
        new M().main(args); //Line n3
    }
}
 
public class Questao60 {
    public static void main(String[] args) {
        N.main(args); //Line n4
    }
}
