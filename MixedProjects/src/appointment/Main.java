package appointment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Appointment> appointments = new ArrayList<>();

		OneTime oneTime1 = new OneTime();
		oneTime1.setDate(new Date(2018, 3, 30));
		oneTime1.setDescription("Swimming");

		OneTime oneTime2 = new OneTime();
		oneTime2.setDate(new Date(2018, 4, 30));
		oneTime2.setDescription("Final");

		Daily daily1 = new Daily();
		daily1.setDate(new Date(2018, 2, 30));
		daily1.setDescription("Dinner");

		Daily daily2 = new Daily();
		daily2.setDate(new Date(2018, 3, 2));
		daily2.setDescription("Poop");

		Monthly monthly1 = new Monthly();
		monthly1.setDate(new Date(2018, 3, 10));
		monthly1.setDescription("Meeting");

		Monthly monthly2 = new Monthly();
		monthly2.setDate(new Date(2018, 1, 22));
		monthly2.setDescription("Pay bills");

		appointments.add(oneTime1);
		appointments.add(oneTime2);
		appointments.add(daily1);
		appointments.add(daily2);
		appointments.add(monthly1);
		appointments.add(monthly2);

		Date date = queryUserForDate();
		for(Appointment a: appointments) {
			if(a.occursOn(date.getYear(), date.getMonth(), date.getDay())) {
				System.out.println(a.toString());
			}
		}
	}

	private static Date queryUserForDate() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter date to check (YYYY/MM/DD): ");
		String input = in.nextLine().trim();

		int year = Integer.parseInt(input.substring(0, input.indexOf("/")));
		int month = Integer.parseInt(input.substring(input.indexOf("/") + 1, 7));
		int day = Integer.parseInt(input.substring(8));

		return new Date(year, month, day);
	}

}
