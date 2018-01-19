import javax.swing.ImageIcon;
import java.net.URL;
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) throws Exception {
		URL imageLocation = new URL("https://i.redd.it/z0gpokhh9va01.jpg");
		JOptionPane.showMessageDialog(null, "Hello Beesham", "Title",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}
