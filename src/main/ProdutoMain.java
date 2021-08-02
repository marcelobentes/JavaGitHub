package main;

import model.IProduto;
import model.Leite;
import model.Macarrao;

public class ProdutoMain {

	public static void main(String[] args) {
		
		IProduto produto = new Macarrao();
		
		System.out.println("Descri��o Produto: ");
		System.out.println("Nome: "+ produto.getNome());
		System.out.println("Marca: "+ produto.getMarca());
		System.out.println("Pre�o: "+ produto.getPreco());
		
		produto = new Leite();
		
		System.out.println("Descri��o Produto: ");
		System.out.println("Nome: "+ produto.getNome());
		System.out.println("Marca: "+ produto.getMarca());
		System.out.println("Pre�o: "+ produto.getPreco());
	}

}
