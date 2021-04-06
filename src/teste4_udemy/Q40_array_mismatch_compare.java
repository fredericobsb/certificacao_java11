package teste4_udemy;

import java.util.Arrays;

//public class Q40_array_mismatch_compare {

public class Q40_array_mismatch_compare {
    public static void main(String[] args) {
        String [] str1 = {"A", "AA", "ABCD"};
        String [] str2 = {"A", "AA", "ABCB"};
        System.out.print(Arrays.mismatch(str1, str2));
        
        //de "ABCD" para "ABCB", "D" para "B": sobram 2 posicoes. logo: +2.
        System.out.print(Arrays.compare(str1, str2));
        
      //de "ABCB" para "ABCD", "B" para "D": faltam 2 posicoes. logo: - 2.
        System.out.print(Arrays.compare(str2, str1));
    }
}
