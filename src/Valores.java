//imprimir valores positivos, negativos e zeros

import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		int num;
		int num2, num3, num4, num5;
		int contadorPositivo = 0;
		int contadorNegativo = 0;
		int contadorZero = 0;
		System.out.print("Informar o primeiro numero: ");
		num = entrada.nextInt();
		System.out.print("Informar o segundo numero: ");
		num2 = entrada.nextInt();
		System.out.print("Informar o terceiro numero: ");
		num3 = entrada.nextInt();
		System.out.print("Informar o quarto numero: ");
		num4 = entrada.nextInt();
		System.out.print("Informar o quinto numero: ");
		num5 = entrada.nextInt();
		
		if(num > 0) {
			
			contadorPositivo ++;
		}
		if(num2 > 0) {
			
			contadorPositivo ++;
		}
		if(num3 > 0) {
			
			contadorPositivo ++;
		}
		if(num4 > 0) {
			
			contadorPositivo ++;
		}
		if(num5 > 0) {
			
			contadorPositivo ++;
		}
		if(num < 0) {
			
			contadorNegativo ++;
		}
		if(num2 < 0) {
			
			contadorNegativo ++;
		}
		if(num3 < 0) {
			
			contadorNegativo ++;
		}
		if(num4 < 0) {
			
			contadorNegativo ++;
		}
		if(num5 < 0) {
			
			contadorNegativo ++;
		}
		if(num == 0) {
			
			contadorZero ++;
		}
		if(num2 == 0) {
			
			contadorZero ++;
		}
		if(num3 == 0) {
			
			contadorZero ++;
		}
		if(num4 == 0) {
			
			contadorZero ++;
		}
		if(num5 == 0) {
			
			contadorZero ++;
		}
		
		System.out.println("Quantidades de numeros positivos: " + contadorPositivo);
		System.out.println("Quantidades de numeros negativos: " + contadorNegativo);
		System.out.println("Quantidades de numeros zeros: " + contadorZero);
		
		
		
	}

}
