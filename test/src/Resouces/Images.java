package Resouces;

import java.awt.Graphics;


import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Images extends JPanel {
	private static final long serialVersionUID = 1L;

	public void play(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon play = new ImageIcon("Resources\\button1.png");
		play.paintIcon(this, g, x, y);
	}
	public void playHover(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon playHover = new ImageIcon("Resources\\button1hover.png");
		playHover.paintIcon(this, g, x, y);
	}
	public void playClick(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon playClick = new ImageIcon("Resources\\button1click.png");
		playClick.paintIcon(this, g, x, y);

}
	public void options(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon play = new ImageIcon("Resources\\optionsButton.png");
		play.paintIcon(this, g, x, y);	
}
	public void optionsHover(Graphics g, int x, int y) {
		super.paintComponent(g);
		ImageIcon play = new ImageIcon("Resources\\optionsHover.png");
		play.paintIcon(this, g, x, y);
	}}