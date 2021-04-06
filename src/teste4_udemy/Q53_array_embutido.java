package teste4_udemy;

public class Q53_array_embutido {
    public static void main(String[] args) {
        String furniture = new String(new char[] {'S', 'o', 'f', 'a'});
        switch (furniture) {
            default:
            case "Recliner":
                System.out.println("RECLINER");
            case "Sofa":
                System.out.println("SOFA");
            case "Bed":
                System.out.println("BED");
                break;
        }
    }
}
