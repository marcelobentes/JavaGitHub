import java.util.Scanner;

// Resolvendo o problema da m�dia da classe usando a repeti��o controlada por contador.
public class MediaClasse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int total = 0;
		int notacontador = 1;
		// fase de processamento utiliza repeti��o controlada por contador
		while(notacontador <= 10) // faz o loop 10 vezes
		{
			System.out.print("Informe a nota: ");// prompt
			int nota = entrada.nextInt(); // insere a pr�xima nota
			total = total + nota; // adiciona nota a total
			notacontador ++; // incrementa o contador por 1�
			
		}
		int media = total / 10; // fase de t�rmino
		// exibe o total e a m�dia das notas
		System.out.println("Nota total da classe: "+ total);
		System.out.println("Media da classe: "+ media);
	}

}
