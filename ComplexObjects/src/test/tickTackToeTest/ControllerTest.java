package test.tickTackToeTest;

import tickTackToe.Controller;
import tickTackToe.model.Board;
import tickTackToe.model.Coordinate;
import tickTackToe.model.Player;

public class ControllerTest {
	public static void main(String[] args) {
		Player playerX = new Player("X");
		Player playerO = new Player("O");

		Board board = new Board();
		board.play(new Coordinate(0,0), "X");
		board.play(new Coordinate(0,1), "X");
		board.play(new Coordinate(0,2), "X");

		Controller controller = new Controller(playerX, playerO, board);
		System.out.println("Expected: true, Actual: " + controller.checkForWinner(playerX));

		board = new Board();
		board.play(new Coordinate(0,0), "X");
		board.play(new Coordinate(1,0), "X");
		board.play(new Coordinate(2,0), "X");

		Controller controller2 = new Controller(playerX, playerO, board);
		System.out.println("Expected: true, Actual: " + controller2.checkForWinner(playerX));

		board = new Board();
		board.play(new Coordinate(0,0), "X");
		board.play(new Coordinate(1,1), "X");
		board.play(new Coordinate(2,2), "X");

		Controller controller3 = new Controller(playerX, playerO, board);
		System.out.println("Expected: true, Actual: " + controller3.checkForWinner(playerX));

		board = new Board();
		board.play(new Coordinate(0,0), "X");
		board.play(new Coordinate(1,0), "X");
		board.play(new Coordinate(2,2), "X");

		Controller controller4 = new Controller(playerX, playerO, board);
		System.out.println("Expected: false, Actual: " + controller4.checkForWinner(playerX));

	}
}
