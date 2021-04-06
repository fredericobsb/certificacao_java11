package teste1_erros;

class Super {
    void Super() {
        System.out.print("KEEP_");
    }
}
 
class Baseee extends Super {
    Baseee() {
        Super();
        System.out.print("GOING_");
    }
}
 
public class Questao35 {
    public static void main(String[] args) {
        new Baseee();
    }
}
