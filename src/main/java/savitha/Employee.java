package savitha;

public class Employee {
  private String name;
  private String jobTitle;
  private int age;
  private int salary;
  
  public Employee(String name,String jobTitle,int age,int salary)
  {
    this.name=name;
    this.jobTitle=jobTitle;
    this.age=age;
    this.salary=salary;   
  }

  @Override
  public String toString() {
    return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", age=" + age + ", salary=" + salary + "]";
  }
  
  
  
}
