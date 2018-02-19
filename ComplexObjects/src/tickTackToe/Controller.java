package tickTackToe;

import tickTackToe.model.Board;
import tickTackToe.model.Player;

/*
	Controls the flow of the game
 */
public class Controller {
	public static final int MAX_GAME_TURNS = 5;
	private static final int MAX_TURNS_X = 5;
	private static final int MAX_TURNS_O = 4;

	private int gameTurns;
	private int playerXTurns;
	private int playerOTurns;

	private Player playerX;
	private Player playerO;
	private Board board;


	public Controller(Player playerX, Player playerO, Board board) {
		gameTurns = 0;
		playerXTurns = 0;
		playerOTurns = 0;

		this.playerX = playerX;
		this.playerO = playerO;
		this.board = board;
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

	/**
	 * Starts the game of tick tack toe and handles turns
	 */
	public void startGame() {
		for(int i = 0; i < MAX_GAME_TURNS; i++) {

		}
	}

	private void endGame() {
		//TODO
	}
}
