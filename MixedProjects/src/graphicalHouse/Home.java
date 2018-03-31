package graphicalHouse;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @author Beesham Sarendranauth
 * Draws a single house
 */
public class Home {
	private int x;
	private int y;

	public Home(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Draws a single house
	 * @param g2
	 */
	public void draw(Graphics2D g2) {

		int roofHeight = 50;
		int roofWidth = 100;
		int wallHeight = 100;
		int wallWidth = 100;
		int doorHeight = 50;
		int doorWidth = 25;

		Rectangle walls = new Rectangle(x, roofWidth, 100, 100);
		Rectangle door = new Rectangle(x + wallWidth/2 - doorWidth/2, wallHeight + doorHeight, doorWidth, doorHeight);
		Ellipse2D circle = new Ellipse2D.Double(x + wallWidth/2 - 10, (roofHeight + roofWidth)/2, 20,20);
		Polygon roof = new Polygon(new int[]{x, x + (roofWidth/2), roofWidth + x}, new int[]{100, roofHeight,100}, 3);

		g2.setColor(Color.BLUE);
		g2.drawPolygon(roof);
		g2.draw(walls);
		g2.fill(door);
		g2.draw(circle);
	}

}
