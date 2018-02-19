package tickTackToe.model;

/*
	Player class that provides functions to interface with the board
 */
public class Player {
	private String playerMark;

	public Player(String playerMark) {
		this.playerMark = playerMark;
	}

	public String getPlayerMark() {
		return playerMark;
	}
}
