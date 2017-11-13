/*Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

*/
package com.savitha.algos;

import java.util.Arrays;

public class ProductArray {

  public static void main(String[] args) {
    int input[]={1,2,3,4};
    ProductArray pa=new ProductArray();
    pa.prod(input);
  

  }

  private void prod(int[] input) {
    int product=1;
    int[] output={0,0,0,0};
    for(int i=0;i<input.length;i++)  
    {
      product=product* (input[i]);
     
      
    }
    for(int j=0;j<input.length;j++)  {
      int x=input[j];
      output[j]=product/x;
     }
    System.out.println(Arrays.toString(output));
    
  }

}
