package sistemaAcademico;

public class Seminario extends Avaliacao{
	private String tema;
	private double tempoDuracao;
	public Seminario(String nome, double nota, String tema, double tempo) {
		super(nome, nota);
		this.setTema(tema);
		this.setTempoDuracao(tempo);
		
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public double getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	@Override
	public String getInfo() {
		System.out.print("\nProcesso Avaliativo: "+getNome() +"\nNota: "+ getNota()+
				"\nTema: "+getTema()+"\nTempo de duração: "+getTempoDuracao()+" minutos");
		return super.getInfo();
	}
}
