import java.util.Scanner;

public class LimiteCredito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int numeroConta;
		int saldoInicioMes;
		int totalCobradosMes;
		int totalCreditoMes;
		int limiteCreditoAutorizado;
		int novosaldo;
		int opcao = 2;
		System.out.println("Para Cadastro - 1 \nPara Sair - 0 \nInforme a op��o: ");
		opcao = entrada.nextInt();
		while(opcao != 0)
		{
			
		System.out.println("Informe o numero da conta: ");
		numeroConta = entrada.nextInt();
		System.out.println("Informe o saldo do inicio do m�s: ");
		saldoInicioMes = entrada.nextInt();
		System.out.println("Total de itens cobrados esse m�s: ");
		totalCobradosMes = entrada.nextInt();
		System.out.println("Total de creditos aplicados no m�s: ");
		totalCreditoMes = entrada.nextInt();
		System.out.println("Informe o limite de credito autorizado: ");
		limiteCreditoAutorizado = entrada.nextInt();
		novosaldo = saldoInicioMes + totalCobradosMes - totalCreditoMes;
		System.out.println("Saldo atualizado: " + novosaldo);
		
		if (novosaldo > limiteCreditoAutorizado) {
			System.out.println("Limite de credito excedido !");
		}
		System.out.println("informe a op��o: ");
		opcao = entrada.nextInt();
			
		}
		if (opcao == 0)
			System.out.println("Sainda aplica��o. ");
	}

}
