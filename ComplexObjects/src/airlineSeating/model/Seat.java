package airlineSeating.model;

/**
 * Models a seat (row, column)
 * @author Beesham Sarendranauth
 */
public class Seat {
	private int row;
	private int column;

	public Seat(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	@Override
	public String toString() {
		return "Seat{" +
				"row=" + row +
				", column=" + column +
				'}';
	}
}
