
public class MostraCasos {

	public static void main(String[] args) {
		// Criando um switch case
		
		/*do{
		 * System.out.println("Escolha a opção desejada: ");
			System.out.println("1- Mostrar todos os carros");
			System.out.println("2- Escolher número do carro");
			System.out.println("3- Fechar programa");
			
		 * }while(!opcao);
		 * 
		 * String[] carros = {10 carros};
		 * */
		int opcao = 2;
		String[] carros = {"Sandero","Fusion","Prisma"};
		
		System.out.println("Escolha a opção desejada: ");
		System.out.println("1- Carros Honda");
		System.out.println("2- Todos os Carros");
		
		switch(opcao) {
		case 1:
			System.out.println("Nao temos carros para alocar");
			break;
		case 2:
			for(int i=0; i < carros.length;i++)
				System.out.println(carros[i]);
			break;
		default:
			System.out.println("Opção não existe!");
		}
		

	}

}
