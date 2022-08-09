/*
 * Participante: Cássia Roberta Maria Leal - Turma 1 - Gama Academy + IBM
 * Criando programa de locação de carros utilizando as condições Switch Case e FOR
*/
import java.util.Scanner;

public class ProcessaLocacao {

	public static void main(String[] args) {
	

		//DECLARACOES
		Scanner entrada = new Scanner(System.in);
		String[] carros = {"Hyundai HB20","Fiat Argo","Jeep Renegade","Chevrolet Onix","Jeep Compass","Volkswagen Gol","Fiat Mobi","Hyundai Creta","Volkswagen T-Cross","Chevrolet Onix Plus"}; //Os 10 carros mais vendidos no Brasil em 2021, segundo o site CanalTech

		
		do{
			//ENTRADA DE DADOS	
			System.out.println("Escolha a opção desejada: ");
			System.out.println("1- Mostrar todos os carros");
			System.out.println("2- Escolher número do carro");
			System.out.println("3- Fechar programa");
			
			int opcao = entrada.nextInt();
			
			//RESTRIÇÕES
			if(opcao == 3)
				break;
			
			//PROCESSAMENTO E SAÍDA
			switch(opcao) {
			
			case 1:
				System.out.println("Temos os seguintes carros:");
				for(int i=0; i < carros.length;i++)
					System.out.println((i+1)+" - "+carros[i]);
				System.out.println(" ");
				break;
			
			case 2:
				do {
					System.out.println("As opções de carros são:");
					
					for(int j=0; j < carros.length;j++) {
						System.out.println((j+1)+" - "+carros[j]);}
						
						System.out.println("Escolha uma opção:");
						int opcaoCarros = entrada.nextInt();
						
						switch(opcaoCarros) {
						case 1:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[0]+"!");
							System.out.println(" ");
							break;
						case 2:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[1]+"!");
							System.out.println(" ");
							break;
						case 3:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[2]+"!");
							System.out.println(" ");
							break;
						case 4:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[3]+"!");
							System.out.println(" ");
							break;
						case 5:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[4]+"!");
							System.out.println(" ");
							break;
						case 6:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[5]+"!");
							System.out.println(" ");
							break;
						case 7:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[6]+"!");
							System.out.println(" ");
							break;
						case 8:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[7]+"!");
							System.out.println(" ");
							break;
						case 9:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[8]+"!");
							System.out.println(" ");
							break;
						case 10:
							System.out.println("Parabéns!! Você escolheu o carro "+carros[9]+"!");
							System.out.println(" ");
							break;
						default:
							System.out.println("Escolha uma opção válida!");
							System.out.println(" ");
							break;
						}
				if(opcaoCarros >= 1 && opcaoCarros <=10) {
					break;
				}
				} while(true);

			case 3:
				break;
			default:
				System.out.println("Opção Inválida! Insira uma das opções listadas.");
				System.out.println(" ");
			}
			
		 } while(true);
		 
	entrada.close();
	}

}
