package pessoa;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco (71445250, "QN45", 25, "prox.Df01", "Guanabara", "Guajará");
		Pessoa pessoa = new Pessoa("Jeremias", "12345678958", endereco);
		
		System.out.println(pessoa.ToString());
		
		
		
		
	}

}
