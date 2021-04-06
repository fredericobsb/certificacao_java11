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
 * EXPLICA��O:
 * 
 * Conforme as regras de sobreescrita, Se a interface ou superclasse lan�a uma 
 * exce��o checada, ent�o o metodo da subclasse ou classe implementadora da
 * interface tem as seguintes op��es:
 * 
 ********** PODE:
 * 
 * 1) N�o lan�ar exce��o checada
 * 
 * 2) Lan�a a mesma exce��o checada da superclasse ou interface: SQLException.
 * 
 * 3) Lan�a a subclasse da exce��o lan�ada pela superclasse ou interface: SQLWarning.
 * 
 * 4) Pode lan�ar exce��o em tempo de execucao ou Error: RuntimeException, NullPointerException
 *     e Error s�o validas.
 * 
 * ******** N�O PODE:
 * 
 * 1) N�o pode lan�ar a superclasse da exce��o lan�ada pela superclasse ou interface:
 *    Exception e Throwable n�o s�o validas.
 *    
 * 2) N�o pode lan�ar exce��o que n�o est� na hierarquia: 
 *        IOException n�o � valida porque n�o est� na
 *            hierarquia da SQLException.
 * 
 */
