package test.airlineSeatingTest.seatingClassesTest;

import airlineSeating.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Test FirstClass class
 * @author Beesham Sarendranauth
 */
public class FirstClassTest {
	public static void main(String[] args) {
		testMultiPassenger();
		testSinglePassenger();
	}

	public static void testMultiPassenger() {
		FirstClass firstClass = new FirstClass(new Passenger[FirstClass.MAX_ROWS_FIRST][FirstClass.MAX_COLS_FIRST]);
		String seatingClass = FirstClass.FIRST_CLASS_NAME;

		Passenger pW = new Passenger(seatingClass, SeatingPreferences.WINDOW);
		Passenger pA = new Passenger(seatingClass, SeatingPreferences.AISLE);

		firstClass.assignSeat(pW, new Seat(0,0));

		List<Passenger> passengerList = new ArrayList<>();
		passengerList.add(pW);
		passengerList.add(pA);

		try {
			List<Seat> seatList = firstClass.findMatch(2);
			System.out.println(seatList.toString());
			firstClass.assignMultiSeats(passengerList, seatList);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void testSinglePassenger() {
		FirstClass firstClass = new FirstClass(new Passenger[FirstClass.MAX_ROWS_FIRST][FirstClass.MAX_COLS_FIRST]);
		String seatingClass = FirstClass.FIRST_CLASS_NAME;

		Passenger pW = new Passenger(seatingClass, SeatingPreferences.WINDOW);
		Passenger pW2 = new Passenger(seatingClass, SeatingPreferences.WINDOW);
		Passenger pC = new Passenger(seatingClass, SeatingPreferences.CENTER);
		Passenger pA = new Passenger(seatingClass, SeatingPreferences.AISLE);

		try {
			Seat sW = firstClass.findMatch(pW);
			System.out.println("Window: " + sW.toString());
			firstClass.assignSeat(pW, sW);
			System.out.println("Passenger: " + firstClass.getPassengerInSeat(sW));

			Seat sW2 = firstClass.findMatch(pW2);
			System.out.println("Window: " + sW2.toString());
			System.out.println("Passenger: " + firstClass.getPassengerInSeat(sW2));

			Seat sC = firstClass.findMatch(pC);
			System.out.println("Center: " + sC.toString());

			Seat sA = firstClass.findMatch(pA);
			System.out.println("Aisle: " + sA.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
