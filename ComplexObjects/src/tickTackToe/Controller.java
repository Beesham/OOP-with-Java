package tickTackToe;

import tickTackToe.model.Board;
import tickTackToe.model.Coordinate;
import tickTackToe.model.Player;

import java.util.Scanner;

/*
	Controls the flow of the game
 */
public class Controller {
	public static final int MAX_GAME_TURNS = 5;
	private static final int MAX_TURNS_X = 5;
	private static final int MAX_TURNS_O = 4;
	private static final int TURNS_FOR_VALID_WINNER = 3;

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

	public Player checkForWinner() throws Exception {
		//TODO
		return playerX;
	}

	public Coordinate promptForCoordinates(Player player) {
		Scanner in = new Scanner(System.in);
		System.out.printf("What is your move player" + player.getPlayerMark() + " (row[space]column): ");
		int row = in.nextInt();
		int column = in.nextInt();
		return new Coordinate(row, column);
	}

	/**
	 * Starts the game of tick tack toe and handles turns
	 */
	public void startGame() {
		for(int i = 0; i < MAX_GAME_TURNS; i++) {

			board.play(promptForCoordinates(playerX), playerX.getPlayerMark());
			incrementPlayerXTurn();

			board.play(promptForCoordinates(playerO), playerO.getPlayerMark());
			incrementPlayerOTurn();

			if(i > TURNS_FOR_VALID_WINNER) {
				try {
					if(checkForWinner() != null) endGame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void endGame() {
		//TODO
	}
}
