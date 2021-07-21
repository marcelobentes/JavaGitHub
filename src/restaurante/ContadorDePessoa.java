package restaurante;

public class ContadorDePessoa
{
	public int limitesPessoas; //Quantidade máxima de pessoas presentes no restaurante
	public int qtdePresentes;  //Quantidade de pessoas presentes em um determinado momento.
	public int qtdeTotal; //Quantidade total de pessoas que passaram pelo restaurante em um dia.

	public ContadorDePessoa( int limite)
	{
		this.limitesPessoas = limite;
	}
	
	public void registraEntrada(int quantidade)
	{
			int quantidade2 = quantidade + this.qtdePresentes;
			
		if ( quantidade2 <= this.limitesPessoas) {
			
			this.qtdePresentes = qtdePresentes + quantidade;
			this.qtdeTotal = qtdeTotal + quantidade;
			System.out.println("Registrado: "+quantidade);
			
			
		}
		else System.out.println("Limite de pessoas atigindo.");
		
		
	}
	
	void registraSaida(int quantidade)
	{
		
		if(quantidade <= this.qtdePresentes)
		this.qtdePresentes = this.qtdePresentes - quantidade;
		System.out.println("Quantidade de pessoas que sairam: "+ quantidade);
	}
	
	void mostrarRelatorio()
	{	
		System.out.println("Limite de pessoas: "+ this.limitesPessoas);
		System.out.println("Pessoas presentes: "+ this.qtdePresentes);
		System.out.println("total de pessoas que passaram pelo restaurante durante o dia: "
		+ this.qtdeTotal);
		
	}
	
}
