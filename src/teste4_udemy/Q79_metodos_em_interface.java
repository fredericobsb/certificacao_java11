package teste4_udemy;

public interface Q79_metodos_em_interface {

	/*Por default, esse metodo � public e abstract, e isso � permitido em interface.*/
	void test();
	
	/*No Java 8, metodos default foram adicionados em interfaces. Sintaxe � v�lida.*/
    default void test(String name) {
        System.out.println("Testing " + name);
    }
    
    /*No Java 8, metodos est�ticos foram adicionados em interfaces. Sintaxe � v�lida.*/
    static void test(int x) {
        System.out.println(x);
    }
    
    /*No Java 9, metodos privados foram adicionados em interfaces.
     * Eles podem ser estaticos ou nao-estaticos, mas NAO PODEM SER default*/
    private default void log1() {}
    
    /*No Java 9, metodos privados foram adicionados em interfaces.
     * Eles podem ser estaticos ou nao-estaticos. Sintaxe correta.*/
    private void log2() {}
    
    /*No Java 9, metodos privados foram adicionados em interfaces.
     * Eles podem ser estaticos ou nao-estaticos. Sintaxe correta.*/
    private static void log3() {}

}
