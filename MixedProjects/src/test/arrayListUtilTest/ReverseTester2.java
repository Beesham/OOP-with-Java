package test.arrayListUtilTest;

import java.util.ArrayList;
import java.util.Collections;

/**
   This program demonstrates reversing an arraylist
*/
public class ReverseTester2 {
   public static void main(String[] args)
   {
      ArrayList<String> a = new ArrayList<>();
      a.add("apple");
      a.add("orange");
      a.add("pear");
      a.add("banana");
      ArrayList<String> b = ArrayListUtil2.reverse(a);

      System.out.println("Original: " + a);
      System.out.println("Expected: [apple, orange, pear, banana]");
      System.out.println("Reversed: " + b);
      System.out.println("Expected: [banana, pear, orange, apple]");
   }

}

class ArrayListUtil2 {

   /**
    * Reverses an arraylist without modifying its contents
    * @param arrayList
    * @return the reversed list
    */
   public static ArrayList reverse(ArrayList arrayList) {
      ArrayList newArrayList = (ArrayList) arrayList.clone();
      Collections.reverse(newArrayList);
      return newArrayList;
   }
}

