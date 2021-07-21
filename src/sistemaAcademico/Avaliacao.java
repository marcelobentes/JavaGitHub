package sistemaAcademico;

public abstract class  Avaliacao {
	private String nome;
	private double nota;
	
	public Avaliacao(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}

	public String getInfo() {
		return "";
	}

	
	
}
