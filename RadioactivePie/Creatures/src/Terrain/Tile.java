package Terrain;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import Creatures.Creature;
import Engine.Window;

public class Tile {
	final protected Random randomGenerator = new Random();
	ArrayList<Creature> Creatures = Window.getCreatures();
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected Color color;

	public Tile() {
		x = randomGenerator.nextInt(1400);
		y = randomGenerator.nextInt(788);
		width = 500;
		height = width / 4;
		color = Color.CYAN;
	}

	public void drawTile(Graphics g) {
		checkIfOn();
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

	public void checkIfOn() {
		for (Creature c : Creatures) {
			int centerX = (int) (c.getX() + c.getWidth() / 2);
			int centerY = (int) (c.getY() + c.getHeight() / 2);
			if (centerX > x && centerX < x + width) {
				if (centerY > y && centerY < y + height) {
					if(c.hostile){
					c.kill();
					}
				}
			}
		}
	}
}
