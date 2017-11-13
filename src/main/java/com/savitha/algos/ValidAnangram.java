package com.savitha.algos;

import java.util.Arrays;

/*Given two strings s and t, write a function to determine if t is an anagram of s.*/

public class ValidAnangram {

  public static void main(String[] args) {
   String s="yadvi";
   String t="divyas";
   boolean result=isAnagram(s,t);
   System.out.println(result);

  }

  private static boolean isAnagram(String s, String t) {
   
    

    if(s.length() !=t.length())
    {
      return false;
    }
   String retValue1=sortStrings(s);
   String retValue2=sortStrings(t);
   System.out.println(retValue1+"       "+retValue2);
   
   if(retValue1.equals(retValue2))
   {
     return true;}
     else {return false;}   
  }

  private static String sortStrings(String str) {
    char inputArray[]=str.toCharArray();
    Arrays.sort(inputArray);
    return String.valueOf(inputArray);
 
    
  }

}
