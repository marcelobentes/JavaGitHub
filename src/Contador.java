import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe o contador: ");
		contador = entrada.nextInt();
		
		if (contador > 10)
			System.out.println("Contador é maior que 10.");
		
		contador ++;
		System.out.println("Incremando em +1 "+contador);

	}

}
