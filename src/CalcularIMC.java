import java.util.Scanner;

 //calcular o IMC
public class CalcularIMC {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		double altura;
		int peso;
		double IMC;
		System.out.println("Informe sua altura: ");
		altura = entrada.nextDouble();
		System.out.println("Informe seu peso: ");
		peso = entrada.nextInt();
		
		IMC = peso / (altura * altura);
		
		if (IMC < 18.5) {
			System.out.println("Está abaixo do peso.");
		}
		if (IMC > 18.5 && IMC < 24.9) {
			System.out.println("Está com peso normal.");
		}
		if (IMC > 25 && IMC < 29.9) {
			System.out.println("Está acima do peso.");
		}
		if (IMC > 30) {
			System.out.println("Está obeso.");
		}

	}

}
