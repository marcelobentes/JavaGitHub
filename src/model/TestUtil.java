package model;

public class TestUtil {

	public static void main(String[] args) {
		
		Util valor = new Util();
				
		System.out.println("Maior número: "+valor.maior(8, 19));
		System.out.println("Maior número: "+valor.maior3(82, 95, 99));
		System.out.println("Somando: " + valor.adicao(4, 8));
		System.out.println("Subtração: " + valor.subtracao(19, 7));
		System.out.println("Multiplicação: " + valor.mult(2, 7));
		System.out.println("Divisão: " + valor.div(0, 2));
		
		
		
	}

}
