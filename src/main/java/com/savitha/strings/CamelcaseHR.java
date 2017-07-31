package com.savitha.strings;

public class CamelcaseHR {

  public static void main(String[] args) {
     String s="saveChangesInTheEditor";
     int result=returnNoOfWords(s);
     System.out.println("No of words: "+result);

  }

  private static int returnNoOfWords(String s) {
   int word=1;
   char charArr[]=s.toCharArray();
   for(int i=1;i <s.length();i++)
   {
    char input=charArr[i];
    if (65 <= input && input<=90){
      word++;
    }
   }
    return word;
  }

}
