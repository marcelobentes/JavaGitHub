package model;

public class TestContaBanco {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa ();
		Pessoa pessoa2 = new Pessoa ();
		Banco banco = new Banco ();
		ContaPoupanca conta = new ContaPoupanca ();
		
		pessoa.nome = "Marcelo";
		pessoa.cpf = 232314;
		pessoa.contapoupanca = conta;
		pessoa2.nome = "Marcelo";
		pessoa2.cpf = 232314;
		pessoa2.contapoupanca = conta;
		
		banco.nome = "Marcelo";
		banco.cnpj = 8891898197L;
		
		conta.agencia = 234;
		conta.conta = 4343;
		conta.banco = banco;
		conta.operacao = 02;
		conta.saldo = 50;
		
		System.out.println(pessoa.ToString());
		System.out.println(banco.ToString());
		System.out.println(conta.ToString());
		
		if(pessoa.equals(pessoa2));{
			System.out.println("São iguais");
		}
		

	}

}
