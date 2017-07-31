package com.savitha.algos;
import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    int num = 0;
    int revNum = 0;
    System.out.println("Enter a Number to reverse:");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    System.out.println(num);
    while (num != 0) {
      revNum = revNum * 10;
      revNum = revNum + num % 10;
      num = num / 10;
    }
    System.out.println("Rev No is " + revNum);
  }
}
