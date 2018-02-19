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
		System.out.println('\n');
		for(int i = 0; i < SIZE_OF_BOARD; i++) {
			for(int j = 0; j < SIZE_OF_BOARD; j++) {
				if(j == SIZE_OF_BOARD - 1) System.out.print(board[i][j]);
				else System.out.print(board[i][j] + " | " );
			}
			if(i != SIZE_OF_BOARD - 1) System.out.println("\n----------");
		}
	}

	/**
	 * Places a mark on the board and re-draws
	 * @param coordinates the coordinate to play
	 * @param mark the mark the board draws
	 */
	public void play(Coordinate coordinates, String mark) {
		board[coordinates.getRow()][coordinates.getColumn()] = mark;
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
