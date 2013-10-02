import javax.swing.JFrame;


public class frame {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setTitle("Two rectangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		frame.setVisible(true);
		
	}

}
