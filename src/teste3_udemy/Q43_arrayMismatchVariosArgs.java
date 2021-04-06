package teste3_udemy;

import java.util.Arrays;

public class Q43_arrayMismatchVariosArgs {
    public static void main(String[] args) {
        char [] arr1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k'};
        char [] arr2 = {'f', 'g', 'a', 'i', 'k'};
        System.out.println(Arrays.mismatch(arr1, 5, 10, arr2, 0, 5));
    }
}
