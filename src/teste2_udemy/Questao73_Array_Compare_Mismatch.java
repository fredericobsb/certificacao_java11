package teste2_udemy;

import java.util.Arrays;

//public class Questao73_Array_Compare_Mismatch {

public class Questao73_Array_Compare_Mismatch {
    public static void main(String[] args) {
        int [] array1 = {};
        int [] array2 = {100, 200};
        //Arrays.compare(array1, array2) = array1.length - array2.length = 0 - 2 = -2.
        System.out.print(Arrays.compare(array1, array2));
        System.out.print(Arrays.mismatch(array1, array2));
    }
}
