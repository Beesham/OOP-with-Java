package test.terrainTest;

import terrain.Terrain;

/**
 * Test Terrain.class and its functions
 * @author Beesham Sarendranauth
 */
public class TerrainTest {
	public static void main(String[] args) {
		int sizeOfTerrain = 4;
		int floodThreshold = 3;
		Terrain terrain = new Terrain(sizeOfTerrain);
		terrain.readHeightsOfTerrain();
		terrain.getHeighestPoint();
		terrain.getLowestPoint();
		terrain.printFloodMap(floodThreshold);
	}
}
