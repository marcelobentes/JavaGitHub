package notaFiscal;

public class NotaFiscal {
	int numero;
	String resumo;
	Pagamento pagamento;
	public NotaFiscal(int numero, String resumo, Pagamento pagamento) {
		super();
		this.numero = numero;
		this.resumo = resumo;
		this.pagamento = pagamento;
	}
	
	public void imprimirNota() {
		System.out.println("\nNota Fiscal Numero "+numero);
		System.out.println("Resumo da compra: \n"+resumo);
		System.out.print("Forma de Pagamento: "+pagamento.imprimir());
		
	}
	
}
