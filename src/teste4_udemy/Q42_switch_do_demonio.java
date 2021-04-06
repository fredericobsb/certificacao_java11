package teste4_udemy;

	public class Q42_switch_do_demonio {
	    public static void main(String[] args) {
	        int x = 2;
	        switch (x) {
	            default:
	                System.out.println("Still no idea what x is");
	            case 1:
	                System.out.println("x is equal to 1");
	                break;
	            case 2:
	                System.out.println("x is equal to 2");
	                break;
	            case 3: 
	                System.out.println("x is equal to 3");
	                break;
	        }
	    }
	}
/*
 Even though default block is available at the top but matching case is present. 
 So control goes inside matching case and prints "x is equal to 2" on to the console. 
 After that break; statement takes the control out of the switch-case block. 
 */
