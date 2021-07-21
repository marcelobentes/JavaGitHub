package exercicio9;

public class Jogador {
	
	private String nome;
	private String posicao;
	private String dataNascimento;
	private String nacionalidade;
	private double altura;
	private double peso;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public void imprimirDados() {
		System.out.println("Nome do Jogador: "+ nome);
		System.out.println("Posição: "+posicao);
		System.out.println("Data de Nascimento: "+dataNascimento);
		System.out.println("Nacionalidade: "+nacionalidade);
		System.out.println("Altura: "+altura);
		System.out.println("Peso: "+peso);
				
	}
	
	public int calcularIdade(int anoNascimento) {
		int idade, anoAtual = 2021;
		idade = anoAtual -anoNascimento;
		return idade;
	}
	
	public void tempoAposentar(String posicao, int anoNascimento) {
		this.posicao = posicao;
		int idade = calcularIdade(anoNascimento);
		int aposentadoria;
		
		if (posicao == "defesa") {
			aposentadoria = 40 - idade;
			System.out.println("Tempo para aposentar na defesa: "+aposentadoria+" anos.");
		}
		
		if (posicao == "meio-campo") {
			aposentadoria = 38 - idade;
			System.out.println("Tempo para aposentar no meio-campo: "+aposentadoria+" anos.");
		}
		if (posicao == "atacante") {
			aposentadoria = 35 - idade;
			System.out.println("Tempo para aposentar no ataque: "+aposentadoria+" anos.");
		}
	}
}
