package tickTackToe.model;

/*
	Player class that provides functions to interface with the board
 */
public class Player {
	String playerName;
	Board board;

	public Player(String playerName, Board board) {
		this.playerName = playerName;
		this.board = board;
	}

	/**
	 * Plays on the board at a provided coordinate
	 * @param row
	 * @param column
	 */
	public void play(int row, int column) {
		//TODO
	}
}
