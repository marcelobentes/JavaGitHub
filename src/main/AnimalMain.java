package main;

import model.Mamifero;
import model.Peixe;

public class AnimalMain {

	public static void main(String[] args) {
		
		Mamifero cachorro = new Mamifero( "Cachorro", "Branco", 4, "Carnívoro");
		Mamifero boi = new Mamifero( "Boi", "Marrom", 4, "Vegetal");
		Mamifero camelo = new Mamifero( "Camelo", "Amarelo", 4, "Carnívoro");
		Mamifero ursoCanada = new Mamifero( "Urso-do-Canadá", "Vermelho", 4, "Mel");
		Peixe tubarao = new Peixe ("Tubarão", "Cinzento", 0);
		
		cachorro.dadosMamifero();
		boi.dadosMamifero();
		camelo.dadosMamifero();
		ursoCanada.dadosMamifero();
		tubarao.toString();
		
		

	}

}
