
public class BDAcess implements InterfaceBancoDados{

	@Override
	public void conectar() {
		System.out.println("Conectando no banco ACCESS");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando no banco ACCESS");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("Microsoft ACCESS " + comando);
		
	}
	
}
