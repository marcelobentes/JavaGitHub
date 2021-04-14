import java.util.Scanner;

// Resolvendo o problema da média da classe usando a repetição controlada por contador.
public class MediaClasse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int total = 0;
		int notacontador = 1;
		// fase de processamento utiliza repetição controlada por contador
		while(notacontador <= 10) // faz o loop 10 vezes
		{
			System.out.print("Informe a nota: ");// prompt
			int nota = entrada.nextInt(); // insere a próxima nota
			total = total + nota; // adiciona nota a total
			notacontador ++; // incrementa o contador por 1ÿ
			
		}
		int media = total / 10; // fase de término
		// exibe o total e a média das notas
		System.out.println("Nota total da classe: "+ total);
		System.out.println("Media da classe: "+ media);
	}

}
