package main;

import sistemaAcademico.Avaliacao;
import sistemaAcademico.Bimestre;
import sistemaAcademico.EstudoDirigido;
import sistemaAcademico.Prova;
import sistemaAcademico.Seminario;

public class BimestreTesteMain {

	public static void main(String[] args) {
		
				
		Avaliacao av1 = new Prova("Prova", 7.7, 120, 30, false);
		Avaliacao av2 = new EstudoDirigido("Estudo Dirigido", 8.9, "API", 35);
		Avaliacao av3 = new Seminario("Seminario Tecnologia", 9.3, "AI", 56);
		Bimestre bimestre = new Bimestre("Primeiro", av1, av2, av3);
		
		bimestre.imprimirAvaliacoes();
			
		
		
		
		
		
	}

}
