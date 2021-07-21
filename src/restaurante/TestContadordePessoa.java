package restaurante;

import java.util.Scanner;

public class TestContadordePessoa {

	public static void main(String[] args) throws InterruptedException {
		ContadorDePessoa contPessoa; 
		int opcao = 0;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe o limite de pessoas no restaurante: ");
		contPessoa = new ContadorDePessoa(entrada.nextInt());
		while(opcao != 4) {
		System.out.println("Escolha a opção: ");
		System.out.println("1. Registrar entrada de pessoas.\n2. Registrar saída de pessoas."
				+ "\n3. Mostrar relatório.\n4. Sair.");
		System.out.print("Opção: ");
		opcao = entrada.nextInt();
		
		if (opcao == 1)
		{
			int numeroPessoas;
			System.out.print("Informe quantidade de pessoas: ");
			numeroPessoas = entrada.nextInt();
			
			contPessoa.registraEntrada(numeroPessoas);
			
			Thread.sleep(2000);
			
		}
		if (opcao == 2)
		{
			int numeroPessoas;
			System.out.print("Informe quantidade de pessoas que saíram: ");
			numeroPessoas = entrada.nextInt();
			contPessoa.registraSaida(numeroPessoas);
			Thread.sleep(2000);
		}
		if(opcao == 3)
		{
			contPessoa.mostrarRelatorio();
			Thread.sleep(2000);
		}
		
		} 
		
		
		

	}

}
