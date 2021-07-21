package notaFiscal;

public class PagamentoEmDinheiro extends Pagamento {
	private double valorRecebido;
	private double troco;
	
	public PagamentoEmDinheiro(double valor, double valorRecebido, double troco) {
		super(valor);
		this.valorRecebido = valorRecebido;
		this.troco = troco;
	}

	public double getValorRecebido() {
		return valorRecebido;
	}


	public void setValorRecebido(double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}


	public double getTroco() {
		return troco;
	}


	public void setTroco(double troco) {
		this.troco = troco;
	}
	@Override
	public String imprimir() {
		return "Pagamento em dinheiro.\n"+"Valor total do pagamento: "+getValor()+
				"\nValor recebido"+valorRecebido+
	"\nValor do troco: "+troco;
		
	}

}
