package formatter;

/**
 * @author Beesham Sarendranauth
 * Formats a number for use in accounting, eg. -10 --> (10)
 */
public class AccountingFormatter implements NumberFormatter {
	@Override
	public String format(int n) {
		if(n < 0) return "(" + Math.abs(n) + ")";
		else return Integer.toString(n);
	}
}
