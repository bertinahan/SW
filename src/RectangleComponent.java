import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

// I don't like it


import javax.swing.JComponent;


public class RectangleComponent extends JComponent{
	public void painComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(5,10,20,30);
		g2.draw(box);
		
		box.translate(15, 25);
	}

}
