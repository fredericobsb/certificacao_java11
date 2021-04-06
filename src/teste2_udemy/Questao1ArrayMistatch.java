package teste2_udemy;

import java.util.Arrays;

public class Questao1ArrayMistatch {
    public static void main(String[] args) {
        char[] c1 = { 'T', 'A', 'L', 'K' };
        char[] c2 = { 'T', 'A', 'L', 'L' };
        
      //retorna o indexx do primeiro mismatch(elemento faltante)
      System.out.println(Arrays.mismatch(c1, c2));
      
      /************ COMPARANDO ARRAYS CHAR */
      //de K para L, (ordem alfabetica) falta 1, logo, o resultado do compare é -1.
      System.out.println(Arrays.compare(c1, c2));
      
      char[] c3 = { 'T', 'A', 'L', 'L' };
      char[] c4 = { 'T', 'A', 'L', 'K' };
      //de L para K, (ordem alfabetica) sobra 1, logo, o resultado do compare é 1.
      System.out.println(Arrays.compare(c3, c4));
      
      char[] c5 = { 'T', 'A', 'L', 'L' };
      char[] c6 = { 'T', 'A', 'L', 'P' };
      //de L para P, (ordem alfabetica) falta 4, logo, o resultado do compare é -4.
      System.out.println(Arrays.compare(c5, c6));
      
      char[] c7 = { 'T', 'A', 'L', 'P' };
      char[] c8 = { 'T', 'A', 'L', 'L' };
      //de P para L, (ordem alfabetica) sobra 4, logo, o resultado do compare é 4.
      System.out.println(Arrays.compare(c7, c8));
      
      System.out.println(Arrays.mismatch(c1, c2) * Arrays.compare(c1, c2));
      
      //For Character, Byte & Short; compare method returns x - y:
      
      /************ COMPARANDO ARRAYS CHARACTER (igual ao char) */
      Character[] a1 = {'A','B','C','D'};
      Character[] a2 = {'A','B','C','F'};
      System.out.println(Arrays.compare(a1, a2));
      
      Character[] a3 = {'A','B','C','F'};
      Character[] a4 = {'A','B','C','D'};
      System.out.println(Arrays.compare(a3, a4));
      
     /*********** COMPARANDO ARRAYS BYTE*/
      Byte [] b1 = {2,3,4,5};
      Byte [] b2 = {2,3,4,9};
      
      // de 5 para 9, falta 4. logo, imprime -4.
      System.out.println(Arrays.compare(b1, b2));
      
      //de 9 para 5 sobram 4, logo, imprime 4.
      System.out.println(Arrays.compare(b2, b1));
      
      byte [] b3 = {2,3,4,5};
      byte [] b4 = {2,3,4,9};
      
      // de 5 para 9, falta 4. logo, imprime -4.
      System.out.println(Arrays.compare(b3, b4));
      
      //de 9 para 5 sobram 4, logo, imprime 4.
      System.out.println(Arrays.compare(b4, b3));
      
      /*********** COMPARANDO ARRAYS short*/
      short[] s1 = {2,3,4,5};
      short [] s2 = {2,3,4,9};
      
      // de 5 para 9, falta 4. logo, imprime -4.
      System.out.println(Arrays.compare(s1, s2));
      
      //de 9 para 5 sobram 4, logo, imprime 4.
      System.out.println(Arrays.compare(s2, s1));
      
      /*For Integer and Long; compare method returns -1 if x < y, 
        it returns 1 if x > y 
        and it returns 0 if x == y.
     */
      Integer [] array1 = {2,3,4,5};
      Integer [] array2 = {2,3,4,9};
      Integer [] array3 = {2,3,4,9};
      System.out.println(Arrays.compare(array1, array2));
      System.out.println(Arrays.compare(array2, array1));
      System.out.println(Arrays.compare(array2, array3));
      
      /*********** COMPARANDO ARRAYS Long*/
      Long [] l1 = {100L, 101L,102L};
      Long [] l2 = {100L, 101L,107L};
      Long [] l3 = {100L, 101L,107L};
      System.out.println(Arrays.compare(l1, l2));
      System.out.println(Arrays.compare(l2, l1));
      System.out.println(Arrays.compare(l2, l3));
      
      /*********** COMPARANDO ARRAYS Float*/
      Float [] f1 = {0.1f, 0.3f, 0.5f};
      Float [] f2 = {0.1f, 0.3f, 0.9f};
      Float [] f3 = {0.1f, 0.3f, 0.9f};
      System.out.println(Arrays.compare(f1, f2));
      System.out.println(Arrays.compare(f2, f1));
      System.out.println(Arrays.compare(f2, f3));
      
      /*********** COMPARANDO ARRAYS Doouble*/
      Double [] d1 = {1.1d, 1.2d, 1.3d};
      Double [] d2 = {1.1d, 1.2d, 1.8d};
      Double [] d3 = {1.1d, 1.2d, 1.8d};
      System.out.println(Arrays.compare(d1, d2));
      System.out.println(Arrays.compare(d2, d1));
      System.out.println(Arrays.compare(d2, d3));
      
      /*********** COMPARANDO ARRAYS boolean*/
      Boolean [] bb1 = {true, false, true, true};
      Boolean [] bb2 = {true, false, true, false};
      Boolean [] bb3 = {true, false, true, false};
      System.out.println(Arrays.compare(bb1, bb2));
      System.out.println(Arrays.compare(bb2, bb1));
      System.out.println(Arrays.compare(bb2, bb3));
    }
}
