package test.formatterTest;

import formatter.AccountingFormatter;
import formatter.BaseFormatter;
import formatter.DecimalSeparatorFormatter;
import formatter.DefaultFormatter;

import java.io.*;
import java.util.Scanner;

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

		AccountingFormatter accountingFormatter = new AccountingFormatter();
		System.out.println("Expected: (5) Actual: " + accountingFormatter.format(-5));

		BaseFormatter baseFormatter = new BaseFormatter(2);
		System.out.println("Expected: 101 Actual: " + baseFormatter.format(5));
		System.out.println("Expected: -101 Actual: " + baseFormatter.format(-5));

		try {
			File inFile = new File("Numbers.txt");
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("FormattedNumbers.txt", true)));
			Scanner in = new Scanner(inFile);
			while (in.hasNextInt()) {
				String s = baseFormatter.format(in.nextInt());
				out.append(s + " ");
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
