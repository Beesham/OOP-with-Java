package test;

import checkout.CashRegister;

public class testCashRegister {
	public static void main (String[] args) {
		CashRegister cashRegister = new CashRegister();

		cashRegister.setAmountDue(123);
		cashRegister.setAmountReceived(120);
		cashRegister.printChange();

		cashRegister.setAmountDue(120);
		cashRegister.setAmountReceived(120);
		cashRegister.printChange();

		cashRegister.setAmountDue(100);
		cashRegister.setAmountReceived(200);
		cashRegister.printChange();
	}
}
