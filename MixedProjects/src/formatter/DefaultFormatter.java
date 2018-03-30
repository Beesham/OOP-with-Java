package formatter;

/**
 * @author Beesham Sarendranauth
 * Formats a number with default everyday way
 */
public class DefaultFormatter implements NumberFormatter {
	@Override
	public String format(int n) {
		return Integer.toString(n);
	}
}
