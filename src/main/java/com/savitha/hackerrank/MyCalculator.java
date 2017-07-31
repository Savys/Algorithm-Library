package com.savitha.hackerrank;

public class MyCalculator { 
  public int divisorSum(int num)
  {
    int result=0;int sum=0;
    for (int i=1;i<=num;i++)
    {
      if(num%i ==0 )
      {
         sum=sum+i;
      }
    }    
    return sum;
  }

}
