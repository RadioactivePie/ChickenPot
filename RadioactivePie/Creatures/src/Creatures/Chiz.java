package Creatures;

import java.awt.Color;

public class Chiz extends Creature {

	private int maxEnergy = 20;

	public Chiz() {
		energy = maxEnergy;
		hostile = true;
	}

	public Chiz(double x, double y, int width, int red, int green, int blue) {
		super(x, y, width, red, green, blue);
		color = new Color(red, green, blue);
		energy = maxEnergy;
		hostile = true;
	}

	@Override
	protected void AI() {
		movement();
		if (getRandom(100) > 93) {
			changeDirection();
		}
		energy -= 0.5;
		feed();
		System.out.println(direction);

	}

	private void feed() {
		if (energy < 5) {
			energy = maxEnergy;
		}
		for (Creature c : Creatures) {
			int centerX = (int) (c.getX() + c.getWidth() / 2);
			int centerY = (int) (c.getY() + c.getHeight() / 2);

			if (centerX > getX() && centerX < getX() + getWidth()) {
				if (centerY > getY() && centerY < getY() + getHeight()) {
					if (!(c.color.equals(c.color.brighter()) || c.color.equals(c.color.darker())))
						c.kill();
				}
			}
		}
	}

	private void movement() {
		switch (direction) {
		case 0:
			xvel = 0;
			yvel = -1;
			break;
		case 1:
			yvel = 0;
			xvel = 1;
			break;
		case 2:
			xvel = 0;
			yvel = 1;
			break;
		case 3:
			yvel = 0;
			xvel = -1;
			break;
		}

	}

	@Override
	protected void giveBirth() {
		Creatures.add(new Chiz(getX(), getY(), getWidth(), red, green, blue));

	}

}
