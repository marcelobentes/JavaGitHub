package model;

public class TestLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.preco = 8;
		lampada.potencia = 220;
		
		System.out.println("Valor da l�mpada: "+ lampada.preco);
		System.out.println("Pot�ncia da l�mpada: "+ lampada.potencia);
		System.out.println("Status da l�mpada: ");
		lampada.ligar();
		

	}

}
