package appointment;

/**
 * @author Beesham Sarendranauth
 * Monthly appointment class
 */
public class Monthly extends Appointment{
	@Override
	public boolean occursOn(int year, int month, int day) {
		if(super.getDate().getDay() == day) return true;
		else return false;
	}
}
