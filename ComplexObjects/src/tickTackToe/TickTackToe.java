package tickTackToe;

import tickTackToe.model.Board;
import tickTackToe.model.Player;

public class TickTackToe {
	public static void main(String[] args) {

		Board board = new Board();
		Player playerX = new Player("X");
		Player playerO = new Player("O");
		Controller controller = new Controller(playerX, playerO, board);

		controller.startGame();

	}
}
