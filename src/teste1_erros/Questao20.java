package teste1_erros;

import java.io.FileNotFoundException;
import java.io.IOException;
 
abstract class Base {
    public abstract void print() throws IOException;
}
 
class Derived extends Base {
    @Override
    public void print() throws IOException {
        throw new FileNotFoundException();
    }
}
 
public class Questao20 {
    public static void main(String[] args) {
        Base b = new Derived();
        try {
            b.print();
        } catch (FileNotFoundException e) {
            System.out.print("AWE");
        } finally {
            System.out.print("SOME");
        }
    }
}
