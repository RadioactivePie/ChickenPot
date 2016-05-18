package test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ClickControl implements MouseListener {
	boolean mouseDown = false;
	long newTime;
	long time;
	int x;
	int y;


	public void mouse(int x, int y) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseDown = true;
		x = e.getX();
		y = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseDown = false;
		x = 0;
		y = 0;

	}
}