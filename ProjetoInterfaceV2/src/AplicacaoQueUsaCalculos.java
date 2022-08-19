
public class AplicacaoQueUsaCalculos {
	public static void main(String[] args){
		ObjetoQueCalcula o = new ObjetoQueCalcula();
		o.realizaAlgumCalculo();
		
		InterfaceModulo1 i1 = o;
		i1.calcularValores();
		
		InterfaceModulo2 i2 = o;
		i2.efetivarContas();
		
	}
}
