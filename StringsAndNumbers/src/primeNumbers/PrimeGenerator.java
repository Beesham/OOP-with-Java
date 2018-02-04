package primeNumbers;

/**
 * This class generates all prime numbers.
 */
public class PrimeGenerator {
	private int current;

	public PrimeGenerator()
	{
		current = 1;
	}

	/**
	 Calculates the next prime number.
	 @return the next prime number
	 */
	public int nextPrime()
	{
		while(true) {
			if(isPrime(++current)) return current;
		}
	}

	/**
	 Check if n is a prime number.
	 @param n to check whether it is prime or not
	 @return true if n is prime
	 */
	public static boolean isPrime(int n)
	{
		// Complete this part
		return false;
	}
}
