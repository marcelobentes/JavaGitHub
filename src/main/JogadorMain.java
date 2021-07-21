package main;

import exercicio9.Jogador;

public class JogadorMain {

	public static void main(String[] args) {
		
		Jogador marcelo = new Jogador();
		marcelo.setNome("Marcelão");
		marcelo.setDataNascimento("17/11/1984");
		marcelo.setNacionalidade("Brasileiro");
		marcelo.setAltura(1.69);
		marcelo.setPeso(84);
		marcelo.setPosicao("atacante");
		
		marcelo.imprimirDados();
		System.out.println("Idade: "+marcelo.calcularIdade(1984));
		
		marcelo.tempoAposentar(marcelo.getPosicao(), 2001);

	}

}
