package test;

import java.awt.Graphics;

import javax.swing.JPanel;

import Resouces.Images;

public class StartScreen extends JPanel {
	Images i = new Images();
	public void paint(Graphics g) {
		g.clearRect(0, 0, 10000, 100000);
		checkClick(g);
		checkHover(g);
	
	}

	private void checkHover(Graphics g) {
		
		
		if (ex.click.x > 247 && ex.click.x < 550 && ex.click.y > 143 && ex.click.y < 247) {
		i.playClick(g, 240, 115);
		i.options(g, 240, 300);
		}
		else if (ex.hover.x > 247 && ex.hover.x < 550 && ex.hover.y > 330 && ex.hover.y < 434) {
		i.optionsHover(g, 240, 300);
		i.play(g, 240, 115);	
		}		
		else if (ex.hover.x > 247 && ex.hover.x < 550 && ex.hover.y > 143 && ex.hover.y < 247){
			i.playHover(g, 240, 115);
			i.options(g, 240, 300);
		}
		else{
			i.play(g, 240, 115);
			i.options(g, 240, 300);
		}
		
	}

	private void checkClick(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
}
