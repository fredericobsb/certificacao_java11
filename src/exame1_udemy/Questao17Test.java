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

/*
 * The static method of subclass cannot hide the instance method of superclass. 
 * static main(String []) method at Line n2 tries to hide the instance main(String []) 
 * method at Line n1 and hence Line n2 causes compilation error.


There is no issue with Line n3 as it is a valid syntax to invoke the instance main(String []) 
method of M class.


No issue with Line n4 as well as it correctly invokes static main(String []) method of N class.
 * */
