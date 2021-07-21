import javax.swing.JOptionPane;

public class CalcularSalario {

	public static void main(String[] args) {
		String empregado, shorasTrabalhadas, ssalarioHora, sopcao;
		double horasTrabalhadas, horaextra;
		double salarioHora, salariohoraextra;
		double salarioBruto;
		int opcao = -1;
		sopcao = JOptionPane.showInputDialog("Digite 1 para calcular hora trabalhadas ou digite 0 para sair");
		opcao = Integer.parseInt(sopcao);
		while (opcao != 0) {
		empregado = JOptionPane.showInputDialog("Informe o empregado");
		shorasTrabalhadas = JOptionPane.showInputDialog("Digite as horas trabalhadas");
		horasTrabalhadas = Double.parseDouble(shorasTrabalhadas);
		ssalarioHora = JOptionPane.showInputDialog("Informe o salario hora");
		salarioHora = Double.parseDouble(ssalarioHora);
		
		
		salarioBruto = salarioHora * horasTrabalhadas;
		
		if (horasTrabalhadas > 40) {
			
			horaextra = horasTrabalhadas - 40;
			salariohoraextra = salarioHora + (salarioHora * 0.50);
			salariohoraextra *= horaextra;
			salarioBruto = salarioBruto + salariohoraextra;
			JOptionPane.showMessageDialog(null, "Salario Bruto + horaextra Semanal: " +salarioBruto +" Funcionario "+empregado);
			
		}
		
		JOptionPane.showMessageDialog(null, "Salario Bruto Semanal: " +salarioBruto+" Funcionario "+empregado );
		
		sopcao = JOptionPane.showInputDialog("Digite 1 para calcular hora trabalhadas ou digite 0 para sair");
		opcao = Integer.parseInt(sopcao);
		
		}
			
		

	}

}
