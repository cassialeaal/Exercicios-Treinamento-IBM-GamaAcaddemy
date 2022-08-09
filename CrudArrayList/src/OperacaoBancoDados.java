import java.util.ArrayList;

public class OperacaoBancoDados {

	public static void main(String[] args) {
		
		//Criando um procedimento de inserção de registros com ArrayList
		ArrayList <String> nomeClientes = new ArrayList<String>();
		nomeClientes.add("Cassia");
		nomeClientes.add("Antonio");
		nomeClientes.add("Maria");
		nomeClientes.add("Ana");
		
		//Modo de visualização de todos os registros alocados na variável nomeClientes
		System.out.println(nomeClientes);
		
		//Visualizando um registro desejado dentro da nossa base
		System.out.println(nomeClientes.get(0));
		 
		//Criando um procedimento de inserção de registros com ArrayList e set
		ArrayList <String> marcas = new ArrayList<String>();
		marcas.add("Fiat");
		marcas.add("Chevrolet");
		marcas.add("Ford");
		marcas.add("BMW");
		System.out.println(marcas);
		marcas.set(0, "Volkswagem" );
		System.out.println(marcas);
		marcas.add(1, "Fiat" );
		System.out.println(marcas);
		
		//Removendo registros dentro da nossa estrutura de ArrayList
		marcas.remove(4);
		System.out.println(marcas);

		//Retornando a quantidade de registros de um ArrayList
		System.out.println(marcas.size());
		
		//Como utilizar um size dentro do nosso laço de repetição
		for(int i=0; i < marcas.size();i++) { //loop normal
			System.out.println("Registro "+i+"-"+marcas.get(i));
		}
		System.out.println(" ");
		
		for(String i: marcas) {  //loop sem estrutura normal. Imprime o conteudo dentro de marcas
			System.out.println(i);
		}
		
	}

}
