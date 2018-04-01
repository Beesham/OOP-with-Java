package sortingWordsInAlphabeticalOrder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *  @author Beesham Sarendranauth
 *	Sorts an input of words from a file in alphabetical order
 */
public class SortingWords {
	public static void main(String[] args) {
		Map<String, Set<String>> map = new TreeMap<>();
		TreeSet keys = new TreeSet();
		TreeSet values = new TreeSet();

		Scanner in = new Scanner(System.in);
		String fileName;

		System.out.print("Enter file name: ");
		fileName = in.next();

		File file = new File(fileName);
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (in.hasNext()) {
			String s = in.next().toLowerCase().replaceAll("([,'.;()!])", "");
			keys.add(Character.toString(s.charAt(0)));
			values.add(s);
		}

		for (Iterator iterator = keys.iterator(); iterator.hasNext(); ) {
			String next = (String) iterator.next();
			map.put(next, new TreeSet<String>());
		}

		for (Iterator iterator = values.iterator(); iterator.hasNext(); ) {
			String next = (String) iterator.next();
			Set s = map.get(Character.toString(next.charAt(0)));
			s.add(next);
		}

		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry next = (Map.Entry) iterator.next();
			System.out.println( next.getKey() + ": " + next.getValue());
		}

	}

}
