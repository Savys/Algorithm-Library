package com.savitha.datastructure;

public class Singleton1 {


  private static Singleton1 _instance;
  static {
    try { 
      _instance = new Singleton1(10);
   } catch (Exception e) {
      throw new ExceptionInInitializerError(e);
   }
  }
  
  public Singleton1(int age) throws Exception {
    if(age < 18) {
      throw new Exception("Cannot vote");
    }
  }
  
  public static Singleton1 getInstance() {
    return _instance;
  }

}
