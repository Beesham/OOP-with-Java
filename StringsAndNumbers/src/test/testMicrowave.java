package test;

import microwave.Microwave;

/**
 * Tests Microwavw class
 * @author Beesham Sarendranauth, 104854956
 */
public class testMicrowave {
	public static void main(String[] args) {
		Microwave microwave = new Microwave();

		microwave.start();
		microwave.increaseTime();
		System.out.println("Actual: " + microwave.getTime() + " Expected: 10");

		System.out.println("Actual: " + microwave.getPowerLevel() + " Expected: Medium");
		microwave.setPowerLevel("High");
		System.out.println("Actual: " + microwave.getPowerLevel() + " Expected: High");

		microwave.start();
		microwave.stop();

		System.out.println("Actual: " + microwave.getTime() + " Expected: 0");

		microwave.increaseTime();
		System.out.println("Actual: " + microwave.getTime() + " Expected: 10");
		microwave.reset();
		System.out.println("Actual: " + microwave.getTime() + " Expected: 10");

	}
}
