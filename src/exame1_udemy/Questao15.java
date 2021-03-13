package exame1_udemy;

public class Questao15 {
    public static void main(String[] args) {
        for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
        	//z -= 2;
            System.out.println(x + y + z);//x = 10, y = 11,  z = 12 ===> 33
        }
    }
}
