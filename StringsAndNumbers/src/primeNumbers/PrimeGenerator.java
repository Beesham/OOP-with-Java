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
		if(n < 1) return false;	//Any number < 1 is not a prime
		if(n%2 == 0) return false;	//Any number that has a factor of 2 is not prime

		//Checks if 3 to n is a factor of n
		for(int i = 3; i <= n; i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
}
