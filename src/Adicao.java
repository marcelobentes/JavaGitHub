//import java.util.Scanner;
import javax.swing.JOptionPane;

// Programa de adi��o que insere dois n�meros, ent�o exibe a soma deles.
public class Adicao {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//Scanner entrada = new Scanner(System.in);
		int num;
		int num2;
		int soma;
		/*System.out.println("Informe o primeiro numero: ");
		num = entrada.nextInt(); // l� primeiro o n�mero fornecido pelo usu�rio
		System.out.println("Informe o segundo numero: ");
		num2 = entrada.nextInt(); // l� o segundo n�mero fornecido pelo usu�rio
		soma = num + num2;
		
		System.out.println("O resultado da somas dos dois numeros: "+ soma);
		System.out.println("number\tSquare\tCube");
		System.out.printf("%d\t%d\t%d",2,2*2,2*2*2);
		*/
		
		//Exibir caixa de dialogo de entrada
		String numero = JOptionPane.showInputDialog("Informe o primeiro numero");
		String numero2 = JOptionPane.showInputDialog("Informe o segundo numero");
		num = Integer.parseInt(numero);
		num2 = Integer.parseInt(numero2);
		soma = num + num2;
		
		// exibe a mensagem com o resultado.
		String mensagem = String.format("Resuldado da soma � %s.",soma);
		
		JOptionPane.showMessageDialog(null, mensagem, "Resultado",JOptionPane.INFORMATION_MESSAGE);

	}

}
