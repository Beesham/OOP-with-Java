package test.formatterTest;

import formatter.DecimalSeparatorFormatter;
import formatter.DefaultFormatter;

/**
 * @author Beesham Sarendranauth
 * Tests the different classes of formatter
 */
public class FormatterTest {
	public static void main(String[] args) {
		DecimalSeparatorFormatter decimalSeparatorFormatter = new DecimalSeparatorFormatter();
		System.out.println("Expected: 5 Actual: " + decimalSeparatorFormatter.format(5));
		System.out.println("Expected: 1,000 Actual: " + decimalSeparatorFormatter.format(1000));
		System.out.println("Expected: 1,000,000 Actual: " + decimalSeparatorFormatter.format(1000000));


	}
}
