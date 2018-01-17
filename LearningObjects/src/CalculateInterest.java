/**
 * Calculates the interest accumulated over 3 years on a
 * base sum
 * @author Beesham Sarendranauth 104854956
 * Date: 2018/01/17
 */
public class CalculateInterest {
	public static void main(String[] args) {
		final int INIT_BALANCE = 1000;
		final double INTEREST_RATE = 0.05; // 5% interest rate

		double newBalance = INIT_BALANCE;
		//Calculates and prints the balance after each year
		for(int i = 0; i < 3; i++) {
			newBalance = newBalance + (newBalance * INTEREST_RATE);
			System.out.println("Balance after " + (i+1)  + " years: $" + newBalance);
		}
	}
}
