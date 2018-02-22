package airlineSeating.model;

import java.util.List;

/**
 * Generic seating class that has common functions
 * @author Beesham Sarendranauth
 */
public class GenericSeatingClass {

	private Passenger seats[][];

	public GenericSeatingClass() {
		this.seats = new Passenger[5][5];
	}

	public GenericSeatingClass(Passenger[][] seats) {
		this.seats = seats;
	}

	/**
	 * Assigns a seat to the passenger and passenger to seat
	 * @param p the passenger to assign to the seat
	 */
	public void assignSeat(Passenger p, Seat s){
		p.assignSeat(s);
		seats[s.getRow()][s.getColumn()] = p;
	}

	/**
	 * Assigns a group of passengers seats next to each other
	 * @param passengerList
	 * @param seatList
	 */
	public void assignMultiSeats(List<Passenger> passengerList, List<Seat> seatList) {
		for(int i = 0; i < passengerList.size(); i++) {
			assignSeat(passengerList.get(i), seatList.get(i));
		}
	}

	/**
	 * Checks for a seat that mathces the passengers preference
	 * @param p the passenger to match a seat for
	 * @return the seat found
	 */
	public Seat findMatch(Passenger p) throws Exception{
		return null;
	}

	public Passenger[][] getSeats() {
		return seats;
	}

	/**
	 * Gets the passenger that's asssigned to the seat
	 * @param s the seat
	 * @return the passenger
	 */
	public Passenger getPassengerInSeat(Seat s) {
		return seats[s.getRow()][s.getColumn()];
	}
}
