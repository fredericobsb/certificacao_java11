package secao4;

public class Teste2 {
    public static float getTaxRate(String state) {
        float tax; 
        switch (state) {   // Line 1
            default:   // Line 2
                tax = 0.05f;
            case "PA":
                tax = 0.06f;
                break;
            case "NJ":
                tax = 0.07f;
                break;
        }
        return tax;    // Line 3
    }
 
    public static void main(String[] args) {
        var price = 100;
        var tax_rate = getTaxRate("NH");  // Line 4
        var tax  =  price * tax_rate;  // Line 5
        switch (tax) {          // Line 6
            case 5:
                System.out.println("Taxed at 5%");
                break;
            case 6:
                System.out.println("Taxed at 6%");
                break;
            case 7:
                System.out.println("Taxed at 7%");
                break;
            default:            // Line 7
        }
    }
}