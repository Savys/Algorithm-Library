package com.sriram.ex1;

import java.util.HashSet;
import java.util.Set;

public class Bike {
 
  private int engineCapacity;
  private String color;
 
  public Bike(int engineCapacity, String color) {
    this.engineCapacity = engineCapacity;
    this.color = color;
  }
 
  public int getEngineCapacity() {
    return engineCapacity;
  }
 
  public void setEngineCapacity(int engineCapacity) {
    this.engineCapacity = engineCapacity;
  }
 
  public String getColor() {
    return color;
  }
 
  public void setColor(String color) {
    this.color = color;
  }
 
  public String toString() {
    return "Bike [engineCapacity=" + engineCapacity + ", color=" + color
        + "]";
  }
 
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    result = prime * result + engineCapacity;
    return result;
  }
 
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Bike other = (Bike) obj;
    if (color == null) {
      if (other.color != null)
        return false;
    } else if (!color.equals(other.color))
      return false;
    if (engineCapacity != other.engineCapacity)
      return false;
    return true;
  }
  
  
  public static void main(String[] args) {
    
    Set<String> strings = new HashSet<String>();
    String name = new String("prasad");
    String anotherName = new String("prasad");
    strings.add(name);
    strings.add(anotherName);
    System.out.println(name.equals(anotherName));
    System.out.println("size of set = " + strings.size());
    System.out.println(strings);
 
    Bike cbr1 = new Bike(150, "red");
    Bike cbr2 = new Bike(150, "red");
    System.out.println(cbr1.equals(cbr2));
    Set<Bike> bikes = new HashSet<Bike>();
    bikes.add(cbr2);
    bikes.add(cbr1);
    System.out.println("size of set = " +  bikes.size());
    System.out.println(bikes);
 
  }
 
}