package test.airlineSeatingTest.seatingClassesTest;

import airlineSeating.model.EconomyClass;
import airlineSeating.model.Passenger;
import airlineSeating.model.Seat;
import airlineSeating.model.SeatingPreferences;

import java.util.ArrayList;
import java.util.List;

/**
 * Test EconomyClass
 * @author Beesham Sarendranauth
 */
public class EconomyClassTest {
	public static void main(String[] args) {
		testMultiPassenger();
		testSinglePassenger();
	}

	public static void testMultiPassenger() {
		EconomyClass economyClass = new EconomyClass(new Passenger[EconomyClass.MAX_ROWS_ECON][EconomyClass.MAX_COLS_ECON]);
		String seatingClass = EconomyClass.ECONOMY_CLASS_NAME;

		Passenger pW = new Passenger(seatingClass, SeatingPreferences.WINDOW);
		Passenger pC = new Passenger(seatingClass, SeatingPreferences.CENTER);
		Passenger pA = new Passenger(seatingClass, SeatingPreferences.AISLE);

		economyClass.assignSeat(pW, new Seat(0,0));

		List<Passenger> passengerList = new ArrayList<>();
		passengerList.add(pW);
		passengerList.add(pC);
		passengerList.add(pA);

		try {
			List<Seat> seatList = economyClass.findMatch(3, passengerList);
			System.out.println(seatList.toString());
			economyClass.assignMultiSeats(passengerList, seatList);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void testSinglePassenger() {
		EconomyClass economyClass = new EconomyClass(new Passenger[EconomyClass.MAX_ROWS_ECON][EconomyClass.MAX_COLS_ECON]);
		String seatingClass = EconomyClass.ECONOMY_CLASS_NAME;

		Passenger pW = new Passenger(seatingClass, SeatingPreferences.WINDOW);
		Passenger pW2 = new Passenger(seatingClass, SeatingPreferences.WINDOW);
		Passenger pC = new Passenger(seatingClass, SeatingPreferences.CENTER);
		Passenger pA = new Passenger(seatingClass, SeatingPreferences.AISLE);

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
