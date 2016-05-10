package loadresources.solo_probe;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Images extends JPanel {
	private static final long serialVersionUID = 1L;

	public void paintLogo(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon("Resources\\Images\\SP_Icon.png");
		image.paintIcon(this, g, x, y);
	}
	public void paintEnemyShip(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon("Resources\\Images\\EnemyShip.png");
		image.paintIcon(this, g, x, y);
	}
	public void paintEnemyShipSmall(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon("Resources\\Images\\EnemyShipSmall.png");
		image.paintIcon(this, g, x, y);
	}

	public void paintSplash(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon(
				"Resources\\Images\\Solo_Probe_Splash.png");
		image.paintIcon(this, g, x, y);
	}
	public void paintSave(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon(
				"Resources\\Images\\SP_Save.png");
		image.paintIcon(this, g, x, y);
	}

	public void paintHighlight(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon(
				"Resources\\Images\\Splash_highlight.png");
		image.paintIcon(this, g, x, y);
	}

	public void paintOptionsSplash(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon("Resources\\Images\\SP_Options.png");
		image.paintIcon(this, g, x, y);
	}
	public void paintOpHighlight(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon(
				"Resources\\Images\\SP_Options_highlight.png");
		image.paintIcon(this, g, x, y);
	}
	public void paintHowTo(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon(
				"Resources\\Images\\SP_HowTo.png");
		image.paintIcon(this, g, x, y);
	}
	public void paintShip(Graphics g, int x, int y, double angle) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon(
				"Resources\\Images\\Ship.png");
		ImageIcon i = rotateImageIcon(image, angle);
				i.paintIcon(this, g, x, y);
	}
	static private ImageIcon rotateImageIcon(ImageIcon picture, double angle) {
        // FOR YOU ...
        int w = picture.getIconWidth() ;
        int h = picture.getIconHeight();
        int type = BufferedImage.TYPE_INT_RGB;  // other options, see api
        BufferedImage image = new BufferedImage(h, w, type);
        Graphics2D g2 = image.createGraphics();
        double x = (h - w)/2.0;
        double y = (w - h)/2.0;
        AffineTransform at = AffineTransform.getTranslateInstance(x, y);
        at.rotate(Math.toRadians(angle), w/2.0, h/2.0);
        g2.drawImage(picture.getImage(), at, null);
        g2.dispose();
        picture = new ImageIcon(image);
 
        return picture;
    }
	
}
