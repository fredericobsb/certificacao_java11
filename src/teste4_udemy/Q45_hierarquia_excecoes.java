package teste4_udemy;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base {
    Base() throws IOException {
        System.out.print(1);
    }
}
 
class Derived extends Base {
    Derived() throws FileNotFoundException {
        System.out.print(2);
    }
}
 
public class Q45_hierarquia_excecoes {
    public static void main(String[] args) throws Exception {
        new Derived();
    }
}

/*
 Java compiler adds super(); as the first statement inside Derived class's constructor:

Derived() throws FileNotFoundException {
    super(); //added by the compiler
    System.out.print(2);
}


As super(); invokes the constructor of Base class (which declares to throw IOException), 
compiler complains as Derived class no-argument constructor doesn't declare to throw IOException. 
It declares to throw FileNotFoundException (subclass of IOException), 
which is not enough for the instances of IOException. 
 */
