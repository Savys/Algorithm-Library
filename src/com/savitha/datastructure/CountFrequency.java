package com.savitha.datastructure;

public class CountFrequency {
  private void count(int[] inputArray) {
    for(int i=1;i<=inputArray.length;i++)
    {int count=0;
    for(int j=0;j<inputArray.length;j++)
    {
      if (inputArray[j] == i) 
      {
        count++;
      }
    }
    System.out.println(i + " " + count);
    }   
  }
  private void count2(int[] inputArray) {
    int n = inputArray.length;
    int[] count2 = new int[n];
    for (int i = 0; i < n; i++) { 
      count2[i] = 0;
    }
    for (int i = 0; i < n; i++) {
      count2[inputArray[i] - 1]++;
  } 
    for (int i = 0; i < n; i++) {
    System.out.println(i + 1 + " " + count2[i]);
}
  }

  public static void main(String[] args) {
    int inputArray[]={2, 3, 3, 2, 5};
    CountFrequency  cf=new CountFrequency();
    cf.count(inputArray);
    System.out.println("Method 2: ");
    cf.count2(inputArray);
  }
 


}
