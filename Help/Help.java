import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Help extends JPanel { // MUST EXTEND JPANEL

	private static final int WIDTH = 1280; // Constants should be initialized
											// and
	private static final int HEIGHT = 720; // declared at the top of a class as
											// such.

	// The JFrame
	public void createFrame() {
		JFrame window = new JFrame(); // Create object

		// Frame properties
		window.setSize(WIDTH, HEIGHT); // size
		window.setVisible(true); // visibility
		window.setResizable(false); // resize
		window.setLocationRelativeTo(null); // location
		window.setTitle("Chicken"); // name
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close
		
		window.add(this /* this refers to the class its in, 
				         what ever class you put in here 
						 is the paint method that will be
						 called */ );
		 startMainThread(); // Start the thread
	}

	// Graphics
	public void paint(Graphics g) {
		g.clearRect(0, 0, WIDTH, HEIGHT); // Clear screen
		
		// Call this method with the "repaint" key word
		g.drawLine(0, 0, 10, 10); // Example of draw line
	}

	private void startMainThread() {
		// Tells frame to update every few milliseconds
		while (true) {
			int fps = 60;
			long start = System.nanoTime();
			repaint(); // refers to the paint method
			start = System.nanoTime() - start;
			if (start < 1000000000 / fps)
				try {
					Thread.sleep((1000000000 / fps - start) / 1000000);// fps);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
