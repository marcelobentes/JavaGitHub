package model;

public class Mamifero extends Animal {

	private String tipoAlimentacao ;
	
	public Mamifero(String nome, String cor, int quantidadePatas, String tipoAlimentacao) {
		super(nome, cor, quantidadePatas);
		
		this.tipoAlimentacao = tipoAlimentacao;
		
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}
	
	public void  dadosMamifero () {
		
		System.out.println("Dados do Mamífero: "
		+"\nNome: "+nome+"\nCor: "+cor+
				"\nQuantidade de patas: "+quantidadePatas+"\nTipo alimentação: "
				+getTipoAlimentacao()+"\n");
				
	}
	

	

}
