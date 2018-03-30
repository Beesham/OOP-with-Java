package formatter;

/**
 * @author Beesham Sarendranauth
 * Formats a number by base eg.base 2 or octal
 */
public class BaseFormatter implements NumberFormatter {

	/*
		The base to convert input number to
	 */
	int base;

	public BaseFormatter(int base) {
		this.base = base;
	}

	@Override
	public String format(int n) {
		return Integer.toString(n, base);
	}
}
