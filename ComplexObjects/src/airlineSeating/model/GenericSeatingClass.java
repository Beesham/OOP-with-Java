package airlineSeating.model;

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

	public Passenger getPassengerInSeat(Seat s) {
		return seats[s.getRow()][s.getColumn()];
	}
}
