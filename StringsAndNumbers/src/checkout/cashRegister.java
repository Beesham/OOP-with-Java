package checkout;

public class CashRegister {
	private int amountDue;
	private int amountReceived;
	private int change;

	public CashRegister() {
		amountDue = 0;
		amountReceived = 0;
		change = 0;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(int amountDue) {
		this.amountDue = amountDue;
	}

	public double getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(int amountReceived) {
		this.amountReceived = amountReceived;
	}

	/**
	 * Displays the change due
	 */
	public void printChange() {
		change = amountReceived - amountDue;
		if(change< 0) {
			System.out.println("We need more money");
		} else if(change == 0){
			System.out.println("No Change required");
		} else {
			System.out.println(calculateChange());
		}
	}

	/*dollar: 100 cents
		quarter: 25
		dime: 10
		nickle: 5
		penny = 1
		*/
	private String calculateChange() {
		int dollars, quarters, dimes, nickles, pennies;

		dollars = change/100;
		quarters = (change%100)/25;
		dimes = ((change%100)%25)/10;
		nickles = (((change%100)%25)%10)/5;
		pennies = ((((change%100)%25)%10)%5);

		return "Dollars: " + dollars + "\n" +
				"Quarters: " + quarters + "\n" +
				"Dimes: " + dimes + "\n" +
				"Nickles: " + nickles + "\n" +
				"Pennies: " + pennies;
	}

	/**
	 * Clears the cash register for a new transaction
	 */
	public void clear() {
		amountDue = 0;
		amountReceived = 0;
		change = 0;
	}
}
