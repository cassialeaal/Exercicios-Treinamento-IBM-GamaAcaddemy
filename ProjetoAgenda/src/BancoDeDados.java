import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {

	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset = null;
	
	//PASSAGEM DE PARÂMETROS PARA CONEXÃO DO BANCO DE DADOS
	public void conectar() {
		//CRIAÇÃO DA VARIAVEL PARA CONECTAR AO DATABASE
		String servidor = "jdbc:mysql://localhost/ibm";
		
		//USUARIO DO BANCO DE DADOS
		String usuario =  "root";
		
		//SENHA DO USUARIOO DO BANCO DE DADOS
		String senha = "mysql";
		
		//VINCULANDO O DRIVE DE CONEXÃO
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//PERMITE VERIFICAR O TRATAMENTO DA EXCEÇÃO CASO OK BANCO DE DADOS FALHAR
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor,usuario,senha);
			this.statement = this.connection.createStatement();
		} 
		catch(Exception e) {
			System.out.println("Erro:"+e.getMessage());
		}
	}
	public boolean estaConectado() {
		if(this.connection != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//CRIANDO O METODO PARA CONSULTA DE DADOS DE REGISTRO EM SQL
	public void listaContatos() {
		
		try{
		
			//TRATANDO A EXCEÇÃO NO RETORNO NO SELECT
			String query = "Select * from contatos";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
		
			//CRIANDO UM LAÇO DE REPETIÇÃO PARA RETORNAR REGISTRO DA TABELA
			while(this.resultset.next()) {
				String meuID = resultset.getString("id");
				String meuNome = resultset.getString("contatos");
				System.out.println("id:"+meuID);
				System.out.println("nome:"+meuNome);
				}
			} 
		catch(Exception e) {
				System.out.println("Erro:"+e.getMessage());
			}
	}
	
	//METODO DE INSERÇÃO DE REGISTROS
	public void inserirContatos(String contatos) {
		try {
			//LINHA DE EXECUÇÃO DA SINTAXE DE INSERT EM SQL
			String query = "insert into contatos (contatos) values ('"+contatos+"');";
			System.out.println(query);
			this.statement.executeUpdate(query);
			
		}
		catch(Exception e){
			System.out.println("Erro:"+e.getMessage());
		}
	}
	
	//METODO DE UPDATE DE REGISTROS
	public void editarContatos(String id, String contatos) {
		try {
			//EXECUTAR SINTAXE DE UPDATE EM SQL
			String query = "update contatos set contatos='" +contatos+ "' where id='" +id+ "';";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}
		catch(Exception e) {
			System.out.println("Erro:"+e.getMessage());
		}
	}
	
	//METODO DE DELETE DE REGISTROS
	public void apagarContatos(String id) {
		try {
			//EXECUTAR SINTAXE DE DELETE EM SQL
			String query = "delete from contatos where id='" +id+ "';";
			System.out.println(query);
			this.statement.executeUpdate(query);
		}
		catch(Exception e) {
			System.out.println("Erro:"+e.getMessage());
		}
	}
}
