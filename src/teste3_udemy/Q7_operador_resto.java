package teste3_udemy;

public class Q7_operador_resto {
    public static void main(String[] args) {
        String [] arr = {"I", "N", "S", "E", "R", "T"};
        for(int n = 0; n <= arr.length; n += 1) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.print(arr[n]); //Line n1
        }
    }
}

/*
And below options:

1. int n = 0; n < arr.length; n += 1

2. int n = 0; n <= arr.length; n += 1

3. int n = 1; n < arr.length; n += 2

4. int n = 1; n <= arr.length; n += 2
*/

//How many above options can be used to replace /*INSERT*/,
//such that on execution, code will print NET on to the console?
