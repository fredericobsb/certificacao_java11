package teste3_udemy;

import java.util.Arrays;

public class Q39_array_mismatch_compare {
    public static void main(String[] args) {
        byte[] arr1 = { 5, 10, 20, 15 };
        byte[] arr2 = { 5, 10, 17, 15 };
        System.out.println(Arrays.compare(arr2, arr1));
        System.out.println(Arrays.mismatch(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr2));
    }
}

/*
Given options to fill the blanks:

1. compare

2. mismatch

3. equals

*/