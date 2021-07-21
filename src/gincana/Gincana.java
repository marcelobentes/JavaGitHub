package gincana;

public class Gincana {
	
	public int equipe1;
	public int equipe2;
	public int equipe3;
	public int getEquipe1() {
		return equipe1;
	}
	public void setEquipe1(int equipe1) {
		this.equipe1 = this.equipe1 + equipe1 ;
	}
	public int getEquipe2() {
		return equipe2;
	}
	public void setEquipe2(int equipe2) {
		this.equipe2 = this.equipe2 + equipe2;
	}
	public int getEquipe3() {
		return equipe3;
	}
	public void setEquipe3(int equipe3) {
		this.equipe3 = this.equipe3 + equipe3;
	}
	public int removerPontos(int equipe, int pontos) {
		
		this.equipe1 = equipe - pontos;
		return this.equipe1;
	}
	
	public int removerPontos2(int equipe, int pontos) {
		
		this.equipe2 = equipe - pontos;
		return this.equipe2;
	}
	public int removerPontos3(int equipe, int pontos) {
	
	this.equipe3 = equipe - pontos;
	return this.equipe3;
	}
	
	public void finalizaGincana() throws InterruptedException {
		System.out.println("Gincana finalizada !");
		System.out.println("Pontuação Final.");
		System.out.println("Equipe1: " + this.equipe1+" pontos");
		System.out.println("Equipe2: " + this.equipe2+" pontos");
		System.out.println("Equipe3: " + this.equipe3+" pontos");
		
		
		Thread.sleep(2000);
	}
	

}
