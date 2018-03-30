package formatter;

import java.text.DecimalFormat;

/**
 * @author Beesham Sarendranauth
 * Formats a number using commas every 3 digits
 */
public class DecimalSeparatorFormatter implements NumberFormatter {
	@Override
	public String format(int n) {
		DecimalFormat formatter = new DecimalFormat("#,###");
		return formatter.format(n);
	}
}
