package tickTackToe.model;

/**
 * Player class that provides functions to interface with the board
 * @author Beesham Sarendranauth
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
