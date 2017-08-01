package com.savitha.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingEmployeesByMultipleAttributes {
  
  
  public static  void main(String[] args) {

    List<Employee> empList=new ArrayList<Employee>();
    
    empList.add(new Employee("Tom","Developer",45,80000));
    empList.add(new Employee("Harry","PM",50,75000));
    empList.add(new Employee("Bob", "Designer", 45, 134000));
    empList.add(new Employee("Peter", "Programmer", 25, 60000));
    empList.add(new Employee("Tim", "Designer", 45, 130000));
    empList.add(new Employee("Craig", "Programmer", 30, 52000));
    empList.add(new Employee("Anne", "Programmer", 25, 51000));
    empList.add(new Employee("Alex", "Designer", 30, 120000));
    empList.add(new Employee("Bill", "Programmer", 22, 30000));
    empList.add(new Employee("Samuel", "Developer", 28, 80000));
    empList.add(new Employee("John", "Developer", 35, 67000));
    empList.add(new Employee("Patrick", "Developer", 35, 140000));
    empList.add(new Employee("Alice", "Programmer", 35, 80000));
    empList.add(new Employee("David", "Developer", 35, 99000));
    empList.add(new Employee("Jane", "Designer", 30, 82000));
    System.out.println("Before Sorting :");
    
    for(Employee empV: empList){
      System.out.println(empV);
    }

    //Collections.sort(empList,new EmployeeComparator());
    Collections.sort(empList,new EmployeeComparator());
    System.out.println("\n*** After sorting:");
   
    for(Employee empV: empList){
      System.out.println(empV);
    }
  }

}
