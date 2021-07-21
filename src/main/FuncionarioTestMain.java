package main;

import java.util.ArrayList;

import exercicio9.Assistente;
import exercicio9.Funcionario;
import exercicio9.Gerente;
import exercicio9.Vendedor;

public class FuncionarioTestMain {

	public static void main(String[] args) {
		Funcionario Gerente = new Gerente("Marcelo", "1212", 2200);
		Funcionario Assistente = new Assistente("Mabel", "1919", 2200);
		Funcionario Vendedor = new Vendedor ("Thatiane","2525", 2200, 500);
		
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		funcionarios.add(Gerente);

		funcionarios.add(Assistente);

		funcionarios.add(Vendedor);

		double folha = 0;

		for (Funcionario f : funcionarios) {

		folha += f.calculaSalario();

		}

		System.out.println(folha);

		}
}
