package com.savitha.designpatterns;
import java.util.Random;


public class SingletonObject {
  
  private int i= new java.util.Random().nextInt();
  private static SingletonObject _instance;
  
  private SingletonObject(int age) throws Exception{
    if(age < 10) {
      throw new Exception("Error");
    }
    System.out.println("New object Created");
  };
  
  public static SingletonObject getInstance() throws Exception{
    if(_instance==null) {
      synchronized (SingletonObject.class) {
        if(_instance==null) {
          try {
            _instance = new SingletonObject(9);
          }catch(Exception e) {
            throw new Exception(e);
          }
        }
      }
    }
    return _instance;
  }
  
  public void showMessage(){
    System.out.println("Hello SingletonObject!"+i);
  }

}
