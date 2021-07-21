// Obtendo a entrada de usu�rio e criando um JFrame para exibir Shapes.
import javax.swing.JFrame; // manipula a exibi��o
import javax.swing.JOptionPane;

public class ShapesTest {

	public static void main(String[] args)
	{
		// obt�m a escolha do usu�rio
		String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n " +"Enter 2 to draw ovals");
		
		int choice = Integer.parseInt(input); // converte a entrada em int
		
		// cria o painel com a entrada do usu�rio
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame(); // cria um novo JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
		
		
	}

} // fim da classe ShapesTest
