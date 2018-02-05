package creditCardValidation;

import java.util.Scanner;

/**
 * Validates a credit card number given by a user
 * @author Beesham Sarendranauth, 104854956
 */
public class CreditCardValidator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		String ccNumStr = in.nextLine();
		System.out.println(validate(ccNumStr));
	}

	/**
	 * Checks if a given credit card number is valid
	 * @param ccNumStr the number to check as string
	 * @return true if valid else false
	 */
	public static boolean validate(String ccNumStr) {

		ccNumStr = ccNumStr.trim().replace(" ", "");	//remove white space before, after, and in between

		//Calculates total sum of all numbers in the sequence
		int sum = 0;
		for(int i = 0; i < ccNumStr.length(); i++) {
			sum += Character.getNumericValue(ccNumStr.charAt(i));
		}

		//Calculates the sum of every second digit from the right and counts
		//the number of digits that are > 4
		int sumOfEverySecondDigi = 0;
		int numOfEverySecondDigiMoreThanFour = 0;
		for(int i = ccNumStr.length() - 1; i >=0; i--) {
			if(i%2 == 0) {
				sumOfEverySecondDigi +=	Character.getNumericValue(ccNumStr.charAt(i));

				if(Character.getNumericValue(ccNumStr.charAt(i)) > 4) {
					numOfEverySecondDigiMoreThanFour++;
				}
			}
		}

		int finalSum = sum + sumOfEverySecondDigi + numOfEverySecondDigiMoreThanFour;

		if(finalSum % 10 == 0) return true;
		else return false;
	}

}
