package model;

public abstract class Funcionario {
	protected int numRegistro;
	protected String nome;
	
	public Funcionario(int numRegistro, String nome) {
		super();
		this.numRegistro = numRegistro;
		this.nome = nome;
	}
	
	//a classe abstract é apenas declarada e obriga
	// as classes filhas a implementar uma lógica
	//para esta classe
	public abstract double calcularSalario();
	
	public int getNumRegistro() {
		return numRegistro;
	}
	
	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
