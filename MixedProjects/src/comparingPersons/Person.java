package comparingPersons;

/**
 * @author Beesham Sarendranauth
 * Person class
 */
public class Person implements Comparable<Person> {

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Person p) {
		if(p.lastName.compareTo(lastName) > 0) {
			return 1;
		}else if(p.lastName.compareTo(lastName) < 0) {
			return -1;
		}else{
			if(p.firstName.compareTo(firstName) > 0) {
				return 1;
			}else if(p.firstName.compareTo(firstName) < 0) {
				return -1;
			}
		}

		return 0;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
