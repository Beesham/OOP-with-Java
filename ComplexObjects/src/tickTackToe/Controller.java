package tickTackToe;

import tickTackToe.model.Board;

/*
	Controls the flow of the game
 */
public class Controller {
	private static final int MAX_TURNS = 9;
	private static final int MAX_TURNS_X = 5;
	private static final int MAX_TURNS_O = 4;

	private int gameTurns;
	private int playerXTurns;
	private int playerOTurns;

	public Controller() {
		gameTurns = 0;
		playerXTurns = 0;
		playerOTurns = 0;
	}

	public int getGameTurns() {
		return gameTurns;
	}

	public void setGameTurns(int gameTurns) {
		this.gameTurns = gameTurns;
	}

	public int getPlayerXTurns() {
		return playerXTurns;
	}

	public void setPlayerXTurns(int playerXTurns) {
		this.playerXTurns = playerXTurns;
	}

	public int getPlayerOTurns() {
		return playerOTurns;
	}

	public void setPlayerOTurns(int playerOTurns) {
		this.playerOTurns = playerOTurns;
	}

	public void incrementPlayerXTurn() {
		playerXTurns++;
	}

	public void incrementPlayerOTurn() {
		playerOTurns++;
	}

	public void checkForWinner(Board board) {
		//TODO
	}
}
