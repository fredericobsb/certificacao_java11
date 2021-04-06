package teste4_udemy;

import java.sql.SQLException;
import java.sql.SQLWarning;

interface Multiplier {
    void multiply(int... x) throws SQLException;
}
 
class Calculator implements Multiplier {
    public void multiply(int... x) throws Error{
 
    }
}
public class Q77_hierarquia_excecoes {
    public static void main(String[] args) {
        try {
            Multiplier obj = new Calculator(); //Line n1
            obj.multiply(1, 2, 3);
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}

/* Which of the options can be used to replace /INSERT/ such that there is no 
 * compilation error?
 * 
 * 
 * 
 * RESPOSTA:
 * 
 * Nullpointer, SQLException, SQLWarning, Error, RuntimeException
 * 
 * EXPLICAÇÃO:
 * 
 * Conforme as regras de sobreescrita, Se a interface ou superclasse lança uma 
 * exceção checada, então o metodo da subclasse ou classe implementadora da
 * interface tem as seguintes opções:
 * 
 ********** PODE:
 * 
 * 1) Não lançar exceção checada
 * 
 * 2) Lança a mesma exceção checada da superclasse ou interface: SQLException.
 * 
 * 3) Lança a subclasse da exceção lançada pela superclasse ou interface: SQLWarning.
 * 
 * 4) Pode lançar exceção em tempo de execucao ou Error: RuntimeException, NullPointerException
 *     e Error são validas.
 * 
 * ******** NÃO PODE:
 * 
 * 1) Não pode lançar a superclasse da exceção lançada pela superclasse ou interface:
 *    Exception e Throwable não são validas.
 *    
 * 2) Não pode lançar exceção que não está na hierarquia: 
 *        IOException não é valida porque não está na
 *            hierarquia da SQLException.
 * 
 */
