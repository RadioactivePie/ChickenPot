package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class ex extends JPanel {
	public static ClickControl click = new ClickControl();
	public static HoverControl hover = new HoverControl();
	StartScreen Current = new StartScreen();
	public static JFrame f = new JFrame("Pictionary");
	public ex() {

		
		f.setSize(800,600);
		f.addMouseListener(click);
		f.addMouseMotionListener(hover);
		f.add(Current);
		f.setVisible(true);
		startMainThread();
	}


	

	private void startMainThread() {
		while (true) {
			int fps = 60;
			long start = System.nanoTime();
			Current.repaint();
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

	public static void main(String args[]) {
		new ex();
	}
}
// start,options(volume), How to play

