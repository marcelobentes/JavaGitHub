
public class Matriz {

	public static void main(String[] args) {
		int[] c; // declara a vari�vel de array
		c = new int[12]; // cria o array; atribui � vari�vel de array
		
		String[] b = new String[100]; // cria array b
		String x [] = new String[27]; // cria array x
		int[] array = { 10, 20, 30, 40, 50 };
		
		System.out.printf("%s%8s%n", "Index", "Value"); // t�tulos de coluna
		
		// gera sa�da do valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	}

}
