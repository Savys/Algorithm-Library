package com.savitha.algos;

public class RevNo {
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {
    int input = 123;

    String result = reverseNo(input);
    System.out.println(result);

  }

  private static String reverseNo(int input) {

    int last = input % 10;  
    int no = input / 10;

    if (no > 10) {
      sb.append(last);

      reverseNo(no);
    } else {
      sb.append(last);
    }
    if (no < 10)
      sb.append(no);

    return sb.toString();

  }

}
