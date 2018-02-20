package airlineSeating.model;

/**
 * Models a Passenger
 * @author Beesham Sarendranauth
 */
public class Passenger {
	private GenericSeatingClass seatingClass;
	private int assignedSeat;
	private String seatingPreference;

	public Passenger(GenericSeatingClass seatingClass, int assignedSeat, String seatingPreference) {
		this.seatingClass = seatingClass;
		this.assignedSeat = assignedSeat;
		this.seatingPreference = seatingPreference;
	}

	public GenericSeatingClass getSeatingClass() {
		return seatingClass;
	}

	public int getAssignedSeat() {
		return assignedSeat;
	}

	public String getSeatingPreference() {
		return seatingPreference;
	}
}
