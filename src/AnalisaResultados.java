import java.util.Scanner;

public class AnalisaResultados {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int contadoralunos =1;
		int aprovados = 0;
		int reprovados = 0;
		
		while(contadoralunos <= 10) {
			System.out.print("Informe o resultado do exame(1-passou, 2-reprovou): ");
			int resultado = entrada.nextInt();
			
			if(resultado == 1) {
				aprovados ++;
			}
			else {
				reprovados ++;
			}
			contadoralunos ++;
			
		}
		System.out.println("Numeros de Aprovados: "+ aprovados);
		System.out.println("Numeros de Reprovados: "+ reprovados);
		
		if(aprovados > 8) {
			System.out.println("Mais de 8 aprovações o intrutor vai receber um bonus.");
		}

	}

}
