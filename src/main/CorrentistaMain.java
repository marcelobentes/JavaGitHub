package main;
import model.CorrentistaPessoaF�sica;
public class CorrentistaMain {

	public static void main(String[] args) {
		System.out.println("Cliente: ");
		CorrentistaPessoaF�sica Marcelo = new CorrentistaPessoaF�sica("122334445", 200);
		
		Marcelo.getCpfCliente();
		Marcelo.getSaldo();
		

	}

}
