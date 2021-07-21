package notaFiscal;

public class PagamentoEmCartao extends Pagamento {
	private String bandeira;
	private long numeroTransacao;
	
	public PagamentoEmCartao(double valor,String bandeira, long numeroTransacao) {
		super(valor);
		this.bandeira = bandeira;
		this.numeroTransacao = numeroTransacao;
		
	}

	@Override
	public String imprimir() {
		
		return "Pagamento em cartão\n"+"Valor total do pagamento: "+getValor()+
				"\nBandeira do cartão: "+bandeira+
	"\nNumero da transação: "+numeroTransacao;
	}

	
}
