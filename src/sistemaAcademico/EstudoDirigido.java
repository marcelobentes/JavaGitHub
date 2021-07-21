package sistemaAcademico;

public class EstudoDirigido extends Avaliacao{
	private String tema;
	private int numeroDePaginas;
	public EstudoDirigido(String nome, double nota, String tema, int numPaginas) {
		super(nome, nota);
		this.setTema(tema);
		this.setNumeroDePaginas(numPaginas);
		
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	@Override
	public String getInfo() {
		System.out.print("\nProcesso Avaliativo: "+getNome() +"\nNota: "+ getNota()+
				"\nTema: "+getTema()+"\nNumero de paginas: "+getNumeroDePaginas());
		return super.getInfo();
	}
}
