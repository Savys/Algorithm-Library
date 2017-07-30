package com.savitha.stacksQueue;

import java.util.HashMap;

public class PrintDuplicateChar {

  public static void main(String[] args) {
    String input = "Javass";
    printDuplicate(input);
  }

  private static void printDuplicate(String input) {
    Character output;

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    System.out.println(input.length());
    for (int i = 0; i < input.length(); i++) {
      Character ele=input.charAt(i);
      if (map.containsKey(ele)) {
        map.put(ele, map.get(ele)+1);
      } else {
        map.put(input.charAt(i), 1);
      }
     
    }
    for(Character c:map.keySet())
    {
      if(map.get(c)>1)
        System.out.println(c);
    }
    return ;
  }

}
