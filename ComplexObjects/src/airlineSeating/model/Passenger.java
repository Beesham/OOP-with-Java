package airlineSeating.model;

/**
 * Models a Passenger
 * @author Beesham Sarendranauth
 */
public class Passenger {
	private String seatingClass;
	private Seat assignedSeat;
	private String seatingPreference;

	public Passenger(String seatingClass, String seatingPreference) {
		this.seatingClass = seatingClass;
		this.seatingPreference = seatingPreference;
	}

	public void assignSeat(Seat assignedSeat) {
		this.assignedSeat = assignedSeat;
	}

	public String getSeatingClass() {
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
