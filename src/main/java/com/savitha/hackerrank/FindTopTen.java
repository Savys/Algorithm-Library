  package com.savitha.hackerrank;
  
  import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
  
  public class FindTopTen {
  
    public int readFileIntoListAndPopulate(String FileName)  {
  
      final String FILE_PATH = "/Users/savitha/Documents/testLink.txt";
  
      List webLinkList = new ArrayList();
      try{
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line=null;
        Map<String, Integer> hm = new HashMap<>();
        while((line = bufferedReader.readLine()) != null) {
         // System.out.println(line);
          if(line.length()>0){
            if(hm.get(line)==null)
            {
              hm.put(line, 1);
            }
            else
            {
              int count = hm.get(line).intValue();
              hm.put(line,count+1);
            }
          }
          
        }   
        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
        
        for (Map.Entry<String, Integer> entry : entrySet) {
          System.out.println(entry.getKey() + "\t\t\t" + entry.getValue());
        }
        List<String>maxOccuranceList=findMaxOccurance(hm,2);
        System.out.println("Top 2 occurance is");
        for (String result:maxOccuranceList)
        {
          System.out.println("+result");
        }
        
        
        bufferedReader.close();  
      }
      catch(FileNotFoundException e)
      {
        e.printStackTrace(); 
      }
      catch(IOException e)
      {
        e.printStackTrace(); 
      }
      finally{
  
      }
      return 1;
  
    }
  
   

    private List<String> findMaxOccurance(Map<String, Integer> hm, int i) {
      
      return null;
    }



    public static void main(String[] args) {
      String FileName = "LinkFile.csv";
  
      FindTopTen t1=new FindTopTen();
      t1.readFileIntoListAndPopulate(FileName);
  
  
  
    }
  
  }
