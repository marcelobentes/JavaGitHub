package main;
import model.CorrentistaPessoaFísica;
public class CorrentistaMain {

	public static void main(String[] args) {
		System.out.println("Cliente: ");
		CorrentistaPessoaFísica Marcelo = new CorrentistaPessoaFísica("122334445", 200);
		
		Marcelo.getCpfCliente();
		Marcelo.getSaldo();
		

	}

}
