

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl implements KeyListener {
	@Override
	public void keyReleased(KeyEvent e) {
		// Example: Check if "D" was Clicked
		if (e.getKeyCode() == KeyEvent.VK_D) {
			// Do something 
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
