package com.savitha.threads;


public class PaypalThreadJoin {

  public static void main(String[] args) {
    Thread t1 = new Thread(new MyPaypalRunnable(), "t1");
    Thread t2 = new Thread(new MyPaypalRunnable(), "t2");
    Thread t3 = new Thread(new MyPaypalRunnable(), "t3");

    t2.start();
    t1.start();
    t3.start();

    /*
     * try{ t1.join(2000); }catch(InterruptedException e) { e.printStackTrace();
     * }
     */
  }

}
