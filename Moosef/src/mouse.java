
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;


	public class mouse implements MouseListener {
		boolean mouseDown = false;
		long newTime;
		long time;
		int x;
		int y;


		public void mouse(int x, int y) {

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			paintFrame.xClick = e.getX();
			paintFrame.yClick = e.getY();
			mouseDown = true;
		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			mouseDown = false;

		}
}
