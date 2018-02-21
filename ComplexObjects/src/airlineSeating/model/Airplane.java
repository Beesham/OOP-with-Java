package airlineSeating.model;

import java.util.List;

/**
 * Models the seating in an Airline
 * @author Beesham Sarendranauth
 */
public class Airplane {
	private EconomyClass economyClass;
	private FirstClass firstClass;

	public Airplane() {
		economyClass = new EconomyClass(new Passenger[EconomyClass.MAX_ROWS_ECON][EconomyClass.MAX_COLS_ECON]);
		firstClass = new FirstClass(new Passenger[FirstClass.MAX_ROWS_FIRST][FirstClass.MAX_COLS_FIRST]);
	}

	public EconomyClass getEconomyClass() {
		return economyClass;
	}

	public FirstClass getFirstClass() {
		return firstClass;
	}

	public void addPassenger(List<Passenger> passengerList, String seatingClass, int numOfPassengers) throws Exception {
		if (seatingClass.equals(EconomyClass.ECONOMY_CLASS_NAME)) {
			if (numOfPassengers == 1) {
				Seat s = null;
				s = economyClass.findMatch(passengerList.get(0));
				economyClass.assignSeat(passengerList.get(0), s);
			} else if (numOfPassengers > 1) {
				economyClass.assignMultiSeats(passengerList, economyClass.findMatch(numOfPassengers, passengerList));
			}
		}else if(seatingClass.equals(FirstClass.FIRST_CLASS_NAME)) {
			if (numOfPassengers == 1) {
				Seat s = null;
				s = firstClass.findMatch(passengerList.get(0));
				firstClass.assignSeat(passengerList.get(0), s);
			} else if (numOfPassengers > 1) {
				firstClass.assignMultiSeats(passengerList, firstClass.findMatch(numOfPassengers));
			}
		}
	}

}
