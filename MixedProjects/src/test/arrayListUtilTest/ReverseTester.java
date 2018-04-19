package test.arrayListUtilTest;

import java.util.ArrayList;
import java.util.Collections;

/**
   This program demonstrates reversing an arraylist
*/
public class ReverseTester {
   public static void main(String[] args)
   {
      ArrayList<String> a = new ArrayList<>();
      a.add("apple");
      a.add("orange");
      a.add("pear");
      a.add("banana");
      ArrayListUtil1.reverse(a);
      System.out.println("Reversed: " + a);
      System.out.println("Expected: [banana, pear, orange, apple]");
   }

}

class ArrayListUtil1 {

   /**
    * Reverses the contents of an arraylist
    * @param arrayList
    */
	public static void reverse(ArrayList arrayList) {
		Collections.reverse(arrayList);
	}

}

