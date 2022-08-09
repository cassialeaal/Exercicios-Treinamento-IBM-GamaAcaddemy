import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeraArquivo {

	public static void main(String[] args) throws IOException {
		//Criando um procedimento de inserção de registros com ArrayList
				ArrayList <String> nomeClientes = new ArrayList<String>();
				nomeClientes.add("Cassia");
				nomeClientes.add("Antonio");
				nomeClientes.add("Maria");
				nomeClientes.add("Ana");
				nomeClientes.add("Kaline");
				nomeClientes.add("Roberto");

				FileWriter arquivo = new FileWriter("C:\\Users\\Cassia Leal\\Desktop\\clientes.txt");
				PrintWriter gravarArquivo = new PrintWriter(arquivo);
				
				//Update de arquivo criado
				for(String contador: nomeClientes) {
					gravarArquivo.println(contador);
				}
				//Criando o arquivo
				//gravarArquivo.println(nomeClientes);
				
				
				arquivo.close();
				System.out.println("Criação do arquivo na unidade C:\\Users\\Cassia Leal\\Desktop\\clientes.txt");
	}

}
