package savitha;

import java.util.HashMap;

public class StringAnagram {
/*How to check if two Strings are anagrams of each other*/


  public static void main(String[] args) {
   String s1="Divya";
   String s2="Yadvi";
   int s1count=1;
   HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
   for(int i=0;i<s1.length();i++)
   {
     if(hm.containsKey(s1.charAt(i)))
         {
       s1count++;
     
     }
     else
     hm.put(s1.charAt(i), s1count);     
   }
  }

}
