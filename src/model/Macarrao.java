package model;

public class Macarrao implements IProduto {

	@Override
	public String getNome() {
		
		return "Massa";
	}

	@Override
	public String getMarca() {
		
		return "Super Massa";
	}

	@Override
	public double getPreco() {
		
		return 3.00;
	}

}
