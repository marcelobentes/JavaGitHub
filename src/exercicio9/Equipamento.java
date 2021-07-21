package exercicio9;

public class Equipamento {
	private int [] valor;
	int numeroEquipamentos;
	public Equipamento(int numeroEquipamentos)
	{
		this.valor = new int [numeroEquipamentos];
		this.numeroEquipamentos = numeroEquipamentos;
	}
	
	public int getValor(int numero) {
		return this.valor[numero];
	}
	public void setValor(int numero, int valor) {
		this.valor[numero] = valor;
	}
	public int getNumeroEquipamentos() {
		return numeroEquipamentos;
	}
	
	
	
}
