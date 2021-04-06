package teste3_udemy;

//public class Q11_Excecoes {

public class Q11_Excecoes {
    public static void main(String[] args) {
        Error obj = new Error();
        boolean flag1 = obj instanceof RuntimeException; //Line n1
        boolean flag2 = obj instanceof Exception; //Line n2
        boolean flag3 = obj instanceof Error; //Line n3
        boolean flag4 = obj instanceof Throwable; //Line n4
        System.out.println(flag1 + ":" + flag2 + ":" + flag3 + ":" + flag4);
    }
}


//What will be the result of compiling and executing Test class?

