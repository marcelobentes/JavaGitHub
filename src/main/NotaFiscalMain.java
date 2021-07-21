package main;

import notaFiscal.Pagamento;
import notaFiscal.PagamentoEmCartao;
import notaFiscal.PagamentoEmDinheiro;
import notaFiscal.NotaFiscal;

public class NotaFiscalMain {

	public static void main(String[] args) {
		
		Pagamento dinheiro = new PagamentoEmDinheiro(100, 200, 100);
		Pagamento cartao = new PagamentoEmCartao(300, "Visa", 15264568);
		NotaFiscal nota = new NotaFiscal(001, "Produtos", dinheiro);
		NotaFiscal nota2 = new NotaFiscal(002, "Material eletrico", cartao);
		nota.imprimirNota();
		nota2.imprimirNota();
	}

}
