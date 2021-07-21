//aplicação para calcular comissão de vendas
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class ComissaoVendas {

	public static void main(String[] args) {
		double valorSemana =0;
		double comissao;
		double valorTotal =0 ;
		double itens;
		String sitens, svalorSemana, scomissao;
		
		svalorSemana = JOptionPane.showInputDialog("Digite o valor da semana");
		valorSemana = Integer.parseInt(svalorSemana);
		scomissao = JOptionPane.showInputDialog("Digite o valor da comissão em %. Ex: 9% = 0.09");
		comissao = Double.parseDouble(scomissao);
		sitens = JOptionPane.showInputDialog("Digite o valor do Item ou digite 0 para sair");
		itens = Double.parseDouble(sitens);
		
		while(itens != 0)
		{
			
			valorSemana = valorSemana + comissao * itens;
			valorTotal = valorSemana;
			
			
			
			sitens = JOptionPane.showInputDialog("Digite o Item ou digite 0 para sair");
			itens = Double.parseDouble(sitens);
			
			valorTotal += comissao * itens;
			
		}
		
		DecimalFormat doisDigitos = new DecimalFormat ("0.00");
		JOptionPane.showMessageDialog(null,
		"Total de rendimentos do vendedor: "+doisDigitos.format(valorTotal),
		"Rendimento semanal",
		JOptionPane.INFORMATION_MESSAGE);

	}

}
