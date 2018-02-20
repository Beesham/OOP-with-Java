package terrain;

import java.util.Scanner;

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
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < sizeOfSquare; i++) {
			for(int j = 0; j < sizeOfSquare; j++) {
				System.out.println("Height of terrain at " + i + "," + j + " : ");
				terrainHeights[i][j] = in.nextInt();
			}
		}
	}

	/**
	 * Finds the lowest point in the terrain
	 * @return the lowest point
	 */
	public int getLowestPoint() {
		int lowestPoint = Integer.MAX_VALUE;
		for(int i = 0; i < sizeOfSquare; i++) {
			for(int j = 0; j < sizeOfSquare; j++) {
				System.out.println("Height of terrain at " + i + "," + j + " : ");
				if(terrainHeights[i][j] < lowestPoint) {
					lowestPoint = terrainHeights[i][j];
				}
			}
		}
		return lowestPoint;
	}

	/**
	 * Finds the highest point in the terrain
	 * @return the highest point
	 */
	public int getHeighestPoint() {
		int highestPoint = Integer.MIN_VALUE;
		for(int i = 0; i < sizeOfSquare; i++) {
			for(int j = 0; j < sizeOfSquare; j++) {
				System.out.println("Height of terrain at " + i + "," + j + " : ");
				if(terrainHeights[i][j] > highestPoint) {
					highestPoint = terrainHeights[i][j];
				}
			}
		}
		return highestPoint;
	}

	/**
	 * Prints a map showing the flooded regions given a threshold
	 * @param threshold the flood point
	 */
	public void printFloodMap(int threshold) {
		//TODO
	}
}
