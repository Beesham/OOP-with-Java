package airlineSeating.model;

/**
 * Models a Passenger
 * @author Beesham Sarendranauth
 */
public class Passenger {
	private GenericSeatingClass seatingClass;
	private int assignedSeat;

	public Passenger(GenericSeatingClass seatingClass, int assignedSeat) {
		this.seatingClass = seatingClass;
		this.assignedSeat = assignedSeat;
	}

	public GenericSeatingClass getSeatingClass() {
		return seatingClass;
	}

	public int getAssignedSeat() {
		return assignedSeat;
	}
}
