package test;

import creditCardValidation.CreditCardValidator;

public class testCreditCardValidator {
	public static void main(String[] args) {
		String ccNum1 = "4012 8888 8888 1881";
		String ccNum2 = "4012 8888 8888 188";
		String ccNum3 = "4012 8888 8888 1882";


		System.out.println("Actual: " + CreditCardValidator.validate(ccNum1) + " Expected: true");
		System.out.println("Actual: " + CreditCardValidator.validate(ccNum2) + " Expected: false");
		System.out.println("Actual: " + CreditCardValidator.validate(ccNum3) + " Expected: false");
		
	}

}
