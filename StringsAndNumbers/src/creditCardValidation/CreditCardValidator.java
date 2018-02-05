package creditCardValidation;

import java.util.Scanner;

public class CreditCardValidator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		String ccNumStr = in.nextLine().trim().replace(" ", "");

		int sum = 0;
		for(int i = 0; i < ccNumStr.length(); i++) {
			sum = sum + Character.getNumericValue(ccNumStr.charAt(i));
		}

		int sumOfEverySecondDigi = 0;
		for(int i = ccNumStr.length() - 1; i >=0; i--) {
			if(i%2 == 0) sumOfEverySecondDigi = sumOfEverySecondDigi +
					Character.getNumericValue(ccNumStr.charAt(i));
		}

		System.out.println(sum);
		System.out.println(sumOfEverySecondDigi);

	}
}
