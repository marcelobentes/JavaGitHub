package model;

public class ConversorUnidadeTempo {
	
	public static int converteMinuto_Segundo(int minuto) {
		
		return minuto * 60;
	}
	
	public static int converteHora_Minuto(int hora) {
		
		return hora * 60;
	}
	public static int converteDias_Hora(int dia) {
		
		return dia * 24;
	}
	public static int converteSemana_Dias(int semana) {
		
		return semana * 7;
	}
	public static int converteMes_dias(int mes) {
		
		return mes * 30;
	}
	
	public static int converteAnos_dias(int ano) {
		
		return ano * 365;
	}
	

}
