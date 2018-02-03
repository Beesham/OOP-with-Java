package test;

import microwave.Microwave;

public class testMicrowave {
	public static void main(String[] args) {
		Microwave microwave = new Microwave();

		microwave.start();
		microwave.increaseTime();
		microwave.setPowerLevel("High");
		microwave.start();
		microwave.stop();
		microwave.getTime();


	}
}
