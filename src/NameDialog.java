// Obtendo a entrada de usuário a partir de um diálogo.
import javax.swing.JOptionPane;
public class NameDialog {

	public static void main(String[] args) {
		// pede para o usuário inserir seu nome
		String nome = JOptionPane.showInputDialog("Qual seu nome ?");
		
		// cria a mensagem
		String mensagem = String.format("Bem vindo %s a Programação em Java", nome);
		
		// exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, mensagem);
		
		
	}

}
