package com.savitha.algos;

public class Powerof2 {
  int isPowerOfTwo(int n,int exp)
  {
    if (n == 0)
      return 0;
    while (n != 1)
    {
      if (n%exp != 0)
        return 0;
      n = n/exp;
    }
    return 1;
  }
  public static void main(String args[]){
    int input=9;//65
    Powerof2 p2=new Powerof2();
    int result=p2.isPowerOfTwo(input,3);
    if(result ==1)
    {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
    
  }
}
