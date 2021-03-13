package exame1_udemy;
/**
 * Hierarquia dos modificadores de acesso:
 * 
 * menos estrito ===> mais restrito
 * 
 * 1) default  2)public  3)private  4) protected
 * 
 * Which of the following changes, done independently, allows the code to compile 
 * and on execution prints LogHelper-help?

   Select 3 options.

1.Remove the protected modifier from the operation variable of LogHelper class
2.Add the public modifier to the log() method of LogHelper class
3.Remove the private modifier from the num vabiable of LogHelper class
4.Add the public modifier to the help() method of LogHelper class
5. add the protected modifier to the log() method of Helper class
6. remove the protected modifier from the help() melthod of Helper class
7. add the protected modifier to the help() method of LogHelper class
 * 
 * 
 * */
abstract class Helper {
    int num = 100;
    String operation = null;
    
    protected abstract void help();
    
    void log() {
        System.out.println("Helper-log");
    }
}
 
public class Questao26 extends Helper {//LogHelper class name
	
    private int num = 200;
    
    protected String operation = "LOGGING";
    
     void help() {
        System.out.println("LogHelper-help");
    }
    
    void log() {
        System.out.println("LogHelper-log");
    }
    
    public static void main(String [] args) {
        new Questao26().help();
    }
}
