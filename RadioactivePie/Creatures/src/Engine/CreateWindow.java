package Engine;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CreateWindow extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JFrame window = new JFrame();
	private static Window currentScreen = new Window();
	int fps = 40;
	public CreateWindow() {
		window.setSize(1400, 788);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
		window.addMouseListener(new ClickControl());
		window.addMouseMotionListener(new HoverControl());
		window.addKeyListener(new KeyControl());
		window.add(currentScreen);
		window.setLocationRelativeTo(null);
		window.setTitle("Solo Probe");
		ImageIcon img = new ImageIcon("Resources\\Images\\SP_Icon.png");
		window.setIconImage(img.getImage());
		startMainThread();
		
	}
	private void startMainThread() {
		while (true) {
			long start = System.nanoTime();
			currentScreen.repaint();
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
	static public void main(String args[]){
		new CreateWindow();
	}

}
