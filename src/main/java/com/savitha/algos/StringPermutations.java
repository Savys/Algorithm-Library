package com.savitha.algos;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
  public static void main(String args[]) {
    String s = "ABC";
    // String s1 = "EBAY";
    // String s2 = "Yahoo";
    System.out.println("\nString " + s + ":\nPermutations: " + permutation(s));
    // System.out.println("\nString " + s1 + ":\nPermutations: " +
    // permutation(s1));
    // System.out.println("\nString " + s2 + ":\nPermutations: " +
    // permutation(s2));

  }

  private static Set<String> permutation(String str) {
    Set<String> pSet = new HashSet<String>();
    // System.out.println(str.length());
    if (str == null) {
      return null;
    } else if (str.length() == 0) {
      pSet.add("");
      return pSet;
    }
    char firstChar = str.charAt(0);
    String rem = str.substring(1);
    Set<String> words = permutation(rem);

    for (String newString : words) {
      for (int i = 0; i <= newString.length(); i++) {
        pSet.add(CharAdd(newString, firstChar, i));
      }
    }
    return pSet;

  }

  private static String CharAdd(String str, char c, int j) {
    String first = str.substring(0, j);
    // System.out.println("First:"+first);

    String last = str.substring(j);
    // System.out.println("Last:"+last);

    // System.out.println("first+last+c:"+first+c+last);
    return first + c + last;
  }
}
