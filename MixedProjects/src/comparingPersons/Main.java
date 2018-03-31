package comparingPersons;

import java.util.*;

/**
 * @author Beesham Sarendranauth
 */
public class Main {
	public static void main(String[] args) {
		ArrayList<Person> arrayList = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		for (int i = 1; i < 11; i++) {
			String fname, lname;
			System.out.print("Enter person " + i + " firstname: ");
			fname = in.next();
			System.out.print("Enter person " + i + " lastname: ");
			lname = in.next();

			arrayList.add(new Person(fname, lname));
		}

		Collections.sort(arrayList, Collections.<Person>reverseOrder());
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(arrayList.size() - 1));
	}
}
