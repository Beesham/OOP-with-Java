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
	 * Assigns a seat to the passenger and the passenger to the seat
	 * @param p the passenger to assign to the seat
	 */
	public void assignSeat(Passenger p){
		Seat s = p.getAssignedSeat();
		seats[s.getRow()][s.getColumn()] = p;
	}

	/**
	 * Checks for a seat that mathces the passengers preference
	 * @param p the passenger to match a seat for
	 */
	public Passenger findMatch(Passenger p){
		return p;
	}

	public Passenger[][] getSeats() {
		return seats;
	}
}
