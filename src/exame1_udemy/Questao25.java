package exame1_udemy;

import java.util.ArrayList;
     
	    class Counterr {
	        int count;
	        Counterr(int count) {
	            this.count = count;  
	        }
	        
	        public String toString() {
	            return "Counter-" + count;
	        }
	    }
	     
	    public class Questao25 {
	        public static void main(String[] args) {
	            ArrayList<Counterr> original = new ArrayList<>(); //Line n1
	            original.add(new Counterr(10)); //Line n2
	            
	            ArrayList<Counterr> cloned = (ArrayList<Counterr>) original.clone();
	            cloned.get(0).count = 5;
	            
	            System.out.println(original); //alterou a copia, altera o original.
	            
	            ArrayList<Counterr> cloned2 = new ArrayList<>();
	            cloned2.add(new Counterr(40));
	            System.out.println(cloned2); // imprimeiu 40 porque é objeto novo!
	        }
	    }
