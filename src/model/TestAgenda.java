package model;

public class TestAgenda {

	public static void main(String[] args)
	{
		Agenda agenda = new Agenda();
		agenda.tipo = "Trabalho";
		agenda.contato = "Thatiane Maia";
		agenda.email = "thatizinha17@.com.br";
		agenda.telefone = 95052350;
		
		System.out.println(agenda.ToString());
		
	}

}
