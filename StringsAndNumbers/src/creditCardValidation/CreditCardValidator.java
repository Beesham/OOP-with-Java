package creditCardValidation;

import java.util.Scanner;

public class CreditCardValidator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		String ccNumStr = in.nextLine().trim().replace(" ", "");

		int sum = 0;
		for(int i = 0; i < ccNumStr.length(); i++) {
			sum = sum +Character.getNumericValue(ccNumStr.charAt(i));
		}

		System.out.println(sum);

	}
}
