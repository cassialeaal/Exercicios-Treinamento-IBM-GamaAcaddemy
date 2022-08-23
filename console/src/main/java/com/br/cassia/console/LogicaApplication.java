package com.br.cassia.console;

//import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.io.InputStreamReader;
import java.util.Scanner;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(LogicaApplication.class, args);
		
		System.out.println("================================");
		System.out.println("Java Console");
		System.out.println("================================");

		/*System.out.println("\nInforme seu nome:");
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        String name = reader.readLine();
		
		System.out.println("\nSeja bem vinda "+name+" !");
        // Printing the read line
        //System.out.println(name);*/
		
		int opcao;
		String nome;
		int codigoProduto;
		double valorProduto;
		int qtdProduto;
		int qtdVendido;
		ArrayList<Integer> nomeProdutoVendido = new ArrayList<Integer>();
		ArrayList<Integer> qtdProdutoVendido = new ArrayList<Integer>(); 


		Scanner entrada = new Scanner(System.in);

		System.out.println("Olá! Bem vindo!");
		do{
			System.out.println("\nEscolha a opção desejada:\n");
			System.out.println("   1 - Cadastrar Produto\n   2 - Vender Produto\n   3 - Mostrar relatório de vendas\n   4 - Fechar Programa\n");
			opcao = entrada.nextInt();
			switch(opcao){
				case 1: 
					//Cadastrar Produto
					System.out.println("\nInforme o nome do produto:");
					nome = entrada.nextLine();
					System.out.println("\nInforme o codigo do produto:");
					codigoProduto = entrada.nextInt();
					System.out.println("\nInforme o valor do produto:");
					valorProduto = entrada.nextDouble();
					System.out.println("Informe o quantidade do produto:");
					qtdProduto = entrada.nextInt();
					System.out.println("=================================");
					System.out.println("Produto cadastrado com sucesso!");
					System.out.println("=================================");
					break;
				case 2:
					//Vender Produto
					System.out.println("Informe a quantidade do produto vendido:");
					qtdVendido = entrada.nextInt();
					qtdProduto = qtdProduto - qtdVendido;
				case 3:
					//Mostrar Relatório de Vendas
					System.out.println();
				case 4:
					break;
				default:
			}

		} while(opcao >=1 && opcao <= 4);

		entrada.close();

	}

}
