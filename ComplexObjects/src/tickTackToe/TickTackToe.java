package tickTackToe;

import tickTackToe.model.Board;
import tickTackToe.model.Player;

/**
 * Starts a game of tick tack toe
 * @author Beesham Sarendranauth
 * Date: 2018/02/23
 */
public class TickTackToe {
	public static void main(String[] args) {

		Board board = new Board();
		Player playerX = new Player("X");
		Player playerO = new Player("O");
		Controller controller = new Controller(playerX, playerO, board);

		controller.startGame();
	}
}
