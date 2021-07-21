package gincana;

import java.util.Scanner;

public class TestGincana {

	public static void main(String[] args) throws InterruptedException {
		
		Gincana equipe = new Gincana();
		System.out.println("Pontuação inicial das equipes: ");
		System.out.println("Equipe1: " + equipe.equipe1);
		System.out.println("Equipe2: " + equipe.equipe2);
		System.out.println("Equipe3: " + equipe.equipe3);
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("==============================");
		System.out.println("QUE COMECE OS JOGOS.");
		System.out.println("==============================");
		int opcao = 0 ;
		while(opcao != 4)
		{
			System.out.println("Escolha a opção: ");
			System.out.println("1. Adicionar pontos: ");
			System.out.println("2. Remove pontos: ");
			System.out.println("3. Finalizar gincana: ");
			System.out.println("4. Sair.");
			System.out.print("Opção: ");
			opcao = entrada.nextInt();
			
			if(opcao == 1)
			{	
				int equipes;
				System.out.println("Adicionar ponto a qual equipe 1, 2 ou 3 ? ");
				System.out.print("Equipe: ");
				equipes = entrada.nextInt();
				if (equipes == 1)
				{
					equipe.setEquipe1(1);
					System.out.println("ponto adicionado a equipe1.");
					
				}
				if (equipes == 2)
				{
					equipe.setEquipe2(1);
					System.out.println("ponto adicionado a equipe2.");
					
				}
				if (equipes == 3)
				{
					equipe.setEquipe3(1);
					System.out.println("ponto adicionado a equipe3.");
					
				}Thread.sleep(2000);
			}
			
			if(opcao == 2)
			{
				int equipes;
				System.out.println("Remover ponto de qual equipe 1, 2 ou 3 ? ");
				equipes = entrada.nextInt();
				
				if (equipes == 1)
				{
					equipe.removerPontos(equipe.equipe1, 1);
					System.out.println("ponto removido da equipe1.");
				}
				
				if (equipes == 2)
				{
					equipe.removerPontos2(equipe.equipe2, 1);
					System.out.println("ponto removido da equipe2.");
				}
				
				if (equipes == 3)
				{
					equipe.removerPontos3(equipe.equipe3, 1);
					System.out.println("ponto removido da equipe3.");
				}
				Thread.sleep(2000);
			}
			
			if(opcao == 3)
			{	
				
				equipe.finalizaGincana();
			}
			
		}

	}

}
