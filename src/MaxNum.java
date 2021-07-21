// M�todo maximum declarado pelo programador com tr�s par�metros double.
import java.util.Scanner;
public class MaxNum {

	public static void main(String[] args) {
		// cria Scanner para entrada a partir da janela de comando
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		
		// solicita e insere tr�s valores de ponto flutuante
		
		System.out.println("Informar tr�s numeros: ");
		double num1 = entrada.nextDouble(); // l� o primeiro double
		double num2 = entrada.nextDouble(); // l� o segundo double
		double num3 = entrada.nextDouble(); // l� o terceiro double

		// determina o valor m�ximo
		double result = maximum(num1, num2, num3);
		double result2 = maximum2(num1, num2, num3);
		// exibe o valor m�ximo
		System.out.println("Maximum is: " + result);
		System.out.println("Maximum is: " + result2);
		
	}
	// retorna o m�ximo dos seus tr�s par�metros de double
	private static double maximum(double x, double y, double z) {
		double maximumValue = x; // sup�e que x � o maior valor inicial
		
		// determina se y � maior que maximumValue
		if (y > maximumValue) {
			maximumValue = y;
		}
		// determina se z � maior que maximumValue
		if (z > maximumValue) {
			maximumValue = z;
		}
		
		return maximumValue;
	}
	
	private static double maximum2(double x, double y, double z) {
		
		
		return Math.max(x, Math.max(y, z));
	}

}
