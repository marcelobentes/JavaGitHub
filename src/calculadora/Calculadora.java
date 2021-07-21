package calculadora;

public class Calculadora
{
	
	
	public static void soma(int valor1, int valor2) {
		int adicao = valor1+valor2;
		System.out.println("Adição: "+valor1+" + "+valor2+" = "+adicao);
	}
	public static void soma(int valor1, int valor2, int valor3) {
		int adicao = valor1+valor2+valor3;
		System.out.println("Adição: "+valor1+" + "+valor2+" + "+valor3+" = "+adicao);
	}
	
	public static void subtracao(int valor1, int valor2) {
		int subtracao = valor1-valor2;
		System.out.println("Subtração: "+valor1+" - "+valor2+" = "+subtracao);
	}
	public static void subtracao(int valor1, int valor2, int valor3) {
		int subtracao = valor1-valor2-valor3;
		System.out.println("Subtração: "+valor1+" - "+valor2+" - "+valor3+" = "+subtracao);
	}
	
	public static void divisao(int valor1, int valor2) {
		float divisao = (valor1/valor2);
		System.out.println("Divisão: "+valor1+" / "+valor2+" = "+divisao);
	}
	public static void divisao(int valor1, int valor2, int valor3) {
		float divisao = (valor1/valor2)/valor3;
		System.out.println("Divisão: "+valor1+" / "+valor2+" / "+valor3+" = "+divisao);
	}
	
	public static void multiplicacao(int valor1, int valor2) {
		int multiplicacao = (valor1*valor2);
		System.out.println("Multiplicação: "+valor1+" * "+valor2+" = "+multiplicacao);
	}
	public static void multiplicacao(int valor1, int valor2, int valor3) {
		int multiplicacao = (valor1*valor2)*valor3;
		System.out.println("Multiplicação: "+valor1+" * "+valor2+" * "+valor3+" = "+multiplicacao);
	}
	
}
