package com.savitha.algos;

import java.util.HashMap;
import java.util.Map;

public class OneEditDistanceAway {
  private static boolean isOneEditAway(String s1, String s2) {
    Map<Character, Integer> hm = new HashMap<Character, Integer>();
    char[] s1array = s1.toCharArray();
    char[] s2array = s2.toCharArray();
    int sameCount = 0, diffCount = 0;
    if (s1.length() != s2.length()) {
      return false;
    }
    for (int i = 0; i < s1array.length; i++) {
      if (hm.containsKey(s1array[i])) {
        hm.put(s1array[i], hm.get(s1array[i]) + 1);
      } else {
        hm.put(s1array[i], 1);
      }

    }
    for (int j = 0; j < s2array.length; j++) {
      if (hm.containsKey(s2array[j])) {
        hm.put(s2array[j], hm.get(s2array[j]) + 1);
      } else {
        hm.put(s2array[j], 1);
      }

    }
    for (Character name : hm.keySet()) 
    {
      String key = name.toString();
      String value = hm.get(name).toString();
      //System.out.println(key + " " + value);
      if (Integer.parseInt((value)) % 2 == 0)
      {
        sameCount++;
      } else 
      {
        diffCount++;
      }
      //System.out.println("sameCount: "+sameCount +" diffCount:" +diffCount);
      
    }
    if (diffCount == s1.length() - 1)
    {
      return true;
    } else 
    {
      return false;
    }
  }

  public static void main(String[] args) {
    String s1 = "loP";
    //String s2 = "pot";
    String s2 = "lot";
    boolean result = isOneEditAway(s1, s2);
    System.out.println(result);

  }

}
