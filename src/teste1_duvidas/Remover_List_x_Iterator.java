package teste1_duvidas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Funcionario{
	
	String nome;
	Integer id;
	String cargo;
}

public class Remover_List_x_Iterator {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.cargo = "Gerente";
		f1.nome = "Rodrigo";
		f1.id = 1;
		
		Funcionario f2 = new Funcionario();
		f2.cargo = "Repositor";
		f2.nome = "Carlos";
		f2.id = 2;
		
		Funcionario f3 = new Funcionario();
		f3.cargo = "Segurança";
		f3.nome = "Fred";
		f3.id = 3;
		
		List<Funcionario>listaFunc = new ArrayList<>();
		listaFunc.add(f1);
		listaFunc.add(f2);
		listaFunc.add(f3);
		
		/*
		for(Funcionario fu : listaFunc) {
			if(fu.id == 1) 
				listaFunc.remove(fu);//ConcurrentModificationException
		}
		*/
		
		/*
		Iterator<Funcionario>iterator = listaFunc.iterator();
		Predicate <Funcionario> predicate = f -> f.id == 1;
		while(iterator.hasNext()) {
			if(predicate.test(iterator.next())) {
				iterator.remove();
			}
		}
		for(Funcionario f : listaFunc) {
			System.out.println("nome = " + f.nome + " cargo = " + f.cargo);
		}
		
		Iterator<Funcionario>iterator2 = listaFunc.iterator();
		Predicate<Funcionario>predicate2 = p2 ->p2.id == 2;
		
		while(iterator2.hasNext()) {
			if(predicate2.test(iterator2.next())) {
				iterator2.remove();
			}
		}
		
		for(Funcionario ff : listaFunc) {
			System.out.println("nome = " + ff.nome + " cargo = " + ff.cargo);
		}
		*/
		
		
	
	}

}
