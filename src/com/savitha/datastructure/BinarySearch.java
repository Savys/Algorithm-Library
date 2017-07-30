package com.savitha.datastructure;
  import java.util.Scanner;
  
  
  public class BinarySearch {
  
    public static void main(String[] args) {
      int myArray[]={10,20,15,30,18};
      int SearchElement =30;
      BinarySearchAlgorithm(myArray,SearchElement);
  
  
  
    }
  
    private static void BinarySearchAlgorithm(int[] myArray, int searchElement) {
      int first=0;
      int last =myArray.length-1;
      int mid=(first+last)/2;
      while(first <=last)
      {
        if(searchElement > (myArray[mid]))
            {
              first =mid+1;
            }
        
        else if(myArray[mid]==searchElement)
        {
          System.out.println("Found at position"+mid);
          break;
        }
        else if ((searchElement < (myArray[mid])))
        {
          last=mid-1;
        }
  
      }
      
    }
  
  }
