package graphicalHouse;

import javax.swing.*;

/**
 * @author Beesham Sarendranauth
 * Main viewer for the house
 */
public class HomeViewer {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setTitle("Houses");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new HomeComponent());
		frame.setVisible(true);

	}
}
