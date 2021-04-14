//classe de salario de empregado

public class Empregado { //criação da classe
	private String nome;
	private String sobrenome;
	private double salariomensal;
	
	public Empregado (String nome, String sobrenome, double salariomensal) { //construtor inicializado
		this.nome = nome;
		this.sobrenome = sobrenome;
		if(salariomensal > 0) {
		this.salariomensal = salariomensal;
		}else {
			System.out.println("Valor do salario inválido.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalariomensal() {
		return salariomensal;
	}

	public void setSalariomensal(double salariomensal) {
		this.salariomensal = salariomensal;
	}
	

}
