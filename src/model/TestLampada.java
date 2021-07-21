package model;

public class TestLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.preco = 8;
		lampada.potencia = 220;
		
		System.out.println("Valor da lâmpada: "+ lampada.preco);
		System.out.println("Potência da lãmpada: "+ lampada.potencia);
		System.out.println("Status da lâmpada: ");
		lampada.ligar();
		

	}

}
