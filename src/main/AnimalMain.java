package main;

import model.Mamifero;
import model.Peixe;

public class AnimalMain {

	public static void main(String[] args) {
		
		Mamifero cachorro = new Mamifero( "Cachorro", "Branco", 4, "Carn�voro");
		Mamifero boi = new Mamifero( "Boi", "Marrom", 4, "Vegetal");
		Mamifero camelo = new Mamifero( "Camelo", "Amarelo", 4, "Carn�voro");
		Mamifero ursoCanada = new Mamifero( "Urso-do-Canad�", "Vermelho", 4, "Mel");
		Peixe tubarao = new Peixe ("Tubar�o", "Cinzento", 0);
		
		cachorro.dadosMamifero();
		boi.dadosMamifero();
		camelo.dadosMamifero();
		ursoCanada.dadosMamifero();
		tubarao.toString();
		
		

	}

}
