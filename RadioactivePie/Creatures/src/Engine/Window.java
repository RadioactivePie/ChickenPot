package Engine;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import Creatures.Chiz;
import Creatures.Creature;
import Creatures.Ziggerate;
import Terrain.Tile;

public class Window extends JPanel {
	private static final long serialVersionUID = 1L;

	public static ArrayList<Creature> Creatures = new ArrayList<Creature>();
	public static ArrayList<Tile> Tiles = new ArrayList<Tile>();

	public Window() {
		// add creatures
		for (int i = 0; i < 10; i++) {
			Creatures.add(new Ziggerate());
		}
		for (int i = 0; i < 5; i++) {
			Creatures.add(new Chiz());
		}
		for (int i = 0; i < 2; i++) {
			//Tiles.add(new Tile());
		}

	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, 1400, 788);
		// draw them
		for (Tile t : Tiles) {
			t.drawTile(g);
		}
		for (Creature c : Creatures) {
			c.drawCreature(g);
		}	

	}

	public static ArrayList<Creature> getCreatures() {
		return Creatures;
	}

}
