import java.util.Scanner;

public class Comparacao {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		
		int num, num2;
		
		System.out.println("Informe o primeiro numero: ");
		num = entrada.nextInt(); // lê primeiro o número fornecido pelo usuário
		System.out.println("Informe o segundo numero: ");
		num2 = entrada.nextInt(); // lê o segundo número fornecido pelo usuário
		
		if(num == num2) {
			System.out.printf("%d == %d", num, num2);
		}
		if (num != num2) {
			System.out.print(num +" != "+ num2);
		}
	}

}
