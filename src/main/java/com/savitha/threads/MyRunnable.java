package com.savitha.threads;

public class MyRunnable implements Runnable{

  @Override
  public void run() {
    
    System.out.println("Thread "+Thread.currentThread().getName());    
    /*
    try{
       //Thread.sleep(4000);
       
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    */
  }
  

}
