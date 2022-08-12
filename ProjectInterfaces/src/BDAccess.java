
public class BDAccess implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Conectando no BD Acess");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando no BD Acess");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("Microsoft Acess " + comando);
		
	}
	
}
