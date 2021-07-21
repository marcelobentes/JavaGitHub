package exercicio9;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private double capacidadeElevador;
	private int qntPessoasElevador;
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public double getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(double capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	public int getQntPessoasElevador() {
		return qntPessoasElevador;
	}
	public void setQntPessoasElevador(int qntPessoasElevador) {
		this.qntPessoasElevador = qntPessoasElevador;
	}

	
	public void inicializar (int capacidadeElevador, int totalAndares) {
		this.capacidadeElevador = capacidadeElevador;
		this.totalAndares = totalAndares;
		
		for( int andar = 0; andar < totalAndares; andar++) {
			for( int capacidade = 0; capacidade < capacidadeElevador; capacidade ++) {
				System.out.println("andar "+andar+" - Capacidade "+ capacidade);
			}
			
		}
		
	}
	
	public void entrar(int pessoa) {
		
		if (pessoa < this.qntPessoasElevador) {
			
			pessoa = pessoa +1;		
		}
		else
			System.out.println("Elevador lotado.");
		
	}
	
	public void sair (int pessoa) {
		if (pessoa > 0) {
			pessoa = pessoa -1;
		}
		else
			System.out.println("Elevador vazio.");
		
	}
	
	public void subir(int andar) {
		if(andar < this.totalAndares) {
			andar = andar +1;
		}
		else
			System.out.println("Elevador no ultimo andar.");
		
	}
	
	public void descer(int andar) {
		if(andar > 0) {
			andar = andar -1;
		}
		else
			System.out.println("Elevador no térreo.");
		
	}



}
