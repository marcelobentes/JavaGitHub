package model;

public class CadernoDeEnderecos 
{
	public String nome;
	public int telefone;
	public String email;
	public String endereco;
	
	public String ToString()
	{
		return "Nome do contato: " + this.nome + "\nTelefone: " + this.telefone + "\nEndereço: "+ this.endereco 
				+ "\nE-mail: " + this.email;
	}

}
