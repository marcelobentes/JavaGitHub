package model;

public class Agenda 
{
	public String tipo;
	public String contato;
	public int telefone;
	public String email;
	
	public String ToString()
	{
		return "Tipo de agenda: " + this.tipo + "\nNome do contato: " + this.contato + "\nTelefone: "+ this.telefone 
				+ "\nE-mail: " + this.email;
	}
	
}
