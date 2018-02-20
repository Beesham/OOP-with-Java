package test.airlineSeatingTest.seatingClassesTest;

import airlineSeating.model.EconomyClass;
import airlineSeating.model.Passenger;
import airlineSeating.model.Seat;
import airlineSeating.model.SeatingPreferences;

/**
 * Test EconomyClass
 * @author Beesham Sarendranauth
 */
public class EconomyClassTest {
	public static void main(String[] args) {
		EconomyClass economyClass = new EconomyClass(new Passenger[EconomyClass.MAX_ROWS_ECON][EconomyClass.MAX_COLS_ECON]);

		Passenger pW = new Passenger(economyClass, SeatingPreferences.WINDOW);
		Passenger pC = new Passenger(economyClass, SeatingPreferences.CENTER);
		Passenger pA = new Passenger(economyClass, SeatingPreferences.AISLE);

		try {
			Seat sW = economyClass.findMatch(pW);
			System.out.println("Window: " + sW.toString());

			Seat sC = economyClass.findMatch(pC);
			System.out.println("Center: " + sC.toString());

			Seat sA = economyClass.findMatch(pA);
			System.out.println("Aisle: " + sA.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}