package com.savitha.sortsearch;

public class BubbleSort {

  public static void main(String[] args) {
    
    
    //int intArray[] = new int[]{5,90,35,45,150,3};
    int intArray[] = new int[]{3,2,9,6,5};
   
    //print array before sorting using bubble sort algorithm
    System.out.println("Array Before Bubble Sort");
    for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
    }
   
    //sort an array using bubble sort algorithm
    bubbleSort(intArray);
   
    System.out.println("");
   
    //print array after sorting using bubble sort algorithm
    System.out.println("Array After Bubble Sort");
    for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
    }

}

private static void bubbleSort(int[] intArray) {
   
  
    int n = intArray.length;
    int temp = 0;
   
    for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                   
                    if(intArray[j-1] > intArray[j]){
                            //swap the elements!
                            temp = intArray[j-1];
                            intArray[j-1] = intArray[j];
                            intArray[j] = temp;
                    }
                   
            }
    }

}
}
