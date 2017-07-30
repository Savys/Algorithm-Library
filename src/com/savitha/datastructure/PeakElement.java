package com.savitha.datastructure;
public class PeakElement {

  int findPeak(int input[]) {
    int result = 0;
    for (int i = 0; i < input.length - 2; i++) {
      if ((input[i + 1] > input[i + 2]) && (input[i + 1] > input[i])) {
        // System.out.println("i: "+i);
        // break;
        result = input[i + 1];
      }
      break;
    }
    return result;
  }
  public static void main(String[] args) {
    int inputArray[] = { 1, 4, 3, 6, 7, 5 };
    PeakElement pe = new PeakElement();
    int result = pe.findPeak(inputArray);
    System.out.println("Peak element is : " + result);
  }
}
