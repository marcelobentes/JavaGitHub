package model;

public class Emprestimo {

	public static void main(String[] args) {
		Livros livro = new Livros ();
		Pessoal pessoa = new Pessoal ();
		
		livro.nomeDoLivro = "ABC";
		livro.autor = "AAAA";
		livro.data = "08/1999";
		
		pessoa.nome = "Tereza";
		pessoa.endereco = "QN8 CJ 15 Gama";
		pessoa.telefone = 775684738;
		pessoa.email = "tereza@com.br";
		
		System.out.println("Emprestimo efetuado.");
		System.out.println("Nome do livro: " + livro.nomeDoLivro);
		System.out.println("Autor: " + livro.autor);
		System.out.println("Data publicação: " + livro.data);
		System.out.println("Responsalvel: "+ pessoa.nome);
		System.out.println("Telefone: " + pessoa.telefone);
		System.out.println("E-mail: " + pessoa.email);
		System.out.println("Endereço: " + pessoa.endereco);

	}

}
