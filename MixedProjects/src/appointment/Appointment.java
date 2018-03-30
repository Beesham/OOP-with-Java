package appointment;


/**
 * @author Beesham Sarendranauth
 * Appointment superclass
 */
public class Appointment {
	private String description;
	private Date date;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean occursOn(int year, int month, int day) {
		Date d = new appointment.Date(year, month, day);
		if(date.compareTo(d) == 0) return true;
		else return false;
	}
}
