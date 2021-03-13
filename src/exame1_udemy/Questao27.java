package exame1_udemy;

//public class Questao27 {

public class Questao27 {
    public static void main(String[] args) {
        var var = 3; //Line n1
        String [][] arr = new String[--var][var++]; //Line n2/2 2 var = 3
        arr[1][1] = "X"; //Line n3
        arr[1][2] = "Y"; //Line n4
        for(String [] arr1 : arr) {
            for(String s : arr1) {
                if(s != null) 
                    System.out.print(s);
            }
        }
    }
}
