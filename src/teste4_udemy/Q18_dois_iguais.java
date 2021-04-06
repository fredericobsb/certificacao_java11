package teste4_udemy;

public class Q18_dois_iguais {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30}; //Line n1
        int i = 0;
        arr[i++] = arr[++i] = 40; //Line n2
        for(var x : arr) //Line n3
            System.out.println(x);
    }
}
