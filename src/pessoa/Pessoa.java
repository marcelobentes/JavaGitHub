package pessoa;

public class Pessoa {

	public String nome;
	public Endereco endereco;
	public String cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf, Endereco endereco)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		
	}
	
	public String ToString() {
		
		return "Nome: "+nome+"\nCPF: "+this.cpf+ "\nEndereço: "+endereco.ToString();
	}
	
}
