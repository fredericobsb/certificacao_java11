package teste1_erros;

/*  How many String objects are there in the HEAP memory, when control is at Line n9?
 * */
public class Questao78HeapMemory {
    public static void main(String[] args) {
        String s1 = new String("Java"); //Line n3
        String s2 = "JaVa"; //Line n4
        String s3 = "JaVa"; //Line n5
        String s4 = "Java"; //Line n6
        String s5 = "Java"; //Line n7  
        int i = 1; //Line n9 
    }
}
/*
 * String s1 = new String("Java"); --> Creates 2 objects: 1 String Pool and 1 non-pool. 's1' refers to non-pool object.

String s2 = "JaVa"; --> Creates 1 String pool object and 's2' refers to it.

String s3 = "JaVa"; --> Doesn't create a new object, 's3' refers to same String pool object referred by 's2'.

String s4 = "Java"; --> Doesn't create a new object, s4 refers to String Pool object created at Line n3.

String s5 = "Java"; --> Doesn't create a new object, s5 also refers to String Pool object created at Line n3.


So, at Line n9, 3 String objects are available in the HEAP memory: 2 String pool and 1 non-pool.
 */