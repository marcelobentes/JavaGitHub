// Conta.java
// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.
public class Conta {
	
	private String nome; //variavel de instancia
	private double balance; // variável de instância, para o saldo
	
	// o construtor inicializa nome com nome do parâmetro
	public Conta(String nome, double balance) // o nome do construtor é nome da classe
	{
		this.nome = nome;
		if (balance > 0.0) // se o saldo for válido
		this.balance = balance; // o atribui à variável de instância balance
	}
	// método que deposita (adiciona) apenas uma quantia válida no saldo
	public void deposit(double depositAmount)
	{
	if (depositAmount > 0.0) // se depositAmount for válido
	balance = balance + depositAmount; // o adiciona ao saldo
	}
	
	//método de saque
	public void saque (double saque) {
		if (saque > balance) {
			System.out.println("O valor de débito excedeu o saldo da conta.");
		}else {
		balance = balance - saque;
		}
	}
	
	// método retorna o saldo da conta
	public double getBalance() {
		return balance;
	}
	
	// método para definir o nome no objeto
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	// método para recuperar o nome do objeto
	
	public String getNome() {
		return nome; // retorna valor do nome para o chamador
	}

}// fim da classe Account
