import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Images extends JPanel {
	private static final long serialVersionUID = 1L;
	public void paintEraser(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon("resources/newEraser3.png");
		image.paintIcon(this, g, x, y);
		
	}

	public void paintDeleteButton(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon("resources/deletebeforepressed.jpg");
		image.paintIcon(this, g, x, y);
	}
}
