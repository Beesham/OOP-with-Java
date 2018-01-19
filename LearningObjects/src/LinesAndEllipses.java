import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Creates an 2d ellipse inside a 2d line (a plane?)
 * @author Beesham Sarendranauth 104854956
 * Date: 2018/01/17
 */
public class LinesAndEllipses {
	public static void main(String[] args) {

		Line2D line2D = new Line2D.Double(5,10,20,35);
		System.out.println("Line2D actual start point before change: x1: " + line2D.getX1() + " y1: " + line2D.getY1());
		System.out.println("Line2D actual end point before change: x2: " + line2D.getX2() + " y2: " + line2D.getY2());
		System.out.println("Line2D expected points before change: x1: 5 y1: 10 x2: 20 y2: 35\n");

		line2D.setLine(5,10,10,15);
		System.out.println("Line2D actual end point after change: x2: " + line2D.getX2() + " y2: " + line2D.getY2());
		System.out.println("Line2D expected end points after change: x2: 10 y2: 15\n");

		Ellipse2D ellipse2D = new Ellipse2D.Double(5,15,50,30);
		System.out.println("Ellipse2D actual x: " + ellipse2D.getX() + " y: " + ellipse2D.getY());
		System.out.println("Ellipse2D actual width: " + ellipse2D.getWidth() + " height: " + ellipse2D.getHeight());
		System.out.println("Ellipse2D expected x: 5 y: 15 width: 50 height: 30");
	}
}
