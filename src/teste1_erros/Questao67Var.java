package teste1_erros;

public class Questao67Var {
    public static void main(String [] args) {
        byte var = 127;
        /**
         * How many below options can be used to replace /INSERT/ (separately and not together) 
         * such that there is no compilation error?
         * */
        
        /*var = var - 1: 'var - 1' results in int type and it cannot be assigned
         *  to byte type without explicit casting, hence it causes compilation error.*/
        System.out.println(var =  var - 1);
        
        //mas se fizer o cast explicito, compila!
        System.out.println(var = (byte)(var - 1));
        
        /*
         * var = var + 1: 'var + 1' results in int type and it cannot be assigned
         *  to byte type without explicit casting, hence it causes compilation error.
         * */
        System.out.println(var = var + 1);
      //mas se fizer o cast explicito, compila!
        System.out.println(var = (byte)(var + 1));
        
        /*
         * ++var: Compiler converts it to var = (byte) (var + 1) 
         * and hence it compiles successfully.
         * */
        System.out.println(++var);
        
        /*
         * --var: Compiler converts it to var = (byte) (var - 1) 
         * and hence it compiles successfully.
         * */
        System.out.println(--var);
        
        /*
         * var *= 2: Compiler converts it to var = (byte) (var * 2) 
         * and hence it compiles successfully.
         * */
        System.out.println(var *= 2);
        
        /**
         * var -= 10: Compiler converts it to var = (byte) (var - 10) 
         * and hence it compiles successfully.
         * */
        System.out.println(var -= 10);
        
        /**
         * var += 2: Compiler converts it to var = (byte) (var + 2) 
         * and hence it compiles successfully.
         * */
        System.out.println(var += 2);
        System.out.println(var);
    }
}
