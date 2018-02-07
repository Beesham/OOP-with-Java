package test;

import banking.BankAccount;

/**
 * Tests bankAccount class
 */
public class testBankAccount {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(20000);

 		System.out.println("Init balance...Actual: " + bankAccount.getBalance() + " Expected: 20000");

 		bankAccount.deductMonthlyCharge();
 		System.out.println("Balance (Month 1)...Actual: " + bankAccount.getBalance() + " Expected: 20000");

 		for(int i = 0; i < 20; i++) {
			bankAccount.withdraw(1);
		}
		System.out.println("Balance 20 withdrawals...Actual: " + bankAccount.getBalance() + " Expected: 19980");
 		bankAccount.deductMonthlyCharge();
		System.out.println("Balance 20 withdrawals + fee (Month 2)...Actual: " + bankAccount.getBalance() + " Expected: 19970");

		for(int i = 0; i < 10; i++) {
			bankAccount.withdraw(1);
		}

		System.out.println("Balance 10 withdrawals...Actual: " + bankAccount.getBalance() + " Expected: 19960");
		bankAccount.deductMonthlyCharge();
		System.out.println("Balance 10 withdrawals + fee (Month 3)...Actual: " + bankAccount.getBalance() + " Expected: 19960");


		for(int i = 0; i < 5; i++) {
			bankAccount.withdraw(1);
		}
		for(int i = 0; i < 5; i++) {
			bankAccount.deposit(1);
		}
		System.out.println("Balance 5 withdrawals and 5 deposit...Actual: " + bankAccount.getBalance() + " Expected: 19960");
		bankAccount.deductMonthlyCharge();
		System.out.println("Balance 5 withdrawals and 5 deposit + fee (Month 4)...Actual: " + bankAccount.getBalance() + " Expected: 19960");

	}
}
