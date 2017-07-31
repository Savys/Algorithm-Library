package com.savitha.readWriteCSVfile;
//Read from csv File - works*/
public class EmployeeWork {
  private int empId;
  private String firstName;
  private String lastName;
  private int salary;
  public EmployeeWork(int empId, String firstName, String lastName, int salary) {
    super();
    this.empId = empId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }
  public int getEmpId() {
    return empId;
  }
  public void setEmpId(int empId) {
    this.empId = empId;
  }
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public int getSalary() {
    return salary;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }
  @Override
  public String toString() {
    return "EmployeeWork [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
  }
}
