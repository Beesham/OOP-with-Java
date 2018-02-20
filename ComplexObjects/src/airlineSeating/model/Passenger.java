package airlineSeating.model;

/**
 * Models a Passenger
 * @author Beesham Sarendranauth
 */
public class Passenger {
	private GenericSeatingClass seatingClass;
	private int assignedSeat;
	private String seatingPreference;

	public Passenger(GenericSeatingClass seatingClass, String seatingPreference) {
		this.seatingClass = seatingClass;
		this.seatingPreference = seatingPreference;
	}

	public void assignSeat(int assignedSeat) {
		this.assignedSeat = assignedSeat;
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
