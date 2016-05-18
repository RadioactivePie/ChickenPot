import java.awt.event.*;
public class Listener implements MouseMotionListener {
	int x;
	int y;
	@Override
	public void mouseDragged(MouseEvent moo) {
		paintFrame.xMove = moo.getX();
		paintFrame.yMove = moo.getY();
		
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
