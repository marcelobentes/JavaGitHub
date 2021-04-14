//representa uma fatura de um item vendido

public class Fatura {
//variaveis de instância
	private String numero;
	private String descricao;
	private int quantidadeComprada;
	private double preco;
	
	public Fatura(String numero, String descricao, int quantidadeComprada, double preco) //contrutor da classe
	{
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		this.preco = preco;
	}
	
	public double getValordaFatura(double preco, double quantidadeComprada) {
		if (preco < 0) {
			preco = 0.0;
		}
		if(quantidadeComprada < 0) {
			quantidadeComprada = 0;
		}
		
		double valorfatura = 0.0;
		valorfatura = preco * quantidadeComprada;
		return valorfatura;
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
