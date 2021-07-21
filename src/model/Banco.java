package model;

public class Banco
{
	public String nome;
	public long cnpj;
	
	public Banco() {
	
	}
	public Banco(String nome, long cnpj)
	{
		this.nome = nome;
		this.cnpj = cnpj;
		
	}
	
	public String ToString()
	{
		return "Banco: "+this.nome+ "\nCNPJ: "+this.cnpj;
	}
}
