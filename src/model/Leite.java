package model;

public class Leite implements IProduto {

	@Override
	public String getNome() {
		
		return "Integral";
	}

	@Override
	public String getMarca() {
		
		return "Italac";
	}

	@Override
	public double getPreco() {
		
		return 3.50;
	}

}
