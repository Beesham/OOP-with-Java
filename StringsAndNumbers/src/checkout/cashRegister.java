package checkout;

public class cashRegister {
	private double amountDue;
	private double amountRecieved;

	public cashRegister() {
		amountDue = 0;
		amountRecieved = 0;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

	public double getAmountRecieved() {
		return amountRecieved;
	}

	public void setAmountRecieved(double amountRecieved) {
		this.amountRecieved = amountRecieved;
	}

	/**
	 * Displays the change due
	 */
	public void printChange() {
		double change = amountRecieved - amountDue;
		if(change< 0) {
			System.out.println("We need more money");
		} else if(change == 0){
			System.out.println("No Change required");
		} else {
			System.out.println(calculateChange());
		}
	}

	private String calculateChange() {
		

		return null;
	}
}
