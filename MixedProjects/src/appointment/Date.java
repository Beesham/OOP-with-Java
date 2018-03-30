package appointment;

public class Date implements Comparable{
	private int month;
	private int day;
	private int year;

	public Date(int year, int month, int day) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public int compareTo(Object o) {
		Date d = (Date) o;

		if(d.getYear() < year)
			return -1;
		else if(d.getYear() > year)
			return 1;

		if(d.getMonth() < month)
			return -1;
		else if(d.getMonth() > month)
			return 1;

		if(d.getDay() < day)
			return -1;
		else if(d.getDay() > day)
			return 1;

		return 0;
	}

	@Override
	public String toString() {
		return year + "/" + month + "/" + day;
	}
}
