package com.savitha.algos;

public class HelloName {
  private static int numInstances = 0;
  
  protected static int getCount() {
    return numInstances;
 }

  public  HelloName(String name)
  {
    System.out.println("Hello, World!");
    HelloName.addInstance(); 
  }
  private static void addInstance() {
    numInstances++;
 }
 /* public static void sayHello() {
    System.out.println("Hello!");
  }*/
  public static void sayHello(String name) {
    System.out.println("Hello, "+name);
  }

  public static void main(String[] args) {
    HelloName IshaObj=new HelloName("Isha");
    IshaObj.sayHello("IshaSriram");
    
    System.out.println("Starting with " + HelloName.getCount() + " instances");
    for (int i = 0; i < 6; ++i){
      new HelloName("Savitha");
 }
    System.out.println("Created " +
        HelloName.getCount() + " instances");

  }

}
