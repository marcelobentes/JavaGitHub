package model;

public class Peixe extends Animal {
	


	private String caracterisca;
	
	public String getCaracterisca() {
		return caracterisca;
	}

	public void setCaracterisca(String caracterisca) {
		this.caracterisca = caracterisca;
	}
	
	public Peixe(String nome, String cor, int quantidadePatas) {
		super(nome, cor, quantidadePatas);
		
		
	}
	public String toString()
	{
		return "Dados do Peixe"+"\nNome: "+super.getNome()+"\nCor: "+cor+
				"\nQuantidade de patas: "+quantidadePatas;
	}

	

}
