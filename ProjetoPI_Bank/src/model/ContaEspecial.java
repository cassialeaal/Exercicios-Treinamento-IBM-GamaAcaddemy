package model;

public class ContaEspecial extends Conta{
	private double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numero, double saldo, double limite) {
		super(nomeTitular, cpf, numero, saldo);
		this.limite = limite;
	}

	@Override
	public boolean debitar(double valor) {
		if(super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() +" Limite R$"+this.limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
