package teste1_erros;

import java.io.FileNotFoundException;

public class Questao56LancamentoExcecao {
    public static void main(String[] args) {
        try {
            findSecretFile();
        } catch(Throwable ex) {
            System.out.println(ex.getMessage());
            return;
        } finally {
            System.out.println("LEVEL 1");
        }
        System.out.println("DONE");
    }
 
    static void findSecretFile() throws FileNotFoundException {
        throw new FileNotFoundException("ACCESS REQUIRED");
    }
}
