package teste4_udemy;

import java.io.IOException;

//Which 2 changes are necessary so that code compiles successfully?

class ReadTheFile {
    static void print() throws Exception{ //Line n1
        throw new IOException(); //Line n2
    }
}
 
public class Q78_hierarquia_excecoes {
    public static void main(String[] args) { //Line n3
        try {
			ReadTheFile.print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Line n4
    }
}

/*
 Linha n2 lança uma excecao checada (IOException), mas isso nao tem "throws" no metodo print.
 Logo, o metodo print (linha n1) deveria ter um "throws" com IOException ou uma das classes do topo
 da hierarquia, como Exception ou  Throwable.
 
 Mas mesmo assim, linha n4 daria erro de compilacao. Tem que fazer um try catch OU
 throws: IOException, Exception ou Throwable.
 
 Se fizer try catch, tem que ser tratando: IOException, Exception ou Throwable.
 
 Como não tem nenhuma opção de resposta lançando Throwable no catch, o metodo print DEVE
 lançar exception, para combinar com o Exception do try catch que há como resposta.
 * */

