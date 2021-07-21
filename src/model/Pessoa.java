package model;

public class Pessoa
{
	public String nome;
	public int cpf;
	public ContaPoupanca contapoupanca;
	
	public Pessoa ()
	{
		
	}
	
	public Pessoa (String nome, int cpf, ContaPoupanca conta)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.contapoupanca = conta;
	}
	
	public String ToString()
	{
		return "Nome: "+this.nome+ "\nCPF: "+this.cpf+"\nConta Poupança: "+this.contapoupanca;
	}
	
	
}
