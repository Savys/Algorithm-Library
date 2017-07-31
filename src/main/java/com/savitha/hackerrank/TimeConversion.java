package com.savitha.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class TimeConversion {

  public static void main(String[] args) {
    
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssa");
   
    Date date;
    try {
      Scanner newScanner=new Scanner(System.in);
      //System.out.print("Please enter a time :");
      String userTime=newScanner.nextLine();
      date= sdf.parse(userTime);
      
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(date);
      SimpleDateFormat sdfnew = new SimpleDateFormat("HH:mm:ss");
      System.out.println(sdfnew.format(calendar.getTime()));
    
    } catch (ParseException e) {
      e.printStackTrace();
    }

          

  }

}

