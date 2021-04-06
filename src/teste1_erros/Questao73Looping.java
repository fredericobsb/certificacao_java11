package teste1_erros;

//What will be the result of compiling and executing this class?
public class Questao73Looping {
    public static void main(String[] args) {
        int i = 0;
        for(System.out.print(i++); i < 2; System.out.print(i++)) {
            System.out.print(i);//112
        }
    }
}
