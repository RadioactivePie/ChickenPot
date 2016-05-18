import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintFrame extends JPanel{
	static int xMove;
	static int yMove;
	public static int xClick;
	public static int yClick;
	public static int xHover;
	public static int yHover;
	int first = 3;
	boolean erase = false;
	JFrame Frame = new JFrame("Frame1");
	JPanel Panel1= new JPanel();
	
	Images i = new Images();

	public paintFrame(){
		Frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		Frame.addMouseMotionListener(new Listener());
		Frame.addMouseListener(new mouse());
		Frame.add(this);
		
		
	
		startMainThread();
		
	}
	
	public void paint1(Graphics g){
		if(first > 0){
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 10000, 10000);
			Frame.revalidate();
			first--;
		}
		g.setColor(Color.RED);
		g.fillRect(getWidth()-125,0, 75,80);
		g.setColor(Color.ORANGE);
		g.fillRect(getWidth()-125, 80, 75, 80);
		g.setColor(Color.YELLOW);
		g.fillRect(getWidth()-125, 160, 75, 80);
		g.setColor(Color.GREEN);
		g.fillRect(getWidth()-125, 240, 75, 80);
		g.setColor(Color.BLUE);
		g.fillRect(getWidth()-125, 320, 75, 80);
		g.setColor(Color.MAGENTA);
		g.fillRect(getWidth()-125, 400, 75, 80);
		g.setColor(Color.BLACK);
		g.fillRect(getWidth()-125, 480, 75, 80);
	}
	
	public void paint(Graphics g){
		
		paint1(g);
		//Writing AND SETCOLOR
		
		if(xClick>=getWidth()-125 && xClick <=getWidth()-45 && erase==true){
			if(yClick>=0 && yClick < 600){
				erase=false;
			}
			}
		if(xClick>=getWidth()-125 && xClick <=getWidth()-45 && erase==false){
			if(yClick>=0 && yClick < 110){
				g.setColor(Color.RED);	
			}
			 if(yClick>=110 && yClick < 190){
				 g.setColor(Color.ORANGE); 
			 }
			 if(yClick>=190 && yClick < 270){
				 g.setColor(Color.YELLOW);
			 }
			 if(yClick>=270 && yClick < 350){
				 g.setColor(Color.green);
			 }
			 if(yClick>=350 && yClick < 430){
				 g.setColor(Color.BLUE);
			 }
			 if(yClick>=430 && yClick < 510){
				 g.setColor(Color.MAGENTA);
			 }
			 if(yClick>=510 && yClick < 600){
				 g.setColor(Color.BLACK);
			 } 
			 g.fillOval(xMove-15, yMove-40, 15, 15);
		}

		
		
		if(xClick >=getWidth()-200  && xClick <= getWidth()){
			if(yClick>=570 && yClick<=700){
				g.setColor(Color.WHITE);
				erase=true;
				g.fillOval(xMove-35, yMove-60, 45, 45);
				
			}
		}
		drawImages(g);

		//erases all writing
		if(xClick>=500 && xClick<=750){
		if(yClick>=730 && yClick<=845){
			first=3;
			paint1(g);
			drawImages(g);
		}
	}
	
	
	}
	
	private void drawImages(Graphics g) {
		i.paintEraser(g,1075,350);
		i.paintDeleteButton(g,500,700);
		
	}

	private void startMainThread() {
		while (true) {
			int fps = 120;
			long start = System.nanoTime();
			repaint();
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
	public int getWidth(){
		return Frame.getWidth();
		
	}
	
	public int getHeight(){
		return Frame.getHeight();
		
	}


}
