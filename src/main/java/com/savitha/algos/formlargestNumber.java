package com.savitha.algos;
/*Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330. (Note: The result may be very large, so you need to return a string instead of an integer.)*/

import java.util.Arrays;
import java.util.Comparator;

public class formlargestNumber {

  public static String largestNumber(int[] nums) {
    String[] arr = new String[nums.length];
    for(int i=0; i<nums.length; i++){
        arr[i]=String.valueOf(nums[i]);
    }
 
    Arrays.sort(arr, new Comparator<String>(){
        public int compare(String a, String b){
            return (b+a).compareTo(a+b);
        }
    });
 
    StringBuilder sb = new StringBuilder();
    for(String s: arr){
        sb.append(s);
    }
 
    while(sb.charAt(0)=='0'&&sb.length()>1)
        sb.deleteCharAt(0);
 
    return sb.toString();
}
  
  public static void main(String[] args) {
    int[] a = { 3, 30, 34, 5, 9 };
    System.out.println(largestNumber(a));
    }
  
  }