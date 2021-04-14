//Usando classe empregado

public class EmpregadoTest {

	public static void main(String[] args) {
		
		Empregado primeiro = new Empregado("Marcelo ", "Bentes", 12*1997.97);
		Empregado segundo = new Empregado("Marcela Mabel ", "Silva", 12*2200.00);
		
		
		System.out.println("Dados do empregado: \n" + primeiro.getNome() + primeiro.getSobrenome() +"\nSalario Anual: " + primeiro.getSalariomensal());
		System.out.println("Dados do empregado: \n" + segundo.getNome() + segundo.getSobrenome() +"\nSalario Anual: " + segundo.getSalariomensal());

		
		
	}

}
