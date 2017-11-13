package com.savitha.leetcode;

/*
 * Input: "Let's take LeetCode contest"
   Output: "s'teL ekat edoCteeL tsetnoc"
 * */
public class SolutionReverseWords {

  
  
  public static void main(String[] args) {
   String s="Let's take LeetCode contest";
   SolutionReverseWords soln= new SolutionReverseWords();
   soln.reverseWords(s);

  }

  private String reverseWords(String input) {
   String [] inputArray;
   StringBuilder sb2=new StringBuilder();
   inputArray=input.split(" ");
   int len=inputArray.length;
   for(int i=0;i<len;i++)
   {
     String output=reverseWord(inputArray[i]);
     sb2.append(output);
     System.out.print(output +" ");
   }
   
   return sb2.toString();
  }

  private String reverseWord(String word) {
    String output;
    int len=word.length();
    StringBuilder sb=new StringBuilder();
    sb=sb.append(word).reverse();
    
    return sb.toString();
  
    
  }

}
