package exame1_udemy;

public class Questao2 {
	public static void main(String[] args) {
        String javaworld = "JavaWorld";
        String java = "Java";
        String world = "World";
        java += world;
        System.out.println(java == javaworld);
        //curiosidade:
        System.out.println(java.equals(javaworld));
    }
}
//imprime o que?

