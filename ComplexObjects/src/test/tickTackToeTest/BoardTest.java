package test.tickTackToeTest;

import tickTackToe.model.Board;
import tickTackToe.model.Coordinate;

/**
 * Test Board.class for proper played positions
 * @author Beesham Sarendranauth
 */
public class BoardTest {
	public static void main(String[] args) {
		Board board = new Board();
		System.out.print("Expected: blank board, Actual: ");
		board.drawBoard();
		System.out.println("");

		board.play(new Coordinate(0,0), "X");
		board.play(new Coordinate(2,2), "O");

		System.out.print("\nExpected: X in top right, O in bottom left, Actual: ");
		board.drawBoard();

		System.out.println("\nExpected: false, Actual: " + board.play(
				new Coordinate(0,0), "X"));
	}
}
