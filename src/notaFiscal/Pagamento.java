package notaFiscal;

public abstract class  Pagamento {
private double valor;

  
public Pagamento(double valor) {
	super();
	this.valor = valor;
}

public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public abstract String imprimir();

}
