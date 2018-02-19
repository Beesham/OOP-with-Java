package tickTackToe.model;

/*
	Player class that provides functions to interface with the board
 */
public class Player {
	String playerMark;
	Board board;

	public Player(String playerMark, Board board) {
		this.playerMark = playerMark;
		this.board = board;
	}

	/**
	 * Plays on the board at a provided coordinate
	 * @param coordinates the coordinate the player plays
	 */
	public void play(Coordinates coordinates) {
		board.play(coordinates, playerMark);
	}
}
