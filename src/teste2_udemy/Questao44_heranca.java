package teste2_udemy;

class M { }
class N extends M { }
class O extends N { }
class P extends O { }
 
public class Questao44_heranca {
    public static void main(String args []) {
        M obj = new P();
        if(obj instanceof M) 
          System.out.print("M");
        if(obj instanceof N) 
          System.out.print("N");
        if(obj instanceof O) 
          System.out.print("O");
        if(obj instanceof P) 
          System.out.print("P");
    }
}
