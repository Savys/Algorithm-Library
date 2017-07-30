package savitha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingEmployeesByMultipleAttributes {

  public static <T> void main(String[] args) {
    // TODO Auto-generated method stub
    List<Employee> emp=new ArrayList<Employee>();
    emp.add(new Employee("Tom","Developer",45,80000));
    emp.add(new Employee("Harry","PM",50,75000));
   emp.add(new Employee("Bob", "Designer", 45, 134000));
   emp.add(new Employee("Peter", "Programmer", 25, 60000));
   emp.add(new Employee("Tim", "Designer", 45, 130000));
   emp.add(new Employee("Craig", "Programmer", 30, 52000));
   emp.add(new Employee("Anne", "Programmer", 25, 51000));
   emp.add(new Employee("Alex", "Designer", 30, 120000));
   emp.add(new Employee("Bill", "Programmer", 22, 30000));
   emp.add(new Employee("Samuel", "Developer", 28, 80000));
   emp.add(new Employee("John", "Developer", 35, 67000));
   emp.add(new Employee("Patrick", "Developer", 35, 140000));
   emp.add(new Employee("Alice", "Programmer", 35, 80000));
   emp.add(new Employee("David", "Developer", 35, 99000));
   emp.add(new Employee("Jane", "Designer", 30, 82000));
  System.out.println("Before Sorting :");
  for(Employee empV: emp){
    
    System.out.println(emp);
  }
  
  Collections.sort((List<T>) emp);
  }

}
