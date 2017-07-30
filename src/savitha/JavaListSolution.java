package savitha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaListSolution {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*
     * The first line contains an integer,  (the initial number of elements in ). 
The second line contains  space-separated integers describing L. 
The third line contains an integer,  (the number of queries). 
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .

     * */
/*
    Scanner sc = new Scanner(System.in);
    int numElements = Integer.parseInt(sc.nextLine());
    ArrayList<Integer> numList = new ArrayList<>();
    for(int i = 0;i < numElements;i++){
        numList.add(sc.nextInt());
    }
    int numQueries = sc.nextInt();
    sc.nextLine();
    for(int i = 0;i < numQueries;i++){
      String queryType = sc.nextLine();
      if(queryType.equals("Insert")){
        
      }
      }
  
  }*/
    
    
    
 List<Integer> aList=new ArrayList<>();
 
 for(int i=0;i<=10;i++)
 {
    aList.add(i,i*10); 
 
 
 }
 System.out.println("Elements of the array are :" +aList);

     aList.remove(5);
 
 System.out.println("Elements of the array are :" +aList);
  }
}
