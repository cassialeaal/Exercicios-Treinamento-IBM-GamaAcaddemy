package model;

public class Horista extends Funcionario {
	private int numeroHoras;
	private double valorHora;
	
	public Horista(int numRegistro, String nome, int numeroHoras, double valorHora) {
		super(numRegistro, nome);
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return numeroHoras*valorHora;
	}
	
	
	
	
}
