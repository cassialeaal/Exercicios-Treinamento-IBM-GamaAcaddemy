
public class MeuSistema {
	public static void Main(String[] argas) {
	InterfaceBancoDados ibd = new BDMysql();
	

	
	//CONECTAR NO BANCO DE DADOS
	ibd.conectar();
	
	//RECUPERAR DADOS
	ibd.executar("select * from tb_clientes");
	
	//DESCONECTAR
	ibd.desconectar();
	
	}
}

