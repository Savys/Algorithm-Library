package com.savitha.algos;

public class StringToInt {

  public static void main (String args[])
  {
      String  convertingString="123456";
      System.out.println("String Before Conversion :  "+ convertingString);
      //int output=    stringToint( convertingString );
      int output=    ParseInt( convertingString );
      System.out.println("");
      System.out.println("");
      System.out.println("int value as output "+ output);
      System.out.println("");
  }
  
  
  public static int stringToint( String str ){
      int i = 0, number = 0;
      boolean isNegative = false;
      int len = str.length();
      if( str.charAt(0) == '-' ){
          isNegative = true;
          i = 1;
      }
      while( i < len ){
          number *= 10;
          number += ( str.charAt(i++) - '0' );
      }
      if( isNegative )
      number = -number;
      return number;
  }   
  
  public static int ParseInt(String value)
  {
      int result = 0;
      int offset = 48; // ascii 48 = zero

      for (int index = 0; index < value.length(); index++)
      {
       
          char letter =value.charAt(index);
          /*System.out.println("letter : "+letter);
          System.out.println("letter-offset : " + (letter -offset));*/
          result = 10 * result + (letter - offset);
      }
      return result;
  }
}
