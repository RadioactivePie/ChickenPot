package Creatures;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import Engine.Window;

public abstract class Creature {
	final protected Random randomGenerator = new Random();
	ArrayList<Creature> Creatures = Window.getCreatures();
	private double x;
	private double y;
	public double xvel;
	public double yvel;
	protected int direction;
	private int width;
	private int height;
	protected int energy;
	protected int Damage;
	protected int Health;
	int red = 100;
	int green = 100;
	int blue = 100;
	protected Color color;
	protected boolean sheild;
	public boolean hostile;
	public int lifeSpan = 0;
	private boolean canGiveBirth = true;

	public Creature() {
		x = randomGenerator.nextInt(1400);
		y = randomGenerator.nextInt(788);
		width = randomGenerator.nextInt(80) + 10;
		height = getWidth();
		green = randomGenerator.nextInt(255);
		red = randomGenerator.nextInt(255);
		blue = randomGenerator.nextInt(255);
	}

	public Creature(double x, double y, int width, int red, int green, int blue) {
		this.x = x;
		this.y = y;
		this.width = width + randomGenerator.nextInt(10) - 5;
		height = getWidth();
		red = red + getRandom(10) - 5;
		green = green + getRandom(10) - 5;
		blue = blue + getRandom(10) - 5;
		color = new Color(red, green, blue);
	}
	public void drawCreature(Graphics g) {
		AI();
		stayOnScreen();
		g.setColor(color);
		g.fillOval((int) getX(), (int) getY(), getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.drawOval((int) getX(), (int) getY(), getWidth(), getHeight());
		canGiveBirth();
			
		lifeSpan++;
		x = getX() + xvel * energy / 3;
		y = getY() + yvel * energy / 3;
	}

	private void canGiveBirth() {
		if(lifeSpan > 300 && canGiveBirth && getRandom(500) > 480){
			canGiveBirth = false;
			giveBirth();
		}
		
	}

	protected abstract void giveBirth();
	
	private void stayOnScreen() {
		// stay on screen code
		if(xvel > 0 && getX() > 1400){
			xvel = -xvel;
		}
		if(yvel > 0 && getY() > 788){
			yvel = -yvel;
		}
		if(xvel < 0 && getX() < 0){
			xvel = -xvel;
		}
		if(yvel < 0 && getY() < 0){
			yvel = -yvel;
		}

	}
	public int getRandom(int num){
		return randomGenerator.nextInt(num);
		
	}
	protected void changeDirection(){
		boolean leftTurn;
		if(getRandom(2) == 0) {
		leftTurn = true;
		}else{
		leftTurn = false;
		}
		
		if(leftTurn){
			direction--;
			if(direction == -1)
				direction = 3;
		}else{
			direction++;
			if(direction == 4)
				direction = 0;
		}
	}

	protected abstract void AI();

	public void kill() {
		Creatures.remove(this);
		
	}

	public double getX() {
		return x;
	}

	public int getWidth() {
		return width;
	}

	public double getY() {
		return y;
	}

	public int getHeight() {
		return height;
	}

}
