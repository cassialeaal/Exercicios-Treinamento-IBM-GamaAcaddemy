
public class MeuSistema {
	
	InterfaceBancoDados ibd = new BDAcess();
	

	
	//CONECTAR NO BANCO DE DADOS
	ibd.executar();
	
	//RECUPERAR DADOS
	ibd.executar("select * from tb_clientes");
	
	//DESCONECTAR
	ibd.desconectar();

}

