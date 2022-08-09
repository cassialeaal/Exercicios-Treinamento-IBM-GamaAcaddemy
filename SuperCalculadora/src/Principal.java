import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Entrada de 2 números e menu para escolher a operação
		1- adicao
		2- subtração
		3- multiplicacao
		4- divisao
		*/
		
		double  x, y;
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo à Suuuper Calculadora!");

		do {
			System.out.println("Informe o primeiro número: ");
			x = entrada.nextDouble();
			System.out.println("Informe o segundo número");
			y = entrada.nextDouble();
			System.out.println("Escolha a operação desejada:");
			System.out.printf("\n1- Adição \n2-Subtração \n3-Multiplicação \n4-Divisão \n5- Fechar Calculadora \n");
			opcao = entrada.nextInt();
			
			switch (opcao){
				case 1:
					Soma operacao = new Soma();
					operacao.somar(x,y);
					break;
				case 2:
					Subtrai operacao1 = new Subtrai();
					operacao1.subtrair(x,y);
					break;
				case 3:
					Multiplica operacao2 = new Multiplica();
					operacao2.multiplicar(x,y);
					break;
				case 4:
					if(y == 0) {
						System.out.println("Numero Inválido! Insira números válidos");
						break;
					}
					else {
					Divide operacao3 = new Divide();
					operacao3.dividir(x,y);
					}
					break;
				case 5:
					break;
					default:
						break;
				
			}
		} while(true);
	}

}
