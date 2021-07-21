
package main;
import calculadora.Calculadora;
public class CalculadoraMain {

	public static void main(String[] args) {
		Calculadora.soma(2, 7);
		Calculadora.soma(2, 7, 5);
		Calculadora.subtracao(7, 5);
		Calculadora.subtracao(9, 7, 4);
		Calculadora.multiplicacao(5, 6);
		Calculadora.multiplicacao(2, 10, 4);
		Calculadora.divisao(10, 2);
		Calculadora.divisao(30, 3, 2);

	}

}
