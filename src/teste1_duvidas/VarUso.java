package teste1_duvidas;

public class VarUso {

	public static void main(String[] args) {
		var score = 30;
		var grade = 'F';
		//The operator < is undefined for the argument type(s) boolean, int
		if(50 <= score < 60)
			grade = 'D';
		
		//The operator < is undefined for the argument type(s) boolean, int
		else if (60 <= score < 70)
			grade = 'C';
		
		//The operator < is undefined for the argument type(s) boolean, int
		else if (70 <= score < 80)
			grade = 'D';
		
		else if (score >= 80)
			grade = 'A';
		
		System.out.println(grade);
		
	}

}
