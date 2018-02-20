package comboLock;

/**
 * Models a combination lock
 * @author Beesham Sarendranauth
 */
public class ComboLock {

	public static final int MIN_COMBO_NUM = 0;
	public static final int MAX_COMBO_NUM = 39;

	/*
	The combo to open the lock
	 */
	private int secret1, secret2, secret3;

	/*
	The numbers chosen by the user
	 */
	private int num1, num2, num3;

	/*
	Counts how many times the dial was touched
	 */
	private int dialTouchCount;

	public ComboLock(int secret1, int secret2, int secret3) {
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;

		num1 = 0;
		num2 = 0;
		num3 = 0;
		dialTouchCount = 0;
	}

	/**
	 * Resets the dial to 0
	 */
	public void reset() {
		dialTouchCount = 0;
	}

	/**
	 * Turns the dial left a given number of times
	 * @param ticks the number of times to turn the dial
	 */
	public void turnLeft(int ticks) {
		if(dialTouchCount == 1) {
			if(ticks >= MIN_COMBO_NUM && ticks <= MAX_COMBO_NUM) {
				num2 = ticks;
				dialTouchCount++;
			}else{
				num2 = 0;
				dialTouchCount++;
			}
		}
	}

	/**
	 * Turns the dial right a given number of times
	 * @param ticks the number of times to turn the dial
	 */
	public void turnRight(int ticks) {
		if(dialTouchCount == 0) {
			if(ticks >= MIN_COMBO_NUM && ticks <= MAX_COMBO_NUM) {
				num1 = ticks;
				dialTouchCount++;
			}else{
				num1 = 0;
				dialTouchCount++;
			}
		}else if(dialTouchCount == 2) {
			if(ticks >= MIN_COMBO_NUM && ticks <= MAX_COMBO_NUM) {
				num3 = ticks;
				dialTouchCount++;
			}else{
				num2 = 0;
				dialTouchCount++;
			}
		}
	}

	/**
	 * Attempts to open lock
	 * @return true if combo is correct, else false
	 */
	public boolean open() {
		if(num1 == secret1 &&
				num2 == secret2 &&
				num3 == secret3) {
			return true;
		}
		return false;
	}
}
