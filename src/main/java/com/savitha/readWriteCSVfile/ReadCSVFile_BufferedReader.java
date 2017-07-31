package com.savitha.readWriteCSVfile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile_BufferedReader {
  private static final String COMMA_DELIMITER = ",";

  private static void createEmp() {
    BufferedReader br = null;
    List<EmployeeWork> empList = new ArrayList<EmployeeWork>();
    try {
      br = new BufferedReader(new FileReader("/Users/savitha/development/workspace-sts-3.6.1.RELEASE/Code2017/src/savitha/Employee.csv"));

      String line = "";
      br.readLine();
      while ((line = br.readLine()) != null) {
        String[] employeeDetails = line.split(COMMA_DELIMITER);
        if (employeeDetails.length > 0) {
          // Save the employee details in Employee object
          EmployeeWork emp = new EmployeeWork(Integer.parseInt(employeeDetails[0]), employeeDetails[1], employeeDetails[2], Integer.parseInt(employeeDetails[3]));
          empList.add(emp);
        }
      }
      for (EmployeeWork ew : empList) {
        System.out.println(ew.getEmpId() + "   " + ew.getFirstName() + "   " + ew.getLastName() + "   " + ew.getSalary());
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
      } catch (IOException ie) {
        System.out.println("Error occured while closing the BufferedReader");
        ie.printStackTrace();
      }
    }
    // return empList;
  }

  public static void main(String args[]) {

    BufferedReader br = null;
    try {

      br = new BufferedReader(new FileReader("/Users/savitha/development/workspace-sts-3.6.1.RELEASE/Code2017/src/savitha/Employee.csv"));
      List<EmployeeWork> empList = new ArrayList<EmployeeWork>();
      String line = ""; // Read to skip the header
      br.readLine();
      while ((line = br.readLine()) != null) {
        String[] employeeDetails = line.split(COMMA_DELIMITER);
        if (employeeDetails.length > 0) { // Save the employee details in Employee object
          EmployeeWork emp = new EmployeeWork(Integer.parseInt(employeeDetails[0]), employeeDetails[1], employeeDetails[2], Integer.parseInt(employeeDetails[3]));
          empList.add(emp);
        }
      }
      for (EmployeeWork ew : empList) {
        System.out.println(ew.getEmpId() + "   " + ew.getFirstName() + "   " + ew.getLastName() + "   " + ew.getSalary());
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
      } catch (IOException ie) {
        System.out.println("Error occured while closing the BufferedReader");
        ie.printStackTrace();
      }
    }

  }

}
