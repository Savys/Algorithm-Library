package com.savitha.strings;

import java.util.HashMap;
import java.util.Map;

public class Anangram {

  public static void main(String[] args) {
   String s1="Divya";
   String s2="Yadvi";
   //System.out.println(checkAnagram(s1,s2));

  }

  private static void checkAnagram(String s1, String s2) {
  // Map<Character,Character> hm1=new HashMap<Character,Integer>();
   Map<Character,Integer> hm2=new HashMap<Character,Integer>();
   if(s1.length() !=s2.length())
     return;
   for(int i=0;i<s1.length();i++)
   {
     Character c1=s1.charAt(i);
    // hm1.put(c1, 1);
   }
    
  }

}
