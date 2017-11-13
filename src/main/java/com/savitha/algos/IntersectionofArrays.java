/*Given two arrays, write a function to compute their intersection.
 * Method1- Brute force
 * Method2-Hash Set Time = O(n). Space = O(n).
 * Method 3: To try  using B.Search- even better Time = O(nlog(n)). Space = O(n).
 * */


package com.savitha.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofArrays {

  public static void main(String[] args) {
    int a[] = { 0, 1, 2, 3, 4, 5 };
   // int b[] = { 4, 7, 8, 9, 1, 10 };
    int b[] = {1,4 };
    List<Integer> c = new ArrayList<Integer>();

    IntersectionofArrays ia = new IntersectionofArrays();
    List<Integer> result = ia.FindIntersction1(a, b, c);
    System.out.println(result);
    
    int[]set3=ia.method2(a,b,c);
    
    System.out.println(Arrays.toString(set3));
   
    
    
  }

  private int[] method2(int[] a, int[] b, List<Integer> c) {
   Set<Integer> set1=new HashSet<Integer>();
   Set<Integer> set2=new HashSet<Integer>();
   //int[] set3 = null;
   
   for(int j=0;j<a.length;j++)
   {
     set1.add(a[j]);
   }
   for(int k=0;k<b.length;k++)
   {
     if(set1.contains(b[k]))
     {
       set2.add(b[k]);
       
     }
   }
   int[]set3=new int[set2.size()];
   int count=0;
   for(int n :set2)
   {
    set3[count++]=n; 
   }
   
    return set3;
  }

  private List<Integer> FindIntersction1(int[] a, int[] b, List<Integer> c) {

    for (int i = 0; i < a.length ; i++) {
      int ele = a[i];
      boolean output = checkInArray2(ele, b);
      if (output) {
        c.add(ele);
        
      }
    }
    return c;
  }

  private boolean checkInArray2(int ele, int[] b) {
    for (int j = 0; j < b.length ; j++)
    {
      if (b[j] == ele)
      {
        return true;
      } 
    }
    return false;
   }

}
