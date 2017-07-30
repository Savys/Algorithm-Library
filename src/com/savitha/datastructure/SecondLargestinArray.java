package com.savitha.datastructure;
public class SecondLargestinArray {

  public static void main(String[] args) {
    int[] myArray = { 10, 15,80, 11, 20, 25, 22, 30, 35, 50,22 };
    int largest = myArray[0];
    int SecondLargest = myArray[0];
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] > largest) {
        SecondLargest = largest;
        largest = myArray[i];
      } else if (myArray[i] > SecondLargest) {
        SecondLargest = myArray[i];
      }
    }
    System.out.println(" Largest number is : " + largest);
    System.out.println("Second Largest number is : " + SecondLargest);

  }

}
