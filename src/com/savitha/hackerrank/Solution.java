package com.savitha.hackerrank;

public class Solution {
  
  private int FindMax(int array[], int start,int end)
  {

    System.out.println("start:"+start+":,end:"+end);
    int maxValue=array[start];
    for(int i=start;i<=end;i++)
    {
      if (maxValue<array[i])
      {
         maxValue=array[i];
      }
    }
    
    return maxValue;
  }
  
  public int solution(int[] A)  {
    int maxKValue =0;
    int maxKindex =0;
    
    for(int k=0;k<A.length-1;k++) {
      System.out.println("k:="+k);
      int part1 = FindMax(A, 0, k);
      System.out.println(part1);
      int part2 = FindMax(A, k+1, A.length-1);
      System.out.println(part2);
      
      int diff=part1-part2;
      int solution=Math.abs(diff);
      System.out.println("solution:"+solution);
      if(solution >maxKValue) {
        maxKValue = solution;
        maxKindex = k;
      }
    }

    return maxKValue;
  }
  
  public static void main(String[] args) throws Exception {
    int k=3;
   int[] inputArray={4,3,2,5,1,1};
    //int[] inputArray={1,3,-3};
    
    Solution c1 = new Solution();

    System.out.println("Solution :"+c1.solution(inputArray));
  }


}
