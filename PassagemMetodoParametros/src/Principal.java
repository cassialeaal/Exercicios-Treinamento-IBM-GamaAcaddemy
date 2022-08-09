import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//DECLARAÇÃO DAS VARIÁVEIS
		String Nome,Email;
		int Idade;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Preencha o campo Nome: ");
		Nome = entrada.nextLine();
		System.out.println("Preencha o campo Email: ");
		Email = entrada.nextLine();
		System.out.println("Preencha o campo Idade: ");
		Idade = entrada.nextInt();
		
		//CHAMANDO A CLASSE E SEU MÉTODO, PASSANDO OS PARÂMETROS
		MandaMensagem executar = new MandaMensagem();
		executar.mensagem(Nome, Email, Idade);

		
		entrada.close();
	}

}
