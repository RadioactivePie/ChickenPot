package Engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl implements KeyListener {
	public boolean pressed = false;
	public boolean right = false;
	public boolean space = false;
	public boolean down = false;
	public boolean left = false;
	public boolean up = false;



	@Override
	public void keyPressed(KeyEvent e) {
		// controls
		if (e.getKeyCode() == KeyEvent.VK_D) {
			right = true;
			pressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			left = true;
			pressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			up = true;
			pressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			down = true;
			pressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			space = true;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_D) {
			right = false;
			pressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			left = false;
			pressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			up = false;
			pressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			down = false;
			pressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			space = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
