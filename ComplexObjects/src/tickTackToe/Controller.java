package tickTackToe;

import tickTackToe.model.Board;
import tickTackToe.model.Coordinate;
import tickTackToe.model.Player;

import java.util.Arrays;
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

	public boolean checkForWinner(Player player) {
		String boardCpy[][] = Arrays.copyOf(board.getBoard(), board.getBoard().length*3);
		int markCount = 0;

		//Checks rows for winner
		for(int i = 0; i < Board.SIZE_OF_BOARD; i++) {
			for (int j = 0; j < Board.SIZE_OF_BOARD; j++) {
				if (boardCpy[i][j].equals(player.getPlayerMark())) {
					markCount++;
				}
				if (j == Board.SIZE_OF_BOARD - 1 && markCount != 3) {
					markCount = 0;
				}
				if (markCount == 3) {
					return true;
				}
			}
		}

		//Checks columns for winner
		for(int i = 0; i < Board.SIZE_OF_BOARD; i++) {
			for (int j = 0; j < Board.SIZE_OF_BOARD; j++) {
				if (boardCpy[j][i].equals(player.getPlayerMark())) {
					markCount++;
				}
				if (j == Board.SIZE_OF_BOARD - 1 && markCount != 3) {
					markCount = 0;
				}
				if (markCount == 3) {
					return true;
				}
			}
		}

		//Checks diagonal for winner
		if(boardCpy[0][0].equals(player.getPlayerMark()) &&
				boardCpy[1][1].equals(player.getPlayerMark()) &&
				boardCpy[2][2].equals(player.getPlayerMark())) {
			return true;
		}

		return false;
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
		board.drawBoard();
		for(int i = 0; i < MAX_GAME_TURNS; i++) {
			board.play(promptForCoordinates(playerX), playerX.getPlayerMark());
			board.drawBoard();
			incrementPlayerXTurn();

			board.play(promptForCoordinates(playerO), playerO.getPlayerMark());
			board.drawBoard();
			incrementPlayerOTurn();

			if(i > TURNS_FOR_VALID_WINNER) {
				if(checkForWinner(playerX)) endGame(playerX);
				if(checkForWinner(playerO)) endGame(playerO);
			}
		}
	}

	private void endGame(Player player) {
		System.out.println("Player" + player.getPlayerMark() + "won!");
	}
}
