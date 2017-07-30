

package com.savitha.strings;

import java.util.HashSet;

public class StrDuplicateChar {
  /*
   * Java or Python to print duplicate characters from a given String, for example if String is "Java" then program should print "a". 
*/

  public static void main(String[] args) {
    String test="Java";
    
   // char[] chr=test.toCharArray();
    HashSet<Character> hs=new HashSet<Character>();
    boolean result=false;
    for(int i=0;i<test.length();i++)
    {
        result=hs.add(test.charAt(i));
        if(result==false){
          break;
        }System.out.println(result);
    }
  }
}
