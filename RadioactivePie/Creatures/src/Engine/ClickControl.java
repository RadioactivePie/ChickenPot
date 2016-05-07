package Engine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickControl implements MouseListener {
	public int x;
	public int y;


	public void mouse(int x, int y) {

	}
	@Override
	public void mousePressed(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();

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
	public void mouseReleased(MouseEvent e) {

	}
}
