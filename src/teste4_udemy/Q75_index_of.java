package teste4_udemy;

public class Q75_index_of {
    public static void main(String[] args) {
        String [] arr = {"1st", "2nd", "3rd", "4th", "5th"};
        String place = "faraway";
        /*
         *  Encontre a primeira ocorrencia da letra "a" na string "faraway", começando a busca
         *  a partir do indice 3.
         */
        System.out.println(arr[place.indexOf("a", 3)]); //Line n1
        
        String teste = "abcdef";
        /*
         * Encontre a primeira ocorrencia da letra "d" na string "abcdef", começando a busca
         * a partir do indice 2 da string "abcdef".
         * */
        System.out.println(teste.indexOf("e",2));
        
        String teste2 = "Frederico Lopes Ramoz";
        //System.out.println(teste2.indexOf("z", 0));//20
        System.out.println(teste2.indexOf("z", 9));//11
        System.out.println(teste2.indexOf("z", 16));//4
    }
}



