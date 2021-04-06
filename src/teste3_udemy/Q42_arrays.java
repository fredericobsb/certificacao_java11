package teste3_udemy;

public class Q42_arrays {
    public static void main(String[] args) {
        StringBuilder[] sb = new StringBuilder[2]; //Line n1
        sb[0] = new StringBuilder("PLAY"); //Line n2
        
        boolean[] flag = new boolean[1]; //Line n3
        
        if (flag[0]) { //Line n4
            sb[1] = new StringBuilder("GROUP"); //Line n5
        }
        
        System.out.println(String.join("-", sb)); //Line n6
        
        //tipos instanciados no array, se da noulo ou nao:
        Boolean b;
        boolean c;
        boolean [] a0 = new boolean[2];//false, false
        Boolean [] a1 = new Boolean[2];
        String  [] a2 = new String [2];
        Integer [] a3 = new Integer [2];
        Long    [] a4 = new Long    [2];
        Character [] a5 = new Character [2];
        char [] a6 = new char[2];// espacos vazios
        Byte [] a7 = new Byte[2];
        byte [] a8 = new byte[2];//0,0
    }
}
