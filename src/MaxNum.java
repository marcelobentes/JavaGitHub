// Método maximum declarado pelo programador com três parâmetros double.
import java.util.Scanner;
public class MaxNum {

	public static void main(String[] args) {
		// cria Scanner para entrada a partir da janela de comando
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		
		// solicita e insere três valores de ponto flutuante
		
		System.out.println("Informar três numeros: ");
		double num1 = entrada.nextDouble(); // lê o primeiro double
		double num2 = entrada.nextDouble(); // lê o segundo double
		double num3 = entrada.nextDouble(); // lê o terceiro double

		// determina o valor máximo
		double result = maximum(num1, num2, num3);
		double result2 = maximum2(num1, num2, num3);
		// exibe o valor máximo
		System.out.println("Maximum is: " + result);
		System.out.println("Maximum is: " + result2);
		
	}
	// retorna o máximo dos seus três parâmetros de double
	private static double maximum(double x, double y, double z) {
		double maximumValue = x; // supõe que x é o maior valor inicial
		
		// determina se y é maior que maximumValue
		if (y > maximumValue) {
			maximumValue = y;
		}
		// determina se z é maior que maximumValue
		if (z > maximumValue) {
			maximumValue = z;
		}
		
		return maximumValue;
	}
	
	private static double maximum2(double x, double y, double z) {
		
		
		return Math.max(x, Math.max(y, z));
	}

}
