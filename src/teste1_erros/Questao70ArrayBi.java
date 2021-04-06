package teste1_erros;

public class Questao70ArrayBi {
    public static void main(String[] args) {
        String [][] countries = {{"SINGAPORE", "AUSTRALIA"}, {"CHINA", "RUSSIA"}};
        
        for(String [] arr : countries)
        	for(String country: arr)
        		System.out.print(country + " ");
        
        for(int i = 0; i < countries.length; i++)
        	for(int j = 0; j < countries.length; j++)
        		System.out.print(countries[i][j] + " ");
    }
}
