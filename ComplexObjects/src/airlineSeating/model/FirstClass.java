package airlineSeating.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Models First class in an Airline
 * Has Window and Aisle seats
 * @author Beesham Sarendranauth
 */
public class FirstClass extends GenericSeatingClass{

	public static final String FIRST_CLASS_NAME = "first";
	public static final int MAX_SEATS_FIRST = 20;
	public static final int MAX_ROWS_FIRST = 5;
	public static final int MAX_COLS_FIRST = 4;
	public static final int AISLE_OFFSET = 1;

	public FirstClass(Passenger[][] seats) {
		super(seats);
	}

	@Override
	public Seat findMatch(Passenger p) throws Exception {
		Passenger seats[][] = getSeats();
		//Find seating for Window seats
		if(p.getSeatingPreference().equals(SeatingPreferences.WINDOW)) {
			for (int i = 0; i < MAX_ROWS_FIRST; i++) {
				if (seats[i][0] == null) {
					return new Seat(i, 0);
				}else if(seats[i][MAX_COLS_FIRST - 1] == null){
					return new Seat(i, MAX_COLS_FIRST - 1);
				}

				if(i == MAX_ROWS_FIRST - 1) {
					throw new Exception("No Seats Found!");
				}
			}

		//Find seating for Aisle seats
		}else if(p.getSeatingPreference().equals(SeatingPreferences.AISLE)) {
			for (int i = 0; i < MAX_ROWS_FIRST; i++) {
				if (seats[i][AISLE_OFFSET] == null) {
					return new Seat(i, AISLE_OFFSET);
				}else if(seats[i][MAX_COLS_FIRST - 1 - AISLE_OFFSET] == null){
					return new Seat(i, MAX_COLS_FIRST - 1 - AISLE_OFFSET);
				}

				if(i == MAX_ROWS_FIRST - 1) {
					throw new Exception("No Seats Found!");
				}
			}
		}

		return null;
	}

	/**
	 * Finds seating for multiple passengers
	 * @param numOfPassengers
	 * @return a list of seats
	 * @throws Exception No Seats Found
	 */
	public List<Seat> findMatch(int numOfPassengers) throws Exception {
		Passenger seats[][] = getSeats();
		List<Seat> seatList = new ArrayList<>();
		if (numOfPassengers == 2) {
			for (int i = 0; i < MAX_ROWS_FIRST; i++) {
				if (seats[i][0] == null &&
						seats[i][1] == null) {
					seatList.add(new Seat(i, 0));
					seatList.add(new Seat(i, 1));

					return seatList;
				} else if (seats[i][MAX_COLS_FIRST - 1] == null &&
						seats[i][MAX_COLS_FIRST - 2] == null) {
					seatList.add(new Seat(i, MAX_COLS_FIRST - 1));
					seatList.add(new Seat(i, MAX_COLS_FIRST - 2));

					return seatList;
				}

				if(i == MAX_ROWS_FIRST - 1) {
					throw new Exception("No Seats Found!");
				}
			}
		}
		return null;
	}
}
