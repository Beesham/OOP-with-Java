package airlineSeating.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Models Economy class for an airline
 * Has window seats and aisle, center seats too
 * @author Beesham Sarendranauth
 */
public class EconomyClass extends GenericSeatingClass {

	public static final String ECONOMY_CLASS_NAME = "economy";
	public static final int MAX_SEATS_ECON = 90;
	public static final int MAX_ROWS_ECON = 15;
	public static final int MAX_COLS_ECON = 6;
	public static final int AISLE_OFFSET = 2;
	public static final int CENTER_OFFSET = 1;


	public EconomyClass(Passenger[][] seats) {
		super(seats);
	}

	@Override
	public Seat findMatch(Passenger p) throws Exception{
		Passenger seats[][] = getSeats();
		//Finds seats that are Window seats
		if(p.getSeatingPreference().equals(SeatingPreferences.WINDOW)) {
			for (int i = 0; i < MAX_ROWS_ECON; i++) {
				if (seats[i][0] == null) {
					return new Seat(i, 0);
				}else if(seats[i][MAX_COLS_ECON - 1] == null){
					return new Seat(i, MAX_COLS_ECON - 1);
				}

				if(i == MAX_ROWS_ECON - 1) {
					throw new Exception("No Seats Found!");
				}
			}

		//Finds seats that are Aisle seats
		}else if(p.getSeatingPreference().equals(SeatingPreferences.AISLE)) {
			for (int i = 0; i < MAX_ROWS_ECON; i++) {
				if (seats[i][AISLE_OFFSET] == null) {
					return new Seat(i, AISLE_OFFSET);
				}else if(seats[i][MAX_COLS_ECON - 1 - AISLE_OFFSET] == null){
					return new Seat(i, MAX_COLS_ECON - 1 - AISLE_OFFSET);
				}

				if(i == MAX_ROWS_ECON - 1) {
					throw new Exception("No Seats Found!");
				}
			}

		//Finds seats that are Center seats
		}else if(p.getSeatingPreference().equals(SeatingPreferences.CENTER)) {
			for (int i = 0; i < MAX_ROWS_ECON; i++) {
				if (seats[i][CENTER_OFFSET] == null) {
					return new Seat(i, CENTER_OFFSET);
				}else if(seats[i][MAX_COLS_ECON - 1 - CENTER_OFFSET] == null){
					return new Seat(i, MAX_COLS_ECON - 1 -CENTER_OFFSET);
				}

				if(i == MAX_ROWS_ECON - 1) {
					throw new Exception("No Seats Found!");
				}
			}
		}

		return null;
	}

	/**
	 * Finds seating for a list of passengers
	 * @param numOfPassengers
	 * @param passengerList
	 * @return
	 * @throws Exception
	 */
	public List<Seat> findMatch(int numOfPassengers, List<Passenger> passengerList) throws Exception{
		Passenger seats[][] = getSeats();
		List<Seat> seatList = new ArrayList<>();
		//Finds seating for 3 passengers
		if(numOfPassengers == 3) {
			for (int i = 0; i < MAX_ROWS_ECON; i++) {
				if (seats[i][0] == null &&
						seats[i][1] == null &&
						seats[i][2] == null) {
					seatList.add(new Seat(i, 0));
					seatList.add(new Seat(i, 1));
					seatList.add(new Seat(i, 2));

					return seatList;
				} else if (seats[i][MAX_COLS_ECON - 1] == null &&
						seats[i][MAX_COLS_ECON - 2] == null &&
						seats[i][MAX_COLS_ECON - 3] == null) {
					seatList.add(new Seat(i, MAX_COLS_ECON - 1));
					seatList.add(new Seat(i, MAX_COLS_ECON - 2));
					seatList.add(new Seat(i, MAX_COLS_ECON - 3));

					return seatList;
				}

				if(i == MAX_ROWS_ECON - 1) {
					throw new Exception("No Seats Found!");
				}
			}
		}else if(numOfPassengers == 2) {
			boolean noOneWantsWindow = false;
			if(!passengerList.get(0).getSeatingPreference().equals(SeatingPreferences.WINDOW) &&
					!passengerList.get(0).getSeatingPreference().equals(SeatingPreferences.WINDOW)) {
				noOneWantsWindow = true;
			}
			//Finds seating for passengers who don't want to sit near a window
			if(noOneWantsWindow) {
				for (int i = 0; i < MAX_ROWS_ECON; i++) {
					if (seats[i][1] == null &&
							seats[i][2] == null) {
						seatList.add(new Seat(i, 1));
						seatList.add(new Seat(i, 2));

						return seatList;
					} else if (seats[i][MAX_COLS_ECON - 2] == null &&
							seats[i][MAX_COLS_ECON - 3] == null) {
						seatList.add(new Seat(i, MAX_COLS_ECON - 2));
						seatList.add(new Seat(i, MAX_COLS_ECON - 3));

						return seatList;
					}

					if(i == MAX_ROWS_ECON - 1) {
						throw new Exception("No Seats Found!");
					}
				}
			}else {
				for (int i = 0; i < MAX_ROWS_ECON; i++) {
					if (seats[i][0] == null &&
							seats[i][1] == null) {
						seatList.add(new Seat(i, 0));
						seatList.add(new Seat(i, 1));

						return seatList;
					} else if (seats[i][MAX_COLS_ECON - 1] == null &&
							seats[i][MAX_COLS_ECON - 2] == null) {
						seatList.add(new Seat(i, MAX_COLS_ECON - 1));
						seatList.add(new Seat(i, MAX_COLS_ECON - 2));

						return seatList;
					}

					if(i == MAX_ROWS_ECON - 1) {
						throw new Exception("No Seats Found!");
					}
				}
			}
		}

		return null;
	}
}
