package teste2_udemy;

//public class Questao10For {

public class Questao10For {
    public static void main(String[] args) {
        int i = 0;
        String res = null;
        for(String [] s = {"A", "B", "C", "D"};;res = String.join(".", s)) { //Line n1
            if(i++ == 0)
                continue;
            else
                break;
        }
        System.out.println(res); //Line n2
    }
}
