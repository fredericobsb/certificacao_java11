package teste4_udemy;

//public class Q23_heranca_e_Interface {

interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}
 
abstract class Log {
    public static void log() { 
        System.out.println("Log");
    }
}

class MyLogger extends Log implements ILog {}
