package tickTackToe.model;

/**
 * 	Models an row,column coordinate system
 *	@author Beesham Sarendranauth
 */
public class Coordinate {
	private int row;
	private int column;

	public Coordinate(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
}
