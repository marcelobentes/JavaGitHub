package main;

import java.util.Scanner;

import operacaoMatematica.Divisao;
import operacaoMatematica.IOperacaoMatematica;
import operacaoMatematica.Multiplicacao;
import operacaoMatematica.Soma;
import operacaoMatematica.Subtracao;

public class OperacaoMatematicaMain {

	public static void main(String[] args) {
		int opcao = 7;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		IOperacaoMatematica operacao = new Soma(0, 0);
		
		while(opcao != 0 ) {								
		System.out.println("Escolha a operação matematica: ");
		System.out.println("1. Soma.");
		System.out.println("2. Multiplicação.");
		System.out.println("3. Substracao.");
		System.out.println("4. Divisão.");
		System.out.println("0. Sair.");
		
		opcao = entrada.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Informe o primeiro numero:");
			((Soma)operacao).setNum1(entrada.nextInt());
			System.out.println("Informe o segundo numero:");
			((Soma)operacao).setNum2(entrada.nextInt());
			System.out.println("Resultado da Soma: "
			+operacao.calcula(((Soma)operacao).getNum1(), ((Soma)operacao).getNum2()));
			break;
		case 2:
			operacao = new Multiplicacao(0, 0);
			System.out.println("Informe o primeiro numero:");
			((Multiplicacao)operacao).setNum1(entrada.nextInt());
			System.out.println("Informe o segundo numero:");
			((Multiplicacao)operacao).setNum2(entrada.nextInt());
			System.out.println("Resultado da Multiplicação: "
			+operacao.calcula(((Multiplicacao)operacao).getNum1(), ((Multiplicacao)operacao).getNum2()));
			break;
		case 3:
			operacao = new Subtracao (0, 0);
			System.out.println("Informe o primeiro numero:");
			((Subtracao)operacao).setNum1(entrada.nextInt());
			System.out.println("Informe o segundo numero:");
			((Subtracao)operacao).setNum2(entrada.nextInt());
			System.out.println("Resultado da Subtração: "
			+operacao.calcula(((Subtracao)operacao).getNum1(), ((Subtracao)operacao).getNum2()));
			break;
		case 4:
			operacao = new Divisao (0, 0);			
			System.out.println("Informe o primeiro numero:");
			((Divisao)operacao).setNum1(entrada.nextInt());
			System.out.println("Informe o segundo numero:");
			((Divisao)operacao).setNum2(entrada.nextInt());
			System.out.println("Resultado da Divisão: "
			+operacao.calcula(((Divisao)operacao).getNum1(), ((Divisao)operacao).getNum2()));
			break;
			
		}
		}

	}

}
