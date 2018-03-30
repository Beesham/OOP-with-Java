package test.appointmentTest;

import appointment.*;

/**
 * @author Beesham Sarendranauth
 * Test class for appointment class
 */
public class AppointmentTest {
	public static void main(String[] args) {
		Appointment appointment = new Appointment();
		appointment.setDate(new Date(2018, 03, 30));

		System.out.println("Expected: true Actual: " + appointment.occursOn(2018, 03, 30));
		System.out.println("Expected: false Actual: " + appointment.occursOn(2017, 03, 30));
		System.out.println("Expected: false Actual: " + appointment.occursOn(2018, 03, 31));

		OneTime oneTime = new OneTime();
		oneTime.setDate(new Date(2018,03,30));
		System.out.println("OneTime Expected: true Actual: " + oneTime.occursOn(2018, 03, 30));
		System.out.println("OneTime Expected: false Actual: " + oneTime.occursOn(2017, 03, 30));
		System.out.println("OneTime Expected: false Actual: " + oneTime.occursOn(2018, 03, 31));

		Daily daily = new Daily();
		daily.setDate(new Date(2018,03,30));
		System.out.println("Daily Expected: true Actual: " + daily.occursOn(2018, 03, 30));
		System.out.println("Daily Expected: true Actual: " + daily.occursOn(2017, 03, 30));
		System.out.println("Daily Expected: true Actual: " + daily.occursOn(2018, 03, 31));

		Monthly monthly = new Monthly();
		monthly.setDate(new Date(2018,03,30));
		System.out.println("Monthly Expected: true Actual: " + monthly.occursOn(2018, 03, 30));
		System.out.println("Monthly Expected: true Actual: " + monthly.occursOn(2017, 03, 30));
		System.out.println("Monthly Expected: false Actual: " + monthly.occursOn(2018, 03, 31));


	}
}
