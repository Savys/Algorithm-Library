package com.savitha.oops.equals;

import java.util.HashMap;
import java.util.Map;

public class Student {

  Integer score;
  String name;
  
  public Student (Integer score, String name) {
    this.score = score;
    this.name = name;
  }
  
  public int hashCode() {
    return this.score;
  }
  
  public boolean equals(Student obj) {
    if(name.equals(obj.name)) {
      return true;
    }else {
      return false;
    }
  }
  
  public static void main(String[] args) {
    
    Map<Student,Integer> students = new HashMap<Student,Integer>();
    
    Student s1 = new Student(4,"S1");
    Student s2 = new Student(4,"S1");

    System.out.println("Is S1 equals S2 ?" + s1.equals(s2));
    
    System.out.println("S1 hashCode:"+ s1.hashCode());
    System.out.println("S2 hashCode:"+ s2.hashCode());
    
    students.put(s1,8);
    students.put(s2,10);
    
    System.out.println(students.size());
  }
}
