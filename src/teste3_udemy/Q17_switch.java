package teste3_udemy;

public class Q17_switch {
	public static void main(String[] args) {
        String sport = "swimming";
        switch (sport) {
            default:
                System.out.println("RUNNING");
            case "Tennis":
                System.out.println("TENNIS");
               
            case "Swimming":
                System.out.println("SWIMMING");
                break;
            case "Football":
                System.out.println("FOOTBALL");
                
        }
    }
}
