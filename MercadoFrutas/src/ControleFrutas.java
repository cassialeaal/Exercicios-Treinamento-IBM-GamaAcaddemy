import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas {

	public static void main(String[] args) {
		//switch case 
		/*1 - cadastrar frutas - add
		2 - listar frutas - variavel
		3- excluir frutas - remove
		4- listar frutas com o ID - get
		5- modificar uma fruta - set
		*/
		
		ArrayList<String> frutas = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);

		frutas.add("Maça");
		frutas.add("Banana");
		
		int opcao, id;
		String nomeFruta;
		
		
		do {
			System.out.println("Escolha uma opção: ");
			System.out.printf("\n 1-Cadastrar Frutas\n 2-Listar Frutas\n 3-Excluir Frutas\n 4-Listar Frutas com ID\n 5-Modificar Fruta\n 6-Fechar Progama\n");			
			opcao = entrada.nextInt();
			
			/*if(opcao <1 || opcao >5) {
				System.out.println("Escolha um valor correspondente as opções!");
			}*/
			
			switch(opcao) {
			case 1:
				System.out.println("Qual fruta você deseja adicionar:");
				Scanner entrada1 = new Scanner(System.in);
				nomeFruta = entrada1.nextLine();
				frutas.add(nomeFruta);
				System.out.println(" ");
				System.out.println("A lista atual de frutas é:");
				for(String i: frutas) {
					System.out.println(i);
				}
				System.out.println(" ");
				do {
					System.out.println("Quer cadastrar mais frutas?");
					System.out.printf("\n 1-Sim\n 2-Não\n");
					opcao = entrada.nextInt();
					if(opcao == 1) {
						System.out.println("Qual fruta você deseja adicionar:");
						nomeFruta = entrada.nextLine();
						frutas.add(nomeFruta);
						System.out.println("A lista atual de frutas é:");
						for(String i: frutas) {
							System.out.println(i);
						}
					}
					else if(opcao == 2)
							break;
					}while(opcao>=1 || opcao <=5);		
				break;
			case 2:
				System.out.println("A lista atual de frutas é:");
				for(String i: frutas) {
					System.out.println(i);
				}
				System.out.println(" ");
				break;
			
			case 3:
				System.out.println("Informe qual fruta você quer excluir: ");
				id = entrada.nextInt();				
				frutas.remove(id);
				System.out.println("A lista atual de frutas é:");
				for(String i: frutas) {
					System.out.println(i);
				}
				break;
			
			case 4:
				System.out.println("A lista atual de frutas é:");
				for(int i=0; i < frutas.size();i++) { 
					System.out.println("Fruta: "+i+"-"+frutas.get(i));
				}
				break;
			
			case 5:
				System.out.println("Informe o ID da fruta você quer modificar: ");
				int indice = entrada.nextInt();
				System.out.println("Informe o nome da nova fruta: ");
				Scanner entrada2 = new Scanner(System.in);
				nomeFruta = entrada2.nextLine();
				frutas.set(indice, nomeFruta);
				System.out.println("A lista atual de frutas é:");
				for(String i: frutas) {
					System.out.println(i);
				}
				
				break;
			case 6:
				break;
			default:
					System.out.println("Escolha uma opção válida!");
			}
			/*if(opcao <1 || opcao >5) {
				System.out.println("Escolha um valor correspondente as opções!");
			}
			else {
				break;
			}*/
		} while(opcao>=1 || opcao <=6);
		entrada.close();
	
	}

}
