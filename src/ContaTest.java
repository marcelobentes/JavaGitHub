import java.util.Scanner;

public class ContaTest {

	public static void main(String[] args) {
		// cria um objeto Scanner para obter entrada a partir da janela de comando
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		
		// cria um objeto Conta e o atribui a myConta
		//Conta myConta = new Conta("Marcelo Bentes", 80.0);
		Conta conta2 = new Conta ("Marcela Mabel", 50.0);
		Conta conta3 = new Conta ("Marcelo Samuel", -7.35);
		
		// exibe saldo inicial de cada objeto
		System.out.printf("%s Balance: $%.2f %n ", conta2.getNome(),conta2.getBalance());
		System.out.printf("%s Balance: $%.2f %n%n ", conta3.getNome(),conta3.getBalance());
		
		System.out.print("Adicionar valor de deposito para conta2: ");
		double depositAmount = entrada.nextDouble();
		System.out.println("adicionando R$"+depositAmount+" em saldo na conta2.");
		conta2.deposit(depositAmount); // adiciona o saldo de conta2
		
		// exibe os saldos
		System.out.printf("%s Balance: $%.2f %n ", conta2.getNome(),conta2.getBalance());
		System.out.printf("%s Balance: $%.2f %n%n ", conta3.getNome(),conta3.getBalance());
		
		System.out.print("Adicionar valor de deposito para conta3: ");
		depositAmount = entrada.nextDouble();
		System.out.println("adicionando R$"+depositAmount+" em saldo na conta3.");
		conta3.deposit(depositAmount); // adiciona o saldo de conta3
		
		
		
		// exibe os saldos
		System.out.printf("%s Balance: $%.2f %n ", conta2.getNome(),conta2.getBalance());
		System.out.printf("%s Balance: $%.2f %n%n ", conta3.getNome(),conta3.getBalance());
		
		//Método de saque
				System.out.print("Informe o valor de saque: ");
				double saque = entrada.nextDouble();
		conta2.saque(saque);
		System.out.println("Saldo restante: ");
		System.out.printf("%s Balance: $%.2f %n ", conta2.getNome(),conta2.getBalance());
		
		// exibe o valor inicial do nome (null)
		//System.out.println("Nome inicial é " + myConta.getNome());
		
		// solicita e lê o nome
		//System.out.println("Por favor digita o nome: ");
		//String oNome = entrada.nextLine();// lê uma linha de texto
		//myConta.setNome(oNome); // insere theName em myAccount
		//System.out.println();
		
		// exibe o nome armazenado no objeto myConta
		//System.out.println("O nome do objeto myConta é "+ myConta.getNome());
		//System.out.println("Nome conta2 é "+ conta2.getNome());
		//System.out.println("Nome conta3 é "+ conta3.getNome());
		

	}

}// fim da classe ContaTest
