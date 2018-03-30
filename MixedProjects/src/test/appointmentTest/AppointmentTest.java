package test.appointmentTest;

import appointment.Appointment;
import appointment.Date;

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

	}
}
