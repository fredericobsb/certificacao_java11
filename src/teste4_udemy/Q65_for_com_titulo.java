package teste4_udemy;

public class Q65_for_com_titulo {
    public static void main(String[] args) {
        int ctr = 100;
        one: for (var i = 0; i < 10; i++) {
            two: for (var j = 0; j < 7; j++) {
                three: while (true) {
                    ctr++;
                    if (i > j) {
                        break one;
                    } else if (i == j) {
                        break two;
                    } else {
                        break three;
                    }
                }
            }
        }
        System.out.println(ctr);
    }
}
