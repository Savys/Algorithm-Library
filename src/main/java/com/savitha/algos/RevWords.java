

package com.savitha.algos;

import java.util.Arrays;
/*Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
       * For example,
      Given s = "the sky is blue",
      return "blue is sky the".
      
      Could you do it in-place without allocating extra space?
      o/p: [Savitha, is, name, real, My]
*/

public class  RevWords {
    public static String[] revWords(String input)
    {
      
      String inputArray[]=input.split(" ");
      int len=inputArray.length;
      for(int i=0;i<(len/2)+1;i++)
      {
          String temp;
        temp=inputArray[i];
        inputArray[i]=inputArray[len-(i+1)];
        inputArray[len-(i+1)]=temp;
      }
     
      return inputArray;
    }
    public static void main(String[] args) {
    String input="My real name is Savitha";
    String result[]=revWords(input);
    System.out.println(Arrays.toString(result));

  }

}
