package terrain;

/**
 * Models a terrain with high points and low
 * @author Beesham Sarendranauth
 */
public class Terrain {
	private int terrainHeights[][];
	private int sizeOfSquare;

	public Terrain(int sizeOfSquare) {
		terrainHeights = new int[sizeOfSquare][sizeOfSquare];
		this.sizeOfSquare = sizeOfSquare;
	}

	/**
	 * Read the heights of the terrain
	 */
	public void readHeightsOfTerrain() {
		//TODO
	}

	/**
	 * Finds the lowest point in the terrain
	 * @return the lowest point
	 */
	public int getLowestPoint() {
		//TODO
		return 0;
	}

	/**
	 * Finds the highest point in the terrain
	 * @return the highest point
	 */
	public int getHeighestPoint() {
		//TODO
		return 0;
	}

	/**
	 * Prints a map showing the flooded regions given a threshold
	 * @param threshold the flood point
	 */
	public void printFloodMap(int threshold) {
		//TODO
	}
}
