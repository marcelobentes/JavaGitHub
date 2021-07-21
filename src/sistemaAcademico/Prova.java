package sistemaAcademico;

public class Prova extends Avaliacao {

	private double tempoDuracao;
	private int quantidadeDeQuestoes;
	private boolean consultaAutorizada;
	public Prova(String nome, double nota, double tempo, int qtdQuestoes, boolean consulta) {
		super(nome, nota);
		this.setTempoDuracao(tempo);
		this.setQuantidadeDeQuestoes(qtdQuestoes);
		this.setConsultaAutorizada(consulta);
		
	}
	public double getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	public int getQuantidadeDeQuestoes() {
		return quantidadeDeQuestoes;
	}
	public void setQuantidadeDeQuestoes(int quantidadeDeQuestoes) {
		this.quantidadeDeQuestoes = quantidadeDeQuestoes;
	}
	public boolean getConsultaAutorizada() {
		return consultaAutorizada;
	}
	public void setConsultaAutorizada(boolean consultaAutorizada) {
		this.consultaAutorizada = consultaAutorizada;
	}
	@Override
	public String getInfo() {
		System.out.print("\nProcesso Avaliativo: "+getNome() +"\nNota: "+ getNota()+
				"\nTempo de duração: "+getTempoDuracao()+" minutos"+"\nQuantidade de questões: "
				+getQuantidadeDeQuestoes()+"\nConsulta: "+getConsultaAutorizada());
		return super.getInfo();
	}
	
	

}
