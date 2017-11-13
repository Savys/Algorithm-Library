/*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.


For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.*/


package com.savitha.algos;

public class AddDigits {

  public static void main(String[] args) {
    int num = 38;
    AddDigits addD = new AddDigits();
    int result = addD.getSum(num);
    System.out.println(result);
  }

 

  private int getSum(int num) {
    int sum = 0;
    while (num > 9) {
      sum = sum + (num % 10);
      num = num / 10;
    }
    sum=sum+num;
    if (sum > 9) {
      sum = getSum(sum);
    }
    return sum;

  }
}
