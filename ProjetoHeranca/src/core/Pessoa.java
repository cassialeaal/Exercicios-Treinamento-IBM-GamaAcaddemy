package core;

//SUPER CLASSE

public class Pessoa {
	/*private String nome;
	private String email;
	private String telefone;*/
	
	//O uso de protected permite que a classe herdeira possa usar
	//de forma direta as variaveis nome, email e telefone.
	protected String nome;
	protected String email;
	protected String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String exibirInfo() {
		return nome+"/"+email+"/"+telefone;
	}
}
