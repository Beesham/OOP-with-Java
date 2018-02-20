package airlineSeating.model;

/**
 * Models Economy class for an airline
 * Has window seats and aisle
 * @author Beesham Sarendranauth
 */
public class EconomyClass extends GenericSeatingClass {

	public static final int MAX_SEATS_ECON = 90;
	public static final int MAX_ROWS_ECON = 15;
	public static final int MAX_COLS_ECON = 6;
	public static final int AISLE_OFFSET = 2;
	public static final int CENTER_OFFSET = 1;


	public EconomyClass(Passenger[][] seats) {
		super(seats);
	}

	@Override
	public Seat findMatch(Passenger p) throws Exception{
		Passenger seats[][] = getSeats();
		if(p.getSeatingPreference().equals(SeatingPreferences.WINDOW)) {
			for (int i = 0; i < MAX_ROWS_ECON; i++) {
				if (seats[i][0] == null) {
					return new Seat(i, 0);
				}else if(seats[i][MAX_COLS_ECON - 1] == null){
					return new Seat(i, 0);
				}else{
					throw new Exception("No Seats Found!");
				}
			}
		}else if(p.getSeatingPreference().equals(SeatingPreferences.AISLE)) {
			for (int i = 0; i < MAX_ROWS_ECON; i++) {
				if (seats[i][AISLE_OFFSET] == null) {
					return new Seat(i, AISLE_OFFSET);
				}else if(seats[i][MAX_COLS_ECON - AISLE_OFFSET] == null){
					return new Seat(i, AISLE_OFFSET);
				}else{
					throw new Exception("No Seats Found!");
				}
			}
		}else if(p.getSeatingPreference().equals(SeatingPreferences.CENTER)) {
			for (int i = 0; i < MAX_ROWS_ECON; i++) {
				if (seats[i][CENTER_OFFSET] == null) {
					return new Seat(i, CENTER_OFFSET);
				}else if(seats[i][MAX_COLS_ECON - CENTER_OFFSET] == null){
					return new Seat(i, CENTER_OFFSET);
				}else{
					throw new Exception("No Seats Found!");
				}
			}
		}

		return null;
	}
}
