// Obtendo a entrada de usu�rio a partir de um di�logo.
import javax.swing.JOptionPane;
public class NameDialog {

	public static void main(String[] args) {
		// pede para o usu�rio inserir seu nome
		String nome = JOptionPane.showInputDialog("Qual seu nome ?");
		
		// cria a mensagem
		String mensagem = String.format("Bem vindo %s a Programa��o em Java", nome);
		
		// exibe a mensagem para cumprimentar o usu�rio pelo nome
		JOptionPane.showMessageDialog(null, mensagem);
		
		
	}

}
