// Aplicativo de teste que exibe um rosto sorridente.
import javax.swing.JFrame;

public class DrawSmileyTest {

	public static void main(String[] args) 
	{
		DrawSmiley panel = new DrawSmiley();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 260);
		application.setVisible(true);
		
		
	}

}// fim da classe DrawSmileyTest
