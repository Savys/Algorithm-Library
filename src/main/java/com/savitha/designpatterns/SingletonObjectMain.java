package com.savitha.designpatterns;

public class SingletonObjectMain {

  public static void main(String[] args) {
    SingletonObject object = null;
    
    try {
      object = SingletonObject.getInstance();
      object.showMessage();
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      object = SingletonObject.getInstance();
      object.showMessage();
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      object = SingletonObject.getInstance();
      object.showMessage();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
