package teste4_udemy;

import java.util.Arrays;

public class Q34_array_compara_mismatch_com_null {
    public static void main(String[] args) {
        try {
            System.out.print(Arrays.compare(new char[] { 'A' }, null));
        } catch (Exception ex) {
            System.out.print('A');
        }
 
        try {
            System.out.print(Arrays.mismatch(null, new int[] { 1 }));
        } catch (Exception ex) {
            System.out.print('B');
        }
 
        try {
            System.out.print(Arrays.equals(new short[] { 10 }, null));
        } catch (Exception ex) {
            System.out.print('C');
        }
    }
}

//What will be the result of compiling and executing above code?

/*
  Arrays.compare => se tiver um null, retorna normal: 1, -1 ou 0.
  
  Arrays.mismatch => se tiver um null, dá NullPointer.
 */
 