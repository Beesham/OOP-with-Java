package microwave;

/**
 * Class that simulates a microwave
 * @author Beesham Sarendranauth, 104854956
 */
public class Microwave {
	private String powerLevel;
	private int time;
	private boolean stopFlag;

	//Constructor
	public Microwave() {
		time = 0;
		powerLevel = "Medium";
		stopFlag = true;
	}

	/**
	 * Increases the timer by 10 seconds
	 */
	public void increaseTime() {
		time += 10;
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
		System.out.println("Cooking stopped");
		stopFlag = true;
	}

	/**
	 * Resets the microwave/timer to zero
	 */
	public void reset() {
		//Can't reset if microwave is running
		if(!stopFlag) {
			time = 0;
			stopFlag = true;
		}
	}

	/**
	 * Starts the timer/microwave
	 */
	public void start() {
		//Can't start when already started
		if(stopFlag) {
			stopFlag = false;
			System.out.println("Cooking for " + time + " seconds at level " + powerLevel);
			for (; time > 0; time--) {
				//Dec time and watch for stop flag
				//System.out.println("Cooking for " + time);
			}
			stopFlag = true;
		}
	}
}
