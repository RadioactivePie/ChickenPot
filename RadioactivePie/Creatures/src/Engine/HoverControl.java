package Engine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HoverControl implements MouseMotionListener {
	public int x;
	public int y;


	public void mouse(int x, int y) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();

	}
}
