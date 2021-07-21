package main;

import java.util.Scanner;

import model.ConversorUnidadeTempo;

public class ConversorUnidadeTempoMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int ano;
		System.out.println(ConversorUnidadeTempo.converteMinuto_Segundo(2)+" Segundos.");
		System.out.println(ConversorUnidadeTempo.converteHora_Minuto(3)+" Minutos.");
		System.out.println(ConversorUnidadeTempo.converteDias_Hora(2)+" Horas.");
		System.out.println(ConversorUnidadeTempo.converteSemana_Dias(2)+" Semanas.");
		System.out.println(ConversorUnidadeTempo.converteMes_dias(4)+" Dias");
		
		System.out.println("Informe a quantidade de anos para converter em dias: ");
		ano = entrada.nextInt();
		System.out.println(ConversorUnidadeTempo.converteAnos_dias(ano)+" Dias.");
		
		
	}

}
