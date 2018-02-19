package tickTackToe.model;

import java.util.Arrays;

/*
	Models a tick tack toe game board
 */
public class Board {
	public static final int SIZE_OF_BOARD = 3;
	private String board[][];

	public Board() {
		board = new String[SIZE_OF_BOARD][SIZE_OF_BOARD];
		initBoard();
	}

	/**
	 * Draws the game board.
	 */
	public void drawBoard() {
		//TODO
	}

	/**
	 * Places a mark on the board and re-draws
	 * @param coordinates the coordinate to play
	 * @param mark the mark the board draws
	 */
	public void play(Coordinate coordinates, String mark) {
		//TODO
	}

	public String[][] getBoard() {
		return board;
	}

	private void initBoard() {
		for(String row[]: board) {
			Arrays.fill(row, "-");
		}
	}
}
