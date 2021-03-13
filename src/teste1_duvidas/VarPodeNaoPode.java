package teste1_duvidas;

import java.util.ArrayList;

public class VarPodeNaoPode {
	
	VarPodeNaoPode(var valor){//NAO PODE como parametro de construtor
		
	}

	var teste1 = "var1"; //NÃO PODE variavel de classe
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public var testeTipoRetornoVar() {//NÃO PODE como tipo de retorno de metodo
		System.out.println("testando var");
	}
	
	public String varComoParametro(var valor) {//NAO PODE como parametro de metodo
		return null;
	}
	
	/**************ABAIXO SEGUE CASOS PERMITIDOS DE VAR *****************/
	
	//EXEMPLOS DE VARIAVEL LOCAL => VALIDA
	public void varComoVariavelLocalValido() {
		var valor = 23;
		var j = 1.0f/2;
		short s = 1;
		var k = +s;
		var list = new ArrayList<>();
		var myArray = new String[5];
	}
	
	//EXEMPLOS DE VARIAVEL LOCAL => INVALIDA
		public void varComoVariavelLocalInValido() {
			
			var j, k = 1; //can not be used in a compound statement
			
			var integer; // tem que inicializar
			
			var myObject = null; //nao pode ser inicializado com null. tipo nao pode ser inferido.
			
			var myArray = {"A", "B"}; //can not be initialized with an array initializer.
		}
	
	//blocos de codigo
	{
		var teste = "arroh";
	}
	
	//loop variaveis
	public void testeVarEmLoop() {
		int tamanho= 5;
		for(var i = 0; i < tamanho; i++) {
			System.out.println("pode " + i);
		}
	}

}
