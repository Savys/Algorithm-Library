package com.savitha.datastructure;

public class SingletonObjectMain {

  public static void main(String[] args) {
    SingletonObject object = null;
    
    try {
      object = SingletonObject.getInstance();
      object.showMessage();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try {
      object = SingletonObject.getInstance();
      object.showMessage();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try {
      object = SingletonObject.getInstance();
      object.showMessage();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
