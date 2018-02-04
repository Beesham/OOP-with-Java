package microwave;

/**
 * Class that simulates a microwave
 */
public class Microwave {
	private String powerLevel;
	private int time;
	private boolean stopFlag;

	//Constructor
	public Microwave() {
		time = 0;
		powerLevel = "Medium";
		stopFlag = false;
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
	 */
	public void setPowerLevel(String powerLevel) {
		this.powerLevel = powerLevel;
	}

	public String getPowerLevel() {
		return powerLevel;
	}

	/**
	 * Stops the microwave
	 */
	public void stop() {
		stopFlag = true;
	}

	/**
	 * Resets the microwave/timer to zero
	 */
	public void reset() {
		time = 0;
		stopFlag = false;
	}

	/**
	 * Starts the timer/microwave
	 */
	public void start() {
		System.out.println("Cooking for " + time + " seconds at level " + powerLevel);
		for(int i = time; i >= 0; time--) {
			//Dec time and watch for stop flag
		}
	}
}
