package graphicalHouse;

import javax.swing.*;
import java.awt.*;

/**
 * @author Beesham Sarendranauth
 * Main viewer for the house
 */
public class HomeViewer {
	public static void main(String[] args) {

		GridLayout gridLayout = new GridLayout(0, 2);

		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setTitle("Houses");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(gridLayout);
		frame.add(new HomeComponent());
		frame.add(new HomeComponent());
		frame.add(new HomeComponent());
		frame.add(new HomeComponent());

		frame.setVisible(true);

	}
}
