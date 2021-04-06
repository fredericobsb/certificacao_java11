package teste4_udemy;

class Funcionario{
	String nome;
    Double salario;
    
    Funcionario(){
    	this("Fred", 10000.50d);
    }
    
    Funcionario(String nome, double salario){
    	this.nome = nome;
    	this.salario = salario;
    }
}

public class Teste_construtores {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		System.out.println(f.nome + " - " + f.salario);
	}
}
