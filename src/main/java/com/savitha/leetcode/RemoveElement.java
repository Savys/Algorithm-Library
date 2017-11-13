package com.savitha.leetcode;
/*
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.


 * */

public class RemoveElement {
 public int removeElement4(int[] nums, int val) {
   int i = 0;
   int n = nums.length;
   while (i < n) {
       if (nums[i] == val) {
           nums[i] = nums[n - 1];
           // reduce array size by one
           n--;
       } else {
           i++;
       }
   }
   return n;
}
  public static void main(String[] args) {
    RemoveElement  re=new RemoveElement();
    int[] nums={3,2,5,3,3};//n->5 after deletion n->2
    int x=3;
    int result4=re.removeElement4(nums,x);
    
    System.out.println(result4);
  }

 

}
