package com.savitha.hackerrank;
/*
 * Two ways - Implementing the Runnable interface or Extending the Thread class
 * http://java2novice.com/java_thread_examples/extending_thread_class/
 * */

public class RunMyThread {

  public static void main(String[] args) {
    MyRunnableThread mrt=new MyRunnableThread();
    Thread t =new Thread(mrt);
    t.start();
    while(MyRunnableThread.myCount <=10)
    try{
      System.out.println("Main Thread: "+(++MyRunnableThread.myCount)); 
      Thread.sleep(100);
    }catch(InterruptedException iex){
      System.out.println("Exception in thread: "+iex.getMessage());
    }
    System.out.println("End of Main Thread...");
  }
  
}
