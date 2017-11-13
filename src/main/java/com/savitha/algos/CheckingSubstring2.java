package com.savitha.algos;

import java.util.Scanner;

public class CheckingSubstring2 {
  public static void main(String[] args) {

    /*
     * Scanner input=new Scanner(System.in);
     * System.out.println("Please enter str1:"); String string1=input.next();
     * 
     * System.out.println("Please enter str2:"); String string2=input.next();
     */
    String haystack = "fdgdfgABDDE";
    //String needle = "ABCD";
    String needle="ABDDE";
    
    if (isSubString(haystack, needle)) {
      System.out.println("Found needle in the haystack.");
    } else {
      System.out.println("NOT Found needle in the haystack");
    }
    
}

  
  public static boolean isSubString(String haystack, String needle) {
    Boolean match=false;
    int compareStart = 0;
    int compareEnd = haystack.length()-needle.length();
    
    for(int i=compareStart;i<=compareEnd;i++) {
      Boolean result = isStringEqual(haystack,i,needle);
      if(result) {
        match = true;
        break;
      }
    }
    
    return match;
  }
    
  public static boolean isStringEqual(String haystack,int pos,String needle) {
    String newtempString=MysubString(haystack,pos,pos+needle.length());
    
    System.out.println("Comparing Equal::String1:"+newtempString+",string2:"+needle);
    Boolean match = false;
    int i=0;
    if(newtempString.length() != needle.length()) {
      return false;
    }
    
    for(i=0;i<newtempString.length();i++) {
      char char1 = newtempString.charAt(i);
      char char2 = needle.charAt(i);      
      if(char1 != char2) {
        break;
      }
    }
    if(i==newtempString.length()) {
      match = true;
    }
    
    return match;
  }
  
  public static String  MysubString(String input,int startpos,int endPos)
  {   
    StringBuilder sb=new StringBuilder();
    for (int i=startpos;i<endPos;i++)
    {
      char charatpos=input.charAt(i);     
      sb.append(charatpos);      
    }
    return sb.toString();
  }

  /*
  /*
  public static boolean isSubString3(String haystack, String needle) {
    boolean match = false;
    
    int haystackPointer = 0;
    int needlePointer = 0;
    
    while(true) {
      needlePointer = 0;
      Boolean found=true;
      for(int j=0, i=haystackPointer;j<haystack.length();j++,i++) {
        char char1 = haystack.charAt(i);
        char char2 = needle.charAt(j);
        System.out.println("Comparing char1(haystack):"+char1+":: char2(needle):"+char2);
        if(char1 != char2 ) {
          found=false;
          break;
        }
        if(i+1 >= needle.length()) {
          break;
        }        
      }//end for loop
      if(found) {
        match=true;
        break;
      }
      haystackPointer++;
      if(haystackPointer >= haystack.length()) {
        break;
      }
    }//while 
    
    
    return match;
  }
  
  public static boolean isSubString2(String s1, String s2) {

    boolean match = true;
    System.out.println("s1:" + s1 + " s2:" + s2);
    for (int i = 0; i < s2.length(); i++) {
      char char1 = s2.charAt(i);
      for (int j = 0; j < s1.length(); j++) {
        char char2 = s2.charAt(j);
        System.out.println("Show me char1 :" + char1 + " And char2:" + char2 + " And i:" + i + " And j:" + j);
        if (char1 != char2) {
          match = false;
          break;
        } else {
          if(i+j > s1.length()) {
            break;
          }
          char1 = s1.charAt(i + j);
        }
      }
    }
    return match;
  }
  */

}
