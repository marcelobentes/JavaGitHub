package model;

public class CorrentistaPessoaF�sica extends Correntista{

	public CorrentistaPessoaF�sica(String cpfCliente, float saldo) {
		super(cpfCliente, saldo);
		
		System.out.println("CPF: "+getCpfCliente());
		System.out.println("Saldo: "+getSaldo());
		setSaldo(saldo);
	}

}
