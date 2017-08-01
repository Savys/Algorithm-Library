package com.savitha.comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
  @Override
  /*
   * public int compare(Employee o1, Employee o2) { return
   * o2.getName().compareTo(o2.getName()); }
   */
  public int compare(Employee o1, Employee o2) {
    return o1.getJobTitle().compareTo(o2.getJobTitle());

  }
  /*
   * Salary public class EmployeeSalaryComparator implements
   * Comparator<Employee> {
   * 
   * @Override public int compare(Employee emp1, Employee emp2) { return
   * emp1.getSalary() - emp2.getSalary(); }
   */
}