
public class ObjetoQueCalcula implements InterfaceModulo1,InterfaceModulo2 {
	public void realizaAlgumCalculo() {
		System.out.println("Pronto Calculei");
	}

	@Override
	public void efetivarContas() {
		realizaAlgumCalculo();
	}

	@Override
	public void calcularValores() {
		realizaAlgumCalculo();		
	}
}
