package com.savitha.datastructure;
public class SortAlphabets {

  public static void main(String[] args) {
    // String s="abzA";
    String s = "savi";
    // o/p AabZ;
    char[] words = s.toCharArray();
    for (int i = 1; i < words.length; i++) {
      if (words[i] < words[i - 1]) {
        char temp = words[i - 1];
        words[i - 1] = words[i];
        words[i] = temp;
      }
    }
    String st = String.valueOf(words);
    System.out.println(st);

  }
}
