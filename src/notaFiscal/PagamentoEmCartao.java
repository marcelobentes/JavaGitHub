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
		
		return "Pagamento em cart�o\n"+"Valor total do pagamento: "+getValor()+
				"\nBandeira do cart�o: "+bandeira+
	"\nNumero da transa��o: "+numeroTransacao;
	}

	
}
