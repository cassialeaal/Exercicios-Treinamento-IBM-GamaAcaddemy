package model;

public class Comissionado extends Funcionario{
	private double salarioBase;
	private double comissao;
	
	public Comissionado(int numRegistro, String nome, double salarioBase, double comissao) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return salarioBase+salarioBase*comissao/100;
	}
	
	
	
}
