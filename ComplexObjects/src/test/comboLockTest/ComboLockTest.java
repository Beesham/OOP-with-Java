package test.comboLockTest;

import comboLock.ComboLock;

import java.util.Scanner;

/**
 * Test ComboLock.class
 * Will try to open lock upon special exit condition for loop
 * @author Beesham Sarendranauth
 */
public class ComboLockTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ComboLock comboLock = new ComboLock(24, 10, 2);

		int num1, num2, num3;
		do{
			System.out.print("Enter first number in combo: ");
			num1 = in.nextInt();

			System.out.print("Enter second number in combo: ");
			num2 = in.nextInt();

			System.out.print("Enter second number in combo: ");
			num3 = in.nextInt();

			comboLock.turnRight(num1);
			comboLock.turnLeft(num2);
			comboLock.turnRight(num3);
			if(comboLock.open()) System.out.println("Lock Opened!");
			else System.out.println("Wrong combination! Try again...");
			comboLock.reset();
		}while(num1 != 0 && num2 != 0 && num3 != 0);
	}
}
