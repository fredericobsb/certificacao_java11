package teste1_erros;

/**
 * SOLUCOES:
 *  1. Remove the protected modifier from the help() method of Helper class: 
 *  Both the overridden and overriding methods will have same default modifier, 
 *  which is allowed
  OR

2. Add the protected modifier to the help() method of LogHelper class: 
Both the overridden and overriding methods will have same protected modifier, which is allowed

OR

3. Add the public modifier to the help() method of LogHelper class: 
Overridden method will have protected modifier and overriding method
 will have public modifier, which is allowed
 * */
abstract class Helper {
    int num = 100;
    String operation = null;
    
    protected abstract void help();
    
    void log() {
        System.out.println("Helper-log");
    }
}
 
public class Questao72LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";
    
    void help() {//Cannot reduce the visibility of the inherited method from Helper
        System.out.println("LogHelper-help");
    }
    
    void log() {
        System.out.println("LogHelper-log");
    }
    
    public static void main(String [] args) {
        new Questao72LogHelper().help();
    }
}
