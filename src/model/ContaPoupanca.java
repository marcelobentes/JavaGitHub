package model;

public class ContaPoupanca
{
	public int conta;
	public int agencia;
	public int operacao;
	public double saldo;
	public Banco banco; 
	
	public ContaPoupanca ()
	{
	
	}
	
	public ContaPoupanca (int agencia, int conta, int operacao, double saldo,Banco banco)
	{
		this.agencia = agencia;
		this.conta = conta;
		this.operacao = operacao;
		this.saldo = saldo;
		this.banco = banco;
	}
	
	public String ToString ()
	{
		return "Agência: "+this.agencia+ "\nConta: "+this.conta+ "\nOperação: "+this.operacao+
				"\nSaldo: "+this.saldo+ "\nBanco: "+this.banco;
	}
}
