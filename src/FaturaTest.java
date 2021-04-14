import java.util.Scanner;

public class FaturaTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe o numero do Item: ");
		String numero = entrada.nextLine();
		System.out.print("Informe a descrição do Item: ");
		String descricao = entrada.nextLine();
		System.out.print("Informe a quantidade comprada do Item: ");
		int quantidadeComprada = entrada.nextInt();
		System.out.print("Informe o preço do Item: ");
		double preco = entrada.nextDouble();
		
		Fatura fatura1 = new Fatura(numero, descricao, quantidadeComprada, preco); //criado objeto Fatura
		System.out.println("======================================");
		System.out.println("Fatura do produto:");
		System.out.println("Numero do Item: "+ fatura1.getNumero());
		System.out.println("Descrição do Item: "+ fatura1.getDescricao());
		System.out.println("Quantidade Comprada: "+ fatura1.getQuantidadeComprada());
		System.out.println("Valor do produto: "+ fatura1.getPreco());
		double valorTotal = fatura1.getValordaFatura(preco, quantidadeComprada);
		
		System.out.println("Valor Total: "+ valorTotal);
		

	}

}
