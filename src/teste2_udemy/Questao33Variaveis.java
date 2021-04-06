package teste2_udemy;

public class Questao33Variaveis {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            if(start % 2 == 0) {
                continue;
            }
            sum += start; //Line n1
        } while(++start <= 10);
        System.out.println(sum);
    }
}
