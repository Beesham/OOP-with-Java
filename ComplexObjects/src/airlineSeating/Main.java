package airlineSeating;

import airlineSeating.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Presents an interface for the user to book seats
 * @author Beesham Sarendranauth
 */
public class Main {
	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		int selection = 0;
		do {
			selection = showMenu();
			switch (selection) {
				case (1):
					addPassenger(airplane);
					break;
				case (2):
					showSeating(airplane);
					break;
				case (3):
					break;
				default:
					System.out.println("Invalid Selection!");
			}
		}while (selection != 3);
	}

	public static void showSeating(Airplane airplane) {
		GenericSeatingClass economyClass = airplane.getEconomyClass();
		GenericSeatingClass firstClass = airplane.getFirstClass();

		Passenger econClassSeats[][] = economyClass.getSeats();
		Passenger firstClassSeats[][] = firstClass.getSeats();

		for(int i = 0; i < FirstClass.MAX_ROWS_FIRST; i++) {
			for(int j = 0; j < FirstClass.MAX_COLS_FIRST; j++) {
				if(firstClassSeats[i][j] != null) {
					System.out.print(" * | ");
				}else {
					System.out.print(" - | ");
				}
			}
			System.out.println("");
		}

		System.out.println("");

		for(int i = 0; i < EconomyClass.MAX_ROWS_ECON; i++) {
			for(int j = 0; j < EconomyClass.MAX_COLS_ECON; j++) {
				if(econClassSeats[i][j] != null) {
					System.out.print(" * | ");
				}else {
					System.out.print(" - | ");
				}
			}
			System.out.println("");
		}
	}

	public static void addPassenger(Airplane airplane){
		String seatingClass = promptForSeatingClass();
		int numOfPassengers = promptForAmountOfPassengers();
		String seatPref;
		if(numOfPassengers == 1) {
			List<Passenger> passengerList = new ArrayList<>();
			seatPref = promptForSeatingPreference(seatingClass);
			Passenger p = new Passenger(seatingClass, seatPref);
			passengerList.add(p);
			try {
				airplane.addPassenger(passengerList, seatingClass, numOfPassengers);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(numOfPassengers > 1){
			List<Passenger> passengerList = new ArrayList<>();
			for(int i = 0; i < numOfPassengers; i++) {
				Passenger p = new Passenger(seatingClass, promptForSeatingPreference(seatingClass));
				passengerList.add(p);
			}
			try {
				airplane.addPassenger(passengerList, seatingClass, numOfPassengers);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static int showMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Add Passengers");
		System.out.println("2. Show Seating");
		System.out.println("3. Quit");
		System.out.print("Selection: ");
		return in.nextInt();
	}

	public static String promptForSeatingClass() {
		Scanner in = new Scanner(System.in);
		System.out.println("E/e: Economy Class\nF/f: First Class");
		System.out.print("What Seating class: ");
		char selection = in.next().trim().toLowerCase().charAt(0);
		if(selection == 'f'){
			return FirstClass.FIRST_CLASS_NAME;
		}else if(selection == 'e') {
			return EconomyClass.ECONOMY_CLASS_NAME;
		}
		return null;
	}

	public static int promptForAmountOfPassengers() {
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Passengers: ");
		return in.nextInt();
	}

	public static String promptForSeatingPreference(String seatingClass) {
		Scanner in = new Scanner(System.in);
		if(seatingClass.equals(FirstClass.FIRST_CLASS_NAME)) {
			System.out.println("W/w: Window\nA/a: Aisle");
		}else if(seatingClass.equals(EconomyClass.ECONOMY_CLASS_NAME)) {
			System.out.println("W/w: Window\nC/c: Center\nA/a: Aisle");
		}
		System.out.print("Seating preference: ");
		char seatPref = in.nextLine().trim().toLowerCase().charAt(0);
		if(seatPref == 'w') {
			return SeatingPreferences.WINDOW;
		}else if(seatPref == 'c'){
			return SeatingPreferences.CENTER;
		}else if(seatPref == 'a') {
			return SeatingPreferences.AISLE;
		}
		return null;
	}
}
