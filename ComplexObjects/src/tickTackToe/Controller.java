package tickTackToe;

import tickTackToe.model.Board;
import tickTackToe.model.Coordinate;
import tickTackToe.model.Player;

import java.util.Scanner;

/**
 *  Controls the flow of the game tick tack toe
 *  @author Beesham Sarendranauth
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

	public boolean checkForWinner(Player player) {
		final String boardCpy[][] = board.getBoard();
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

	/**
	 * Prompts player for coordinates to play
	 * @param player
	 * @return a coordinate object containing the chosen co-ords
	 */
	public Coordinate promptForCoordinates(Player player) {
		Scanner in = new Scanner(System.in);
		System.out.print("\nWhat is your move player" + player.getPlayerMark() + " (row column): ");
		int row = in.nextInt();
		int column = in.nextInt();
		return new Coordinate(row, column);
	}

	/**
	 * Starts the game of tick tack toe and handles turns
	 */
	public void startGame() {
		board.drawBoard();

		//Handles turns
		for(int i = 0; i < MAX_GAME_TURNS; i++) {
			//Check if the co-ords was already played
			while(!board.play(promptForCoordinates(playerX), playerX.getPlayerMark())) {
				System.out.println("Someone already played there!");
			}
			board.drawBoard();
			incrementPlayerXTurn();

			//Check for winnner
			if(checkForWinner(playerX)) {
				endGame(playerX);
				return;
			}else if(playerXTurns == MAX_TURNS_X) {
				endGame();
				return;
			}

			while(!board.play(promptForCoordinates(playerO), playerO.getPlayerMark())) {
				System.out.println("Someone already played there!");
			}
			board.drawBoard();
			incrementPlayerOTurn();

			if(checkForWinner(playerO)) {
				endGame(playerO);
				return;
			}
		}
	}

	private void endGame(Player player) {
		System.out.println("\nPlayer" + player.getPlayerMark() + " won!");
	}

	private void endGame() {
		System.out.println("\nDraw!");
	}

}
