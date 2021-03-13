package exame1_udemy;

	interface Parent {
        default void earn() {
            System.out.println("Earning for the family");
        }
     
        public static void plan() {
            planRetirement();
            planChildrenEducation();
        }
     
        private static void planChildrenEducation() {
        	System.out.println("planChildrenEducation...");
        }
     
        private static void planRetirement() {
           System.out.println("planRetirement...");
        }
     
        String toString();
    }
     
    interface Child extends Parent {
        void play();
    }
     
    public class Questao1 {
        public static void main(String[] args) {
            Child child = () -> System.out.println("PLAYING CRICKET..."); //Line n1
            child.play(); //Line n2
            
            //curiosidade abaixo:
            Child child2 = () -> System.out.println("arroh");
            child2.earn();
            child2.play();
        }
    }
