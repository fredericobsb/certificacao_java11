package teste1_erros;

public class Questao52ArrayBidimensional {
    public static void main(String[] args) {
        var var = 3; //Line n1
        String [][] arr = new String[--var][var++]; //Line n2
        arr[1][1] = "X"; //Line n3
        arr[1][2] = "Y"; //Line n4 ==>ArrayIndexOutofBoundException
        for(String [] arr1 : arr) {
            for(String s : arr1) {
                if(s != null) 
                    System.out.print(s);
            }
        }
    }
}
