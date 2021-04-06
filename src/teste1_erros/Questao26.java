package teste1_erros;

import java.util.ArrayList;
import java.util.List;

class Funcionario{
	String nome = "frede";
	int idade = 29;
}

public class Questao26 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");
        String teste = list.remove(2);
        
       // if(list.remove(2)) {
        //    list.remove("THREE");
       // }
        
        System.out.println(list);
        Funcionario f = new Funcionario();
        Funcionario f2 = new Funcionario();
        List<Funcionario>listaF = new ArrayList<>();
        listaF.add(f);
        listaF.add(f2);
        Funcionario funcioRemovido = listaF.remove(0);
        System.out.println(listaF);
    }
}