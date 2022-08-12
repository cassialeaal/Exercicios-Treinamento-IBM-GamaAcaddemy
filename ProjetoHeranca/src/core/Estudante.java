package core;

// SUB CLASSE : QUE HERDA AS INFORMAÇÕES DA CLASSE Pessoa

public class Estudante extends Pessoa{
	private int numeroMatricula;
	private String curso;
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String exibirInfo() {
		//return getNome()+"/"+getEmail()+"/"+getTelefone()+"/"+numeroMatricula+"/"+curso;
		// só é possivel usar diretamente as variaveis nome, email e telefone porque a classe pai
		// usa protected na declaracao dos atributos
		return nome+"/"+email+"/"+telefone+"/"+numeroMatricula+"/"+curso;		
	}
}
