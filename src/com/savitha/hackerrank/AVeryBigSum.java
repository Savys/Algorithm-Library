package com.savitha.hackerrank;
import java.math.BigDecimal;
import java.util.Scanner;

public class AVeryBigSum {

  public static void main(String[] args) {
    Scanner inScanner=new Scanner(System.in);
    BigDecimal bignumber;
    BigDecimal bigSum = BigDecimal.ZERO;
    int i;
    int noOfVariables=inScanner.nextInt();
    for(i=0;i<noOfVariables;i++)
    {
      bignumber=inScanner.nextBigDecimal();
      bigSum=bigSum.add(bignumber);
    }
  System.out.print(bigSum);  

  }

}
