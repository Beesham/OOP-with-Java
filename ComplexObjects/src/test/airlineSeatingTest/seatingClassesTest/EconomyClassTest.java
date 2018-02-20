package test.airlineSeatingTest.seatingClassesTest;

import airlineSeating.model.EconomyClass;
import airlineSeating.model.Passenger;
import airlineSeating.model.Seat;
import airlineSeating.model.SeatingPreferences;

import java.util.List;

/**
 * Test EconomyClass
 * @author Beesham Sarendranauth
 */
public class EconomyClassTest {
	public static void main(String[] args) {
		testMultiPassenger();
	}

	public static void testMultiPassenger() {
		EconomyClass economyClass = new EconomyClass(new Passenger[EconomyClass.MAX_ROWS_ECON][EconomyClass.MAX_COLS_ECON]);

		Passenger pW = new Passenger(economyClass, SeatingPreferences.WINDOW);
		Passenger pC = new Passenger(economyClass, SeatingPreferences.CENTER);
		Passenger pA = new Passenger(economyClass, SeatingPreferences.AISLE);

		economyClass.assignSeat(pW, new Seat(0,0));

		try {
			List<Seat> seatList = economyClass.findMatch(3);
			System.out.println(seatList.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void testSinglePassenger() {
		EconomyClass economyClass = new EconomyClass(new Passenger[EconomyClass.MAX_ROWS_ECON][EconomyClass.MAX_COLS_ECON]);

		Passenger pW = new Passenger(economyClass, SeatingPreferences.WINDOW);
		Passenger pW2 = new Passenger(economyClass, SeatingPreferences.WINDOW);
		Passenger pC = new Passenger(economyClass, SeatingPreferences.CENTER);
		Passenger pA = new Passenger(economyClass, SeatingPreferences.AISLE);

		try {
			Seat sW = economyClass.findMatch(pW);
			System.out.println("Window: " + sW.toString());
			economyClass.assignSeat(pW, sW);
			System.out.println("Passenger: " + economyClass.getPassengerInSeat(sW));

			Seat sW2 = economyClass.findMatch(pW2);
			System.out.println("Window: " + sW2.toString());
			System.out.println("Passenger: " + economyClass.getPassengerInSeat(sW2));

			Seat sC = economyClass.findMatch(pC);
			System.out.println("Center: " + sC.toString());

			Seat sA = economyClass.findMatch(pA);
			System.out.println("Aisle: " + sA.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
