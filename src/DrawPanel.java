// Utilizando DrawLine para conectar os cantos de um painel.
import javax.swing.JPanel;
import java.awt.Graphics;
@SuppressWarnings("serial")
public class DrawPanel extends JPanel{

	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g)
	{
		// chama paintComponent para assegurar que o painel � exibido corretamente
		super.paintComponent(g);
		
		int width = getWidth(); // largura total
		int height = getHeight(); // altura total
		
		// desenha uma linha a partir do canto superior esquerdo at� o inferior direito
		g.drawLine(0, 0, width, height);
		g.drawLine(0, 60, 60, 0);
		g.drawLine(10, 70, 60, 0);
		g.drawLine(20, 80, 60, 0);
		
		// desenha uma linha a partir do canto inferior esquerdo at� o superior direito
		g.drawLine(0, height, width, 0);
		
		
	}
}
