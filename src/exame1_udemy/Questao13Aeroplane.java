package exame1_udemy;

public class Questao13Aeroplane implements Flyable {
    public void land() {
        System.out.println("Landing at " + -Flyable.horizontalDegree() + " degrees."); //Line n3
    }
 
    public static void main(String[] args) {
        new Questao13Aeroplane().fly();
        new Questao13Aeroplane().land();
    }
}
