package com.savitha.algos;

public class MyPaypalRunnable implements Runnable{

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
