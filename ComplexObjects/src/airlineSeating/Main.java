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

	/**
	 * Gives a visual representation of all the available seats
	 * @param airplane the airplane with seating class
	 */
	public static void showSeating(Airplane airplane) {
		GenericSeatingClass economyClass = airplane.getEconomyClass();
		GenericSeatingClass firstClass = airplane.getFirstClass();

		Passenger econClassSeats[][] = economyClass.getSeats();
		Passenger firstClassSeats[][] = firstClass.getSeats();

		//Displays the available seats for First Class
		for(int i = 0; i < FirstClass.MAX_ROWS_FIRST; i++) {
			for(int j = 0; j < FirstClass.MAX_COLS_FIRST; j++) {
				if(firstClassSeats[i][j] != null) {
					if(j == FirstClass.MAX_COLS_FIRST - 1) {
						System.out.print(" * ");
					}else{
						System.out.print(" * |");
					}
				}else{
					if(j == FirstClass.MAX_COLS_FIRST - 1){
						System.out.print(" - ");
					}else {
						System.out.print(" - |");
					}
				}
			}
			System.out.println("");
		}

		System.out.println("");

		//Displays the available seating for Economy Class
		for(int i = 0; i < EconomyClass.MAX_ROWS_ECON; i++) {
			for(int j = 0; j < EconomyClass.MAX_COLS_ECON; j++) {
				if(econClassSeats[i][j] != null) {
					if(j == EconomyClass.MAX_COLS_ECON - 1) {
						System.out.print(" * ");
					}else{
						System.out.print(" * |");
					}
				}else{
					if(j == EconomyClass.MAX_COLS_ECON - 1){
						System.out.print(" - ");
					}else {
						System.out.print(" - |");
					}
				}
			}
			System.out.println("");
		}
	}

	/**
	 * Gathers passenger(s) info and adds to the airplane
	 * @param airplane the airplane to add to
	 */
	public static void addPassenger(Airplane airplane){
		//Get seating class
		String seatingClass = promptForSeatingClass();
		if(seatingClass == null) return;

		//Get number of passengers per seating class
		int numOfPassengers = promptForAmountOfPassengers();

		//Gets the seating prefs for the passenger(s)
		String seatPref;
		if(numOfPassengers == 1) {
			List<Passenger> passengerList = new ArrayList<>();

			seatPref = promptForSeatingPreference(seatingClass);
			if(seatPref == null) return;

			Passenger p = new Passenger(seatingClass, seatPref);
			passengerList.add(p);

			//Try add the passenger to the plane
			try {
				airplane.addPassenger(passengerList, seatingClass, numOfPassengers);
			} catch (Exception e) {
				System.out.println("No Seats Found!");
			}

		}else if(numOfPassengers > 1){
			List<Passenger> passengerList = new ArrayList<>();

			for(int i = 0; i < numOfPassengers; i++) {
				seatPref = promptForSeatingPreference(seatingClass);
				if(seatPref == null) return;
				Passenger p = new Passenger(seatingClass, seatPref);
				passengerList.add(p);
			}
			try {
				airplane.addPassenger(passengerList, seatingClass, numOfPassengers);
			} catch (Exception e) {
				System.out.println("No Seats Found!");
			}
		}else{
			System.out.println("Invalid number of passengers.");
		}

	}

	public static int showMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nMenu");
		System.out.println("1. Add Passengers");
		System.out.println("2. Show Seating");
		System.out.println("3. Quit");
		System.out.print("Selection: ");
		int inputSelection = 0;
		try {
			inputSelection = in.nextInt();
		}catch (Exception e){
			return 0;
		}
		return inputSelection;
	}

	public static String promptForSeatingClass() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nE/e: Economy Class\nF/f: First Class");
		System.out.print("What Seating class: ");
		char selection;
		try {
			selection = in.next().trim().toLowerCase().charAt(0);
		}catch (Exception e){
			return  null;
		}
		if(selection == 'f'){
			return FirstClass.FIRST_CLASS_NAME;
		}else if(selection == 'e') {
			return EconomyClass.ECONOMY_CLASS_NAME;
		}else{
			System.out.println("Invalid Selection!");
		}
		return null;
	}

	public static int promptForAmountOfPassengers() {
		Scanner in = new Scanner(System.in);
		System.out.print("\n1 ~ 2 (First Class)\n1 ~ 3 (Economy Class)\nNumber of Passengers: ");
		int numOfPass = 0;

		try {
			numOfPass = in.nextInt();
		}catch (java.util.InputMismatchException e){
			System.out.println("Invalid Selection!");
			return -1;
		}

		if(numOfPass > 3 || numOfPass < 1) {
			System.out.println("Invalid Selection!");
		}else{
			return numOfPass;
		}
		return -1;
	}

	public static String promptForSeatingPreference(String seatingClass) {
		Scanner in = new Scanner(System.in);
		if(seatingClass.equals(FirstClass.FIRST_CLASS_NAME)) {
			System.out.println("\nW/w: Window\nA/a: Aisle");
		}else if(seatingClass.equals(EconomyClass.ECONOMY_CLASS_NAME)) {
			System.out.println("W/w: Window\nC/c: Center\nA/a: Aisle");
		}
		System.out.print("Seating preference: ");
		char seatPref;

		try {
			seatPref = in.nextLine().trim().toLowerCase().charAt(0);
		}catch (Exception e){
			System.out.println("Invalid Selection!");
			return null;
		}

		if(seatPref == 'w') {
			return SeatingPreferences.WINDOW;
		}else if(seatPref == 'c'){
			return SeatingPreferences.CENTER;
		}else if(seatPref == 'a') {
			return SeatingPreferences.AISLE;
		}else{
			System.out.println("Invalid Selection!");
		}
		return null;
	}
}
