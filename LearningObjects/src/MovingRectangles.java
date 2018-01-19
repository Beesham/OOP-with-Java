import java.awt.Rectangle;

/**
 * Creates and moves a rectangle object
 * @author Beesham Sarendranauth 104854956
 * Date: 2018/01/17
 */
public class MovingRectangles {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(20, 50, 15, 20);
		rectangle1 = new Rectangle(60, 30, 15, 20); //Assuming rectangle1 is re-created with new values
																		//that overrides the previous statement

		rectangle1.translate(10,5);
		System.out.println("Actual after translate x: " + rectangle1.getX() + " y: " + rectangle1.getY());
		System.out.println("Expected: x: 70 y: 35\n");

		rectangle1.setSize(7, 40);
		System.out.println("Actual after re-size width: " + rectangle1.width + " height: " + rectangle1.height);
		System.out.println("Expected: width: 7 height: 40");
	}
}
