package model;

public class CorrentistaPessoaFísica extends Correntista{

	public CorrentistaPessoaFísica(String cpfCliente, float saldo) {
		super(cpfCliente, saldo);
		
		System.out.println("CPF: "+getCpfCliente());
		System.out.println("Saldo: "+getSaldo());
		setSaldo(saldo);
	}

}
