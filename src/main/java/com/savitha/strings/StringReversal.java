package com.savitha.strings;

public class StringReversal {

  private static void Reverse(String input) {
    for (int i = input.length() - 1; i >= 0; i--) {
      Character cInput = input.charAt(i);
      System.out.println(cInput);
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    StringReversal rev = new StringReversal();
    rev.Reverse("avaJ");
  }

}
