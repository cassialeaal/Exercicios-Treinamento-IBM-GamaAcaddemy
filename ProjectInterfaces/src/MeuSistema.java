
public class MeuSistema {
	public static void main(String[] args) {
		InterfaceBD ibd = new BDMysql();
		
		//CONECTAR BD
		ibd.conectar();
		//RECUPERAR BD
		ibd.executar("select * from tb_clientes");
		//DESCONECTAR BD
		ibd.desconectar();
		
	
	}
}
