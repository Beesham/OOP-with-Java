package csvReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Beesham Sarendranauth
 * Reads a csv file
 */
public class CSVReader {

	/*
		The csv file to read
	 */
	private File file;

	private Scanner in;

	public CSVReader(String file) {
		this.file = new File(file);
	}

	/**
	 * Counts the number of lines in the CSV file
	 * @return the number of lines
	 */
	public int numberOfRows() {
		int rowCount = 0;

		try {
			in = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while(in.hasNextLine()) {
			rowCount++;
			in.nextLine();
		}

		in.close();
		return rowCount;
	}

	/**
	 * Counts the number of fields in a particular row
	 * @param row the row to count
	 * @return the number of fields
	 */
	public int numberOfFields(int row) {
		String line = null;
		try {
			in = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < row; i++) {
			if(in.hasNextLine())
				line = in.nextLine();
		}

		in.close();
		return (line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)", -1)).length;
	}

	/**
	 * Reads the field in a particular row and column
	 * @param row row to read
	 * @param column the column to read
	 * @return the content of the field read
	 */
	public String field(int row, int column) {
		String line = null;
		try {
			in = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int i = 0; i <= row; i++) {
			if(in.hasNextLine())
				line = in.nextLine();
		}

		in.close();

		String[] s = (line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)", -1));
		return s[column];
	}
}
