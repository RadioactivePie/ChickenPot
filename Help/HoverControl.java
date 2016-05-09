
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class HoverControl implements MouseMotionListener {
	public boolean startbutton = false;
	public int x;
	public int y;
	int xsize;
	int ysize;

	public void mouse(int x, int y) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.x = x;
		this.y = y;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.x = x;
		this.y = y;
	}
}
