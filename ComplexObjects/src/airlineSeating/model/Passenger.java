package airlineSeating.model;

/**
 * Models a Passenger
 * @author Beesham Sarendranauth
 */
public class Passenger {
	private GenericSeatingClass seatingClass;
	private Seat assignedSeat;
	private String seatingPreference;

	public Passenger(GenericSeatingClass seatingClass, String seatingPreference) {
		this.seatingClass = seatingClass;
		this.seatingPreference = seatingPreference;
	}

	public void assignSeat(Seat assignedSeat) {
		this.assignedSeat = assignedSeat;
	}

	public GenericSeatingClass getSeatingClass() {
		return seatingClass;
	}

	public Seat getAssignedSeat() {
		return assignedSeat;
	}

	public String getSeatingPreference() {
		return seatingPreference;
	}

	@Override
	public String toString() {
		return "Passenger{" +
				"assignedSeat=" + assignedSeat +
				", seatingPreference='" + seatingPreference + '\'' +
				'}';
	}
}
