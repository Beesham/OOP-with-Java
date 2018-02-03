package microwave;

/**
 * Class that simulates a microwave
 */
public class Microwave {
	private String powerLevel;
	private int time;

	//Empty constructor
	public Microwave() {
	}

	/**
	 * Increases the timer by 10 seconds
	 */
	public void increaseTime() {
		time =+ 10;
	}

	public int getTime() {
		return time;
	}

	/**
	 * Sets the power level of the microwave: Low, Medium, High
	 * @param powerLevel
	 * @return
	 */
	public String setPowerLevel(String powerLevel) {
		//TODO
		return null;
	}

	/**
	 * Stops the microwave
	 */
	public void stop() {
		//TODO
	}

	/**
	 * Resets the microwave/timer to zero
	 */
	public void reset() {
		//TODO
	}

	/**
	 * Starts the timer/microwave
	 * @return the timer and power level
	 */
	public String start() {
		//TODO
		return null;
	}
}
