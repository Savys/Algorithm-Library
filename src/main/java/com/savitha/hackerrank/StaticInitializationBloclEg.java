package com.savitha.hackerrank;

import java.util.Scanner;

public class StaticInitializationBloclEg {
private static Scanner sc=new Scanner(System.in);  
public static int B,H;
public static boolean flag =false;
static
{
 B=sc.nextInt();
 H=sc.nextInt();
 if ((B >0) && (H >0)) 
 {
   flag=true;
 }
 else{
   System.out.println("java.lang.Exception: Breadth and height must be positive");
 }
}
  
  public static void main(String[] args) {
   if (flag)
   {
     int area=B*H;
     System.out.println(area);
   }
  }

}
