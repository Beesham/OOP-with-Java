package graphicalHouse;

import javax.swing.*;
import java.awt.*;

/**
 * @author Beesham Sarendranauth
 * House component
 */
public class HomeComponent extends JComponent {
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Home home = new Home(100,100);
		home.draw(g2);
	}
}
