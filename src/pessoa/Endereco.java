package pessoa;

public class Endereco 
{

	public int cep;
	public String logradouro;
	public int numero;
	public String complemento;
	public String bairro;
	public String cidade;
	
	public Endereco() {
		
	}
	
	public Endereco(int cep, String logradouro, int numero, String complemento
			, String bairro, String cidade)
	{
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
				
	}
	
	public String ToString()
	{
		return "CEP: "+cep+"\nLogradouro: "+logradouro+"\nNumero: "+numero+
				"\nComplemento: "+complemento+"\nBairro: "+bairro+"\nCidade: "+cidade;
	}
}
