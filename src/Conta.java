// Conta.java
// Classe Account que cont�m uma vari�vel de inst�ncia name
// e m�todos para configurar e obter seu valor.
public class Conta {
	
	private String nome; //variavel de instancia
	private double balance; // vari�vel de inst�ncia, para o saldo
	
	// o construtor inicializa nome com nome do par�metro
	public Conta(String nome, double balance) // o nome do construtor � nome da classe
	{
		this.nome = nome;
		if (balance > 0.0) // se o saldo for v�lido
		this.balance = balance; // o atribui � vari�vel de inst�ncia balance
	}
	// m�todo que deposita (adiciona) apenas uma quantia v�lida no saldo
	public void deposit(double depositAmount)
	{
	if (depositAmount > 0.0) // se depositAmount for v�lido
	balance = balance + depositAmount; // o adiciona ao saldo
	}
	
	//m�todo de saque
	public void saque (double saque) {
		if (saque > balance) {
			System.out.println("O valor de d�bito excedeu o saldo da conta.");
		}else {
		balance = balance - saque;
		}
	}
	
	// m�todo retorna o saldo da conta
	public double getBalance() {
		return balance;
	}
	
	// m�todo para definir o nome no objeto
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	// m�todo para recuperar o nome do objeto
	
	public String getNome() {
		return nome; // retorna valor do nome para o chamador
	}

}// fim da classe Account
