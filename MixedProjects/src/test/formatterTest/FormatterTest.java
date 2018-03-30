package test.formatterTest;

import formatter.DefaultFormatter;

/**
 * @author Beesham Sarendranauth
 * Tests the different classes of formatter
 */
public class FormatterTest {
	public static void main(String[] args) {
		DefaultFormatter defaultFormatter = new DefaultFormatter();
		System.out.println("Expected: 5 Actual: " + defaultFormatter.format(5));
		System.out.println("Expected: 1,000 Actual: " + defaultFormatter.format(1000));
		System.out.println("Expected: 1,000,000 Actual: " + defaultFormatter.format(1000000));


	}
}
