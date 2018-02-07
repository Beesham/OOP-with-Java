package banking;

/**
 A bank account has a balance that can be changed by
 deposits and withdrawals.
 */
public class BankAccount
{
	private final static int MAX_FREE_TRANSACTIONS = 10;
	private double balance;
	private double fee;
	private int transactionCount;

	/**
	 Constructs a bank account with a zero balance.
	 */
	public BankAccount()
	{
		balance = 0;
		fee = 0.50;
		transactionCount = 0;
	}

	/**
	 Constructs a bank account with a given balance.
	 @param initialBalance the initial balance
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
		fee = 0.50;
		transactionCount = 0;
	}

	/**
	 Deposits money into the bank account.
	 @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		balance = balance + amount;
		transactionCount++;
	}

	/**
	 Withdraws money from the bank account.
	 @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		balance = balance - amount;
		transactionCount++;
	}

	/**
	 Gets the current balance of the bank account.
	 @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}

	private void chargeTransactionFee() {
		balance = balance - fee;
	}

	/**
	 * Charges transaction fees on a monthly basis
	 * and resets the transaction count
	 */
	public void deductMonthlyCharge() {
		if(transactionCount > MAX_FREE_TRANSACTIONS) {
			for(int i = 0; i < transactionCount; i++) {
				chargeTransactionFee();
			}
		}
		transactionCount = 0;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
}
