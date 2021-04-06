package teste4_udemy;

public class Q66_numeros_com_Undescore {
    public static void main(String[] args) {
        char c = 'Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f; 
        double d = 10_0.35d;
        l = c + i;
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;
        int teste = (int) c;//ASCII
    }
}
