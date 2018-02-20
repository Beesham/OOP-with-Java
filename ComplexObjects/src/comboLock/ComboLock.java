package comboLock;

/**
 * Models a combination lock
 * @author Beesham Sarendranauth
 */
public class ComboLock {

	public static final int MIN_COMBO_NUM = 0;
	public static final int MAX_COMBO_NUM = 39;

	private int secret1, secret2, secret3;

	public ComboLock(int secret1, int secret2, int secret3) {
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
	}

	/**
	 * Resets the dial to 0
	 */
	public void reset() { }

	/**
	 * Turns the dial left a given number of times
	 * @param ticks the number of times to turn the dial
	 */
	public void turnLeft(int ticks) { }

	/**
	 * Turns the dial right a given number of times
	 * @param ticks the number of times to turn the dial
	 */
	public void turnRight(int ticks) {  }

	/**
	 * Attempts to open lock
	 * @return true if combo is correct, else false
	 */
	public boolean open() {
		return false;
	}
}
