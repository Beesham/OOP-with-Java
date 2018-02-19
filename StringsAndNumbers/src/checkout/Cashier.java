package checkout;

import java.util.Scanner;

/*
	Class that models a Cashier that uses a CashRegister
*/
public class Cashier {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the amount due: ");
		int due  = in.nextInt();

		System.out.print("Please enter the amount received: ");
		int received = in.nextInt();

		CashRegister cashRegister = new CashRegister();
		cashRegister.setAmountDue(due);
		cashRegister.setAmountReceived(received);
		cashRegister.printChange();
		cashRegister.clear();
	}
}
