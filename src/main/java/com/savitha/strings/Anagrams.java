package com.savitha.strings;

import java.util.Arrays;

public class Anagrams {

  public static void main(String[] args) {
    String str1="Divya";
    String str2="Yadvi";
    if(isAnagram(str1,str2))
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
  private static boolean isAnagram(String str1, String str2) {
    if(str1.length()!=str2.length()) {
      return false;
    }
    str1=sortCharacters(str1);
    str2=sortCharacters(str2);
    return str1.equals(str2);
  }
  private static String sortCharacters(String str1) {
    char[] charArray=str1.toLowerCase().toCharArray();
    Arrays.sort(charArray);    
    return String.valueOf(charArray);
  }

}
