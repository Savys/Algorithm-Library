package com.savitha.algos;
import java.util.Scanner;

public class ReverseNumRecursion {
  public static void main(String[] args) {
    int num = 0;
    System.out.println("Enter a number to reverse:");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    System.out.println("Rev num is: ");
    ReverseNum(num);
  }

  private static int ReverseNum(int i) {
    int k = 0;
    if (i < 10) {
      System.out.println(+i);
    } else {
      System.out.print(i % 10);
      ReverseNum(i / 10);
    }
    return k;
  }
}
