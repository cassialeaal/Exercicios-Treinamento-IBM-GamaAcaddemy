
public class Agenda {

	public static void main(String[] args) {
		
		BancoDeDados sintaxeBanco = new BancoDeDados();
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.estaConectado()) {
			//PERMITE CHAMAR A OPCAO READ DO CRUD
			sintaxeBanco.listaContatos();
			
			//PERMITE CHAMAR A OPCAO INSERT DO CRUD
			//sintaxeBanco.inserirContatos("José Roberto");
			
			//PERMITE CHAMAR A OPCAO UPDATE DO CRUD
			//sintaxeBanco.editarContatos ("1", "Cassia Leal");
			
			//sintaxeBanco.apagarContatos ("1");
			
			System.out.println("Conexão com Banco de Dados foi feita com êxito!");
		}
		else {
			System.out.println("Não foi possível conectar ao Banco de Dados");
		}
	}
}
