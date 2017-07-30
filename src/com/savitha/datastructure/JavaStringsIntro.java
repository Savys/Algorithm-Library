package com.savitha.datastructure;

import java.io.*;
import java.util.*;
public class JavaStringsIntro {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    int sum= findSum(A,B);
    System.out.print(sum);
    int compareValue=A.compareTo(B);
    
    if(compareValue >0)
      System.out.println("Yes");
    else
      System.out.println("\nNo");
    String strOutput1=CaptilizeFirst(A);
    String strOutput2=CaptilizeFirst(B);
    System.out.print(strOutput1.concat (" ").concat(strOutput2));
    
  }

  private static String CaptilizeFirst(String a) {
   String output=a.substring(0,1).toUpperCase()+a.substring(1);
   return output;
    
  }

  private static int findSum(String s1,String s2 ) {
    int sum=0;
    char []strCharArrays1 =s1.toCharArray();
    char []strCharArrays2 =s2.toCharArray();
    int len1=findlength(strCharArrays1);
    int len2=findlength(strCharArrays2);
    sum=len1+len2;
    
    
    return sum;
  }

  private static int findlength(char[] strCharArrays1) {
    int  lenghthvar = 0;
    for(char c:strCharArrays1)
    {
      lenghthvar++;
    }
    return lenghthvar;
  }

}
