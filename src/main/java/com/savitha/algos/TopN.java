package com.savitha.algos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopN {
  
  
  class URLS implements Comparable<URLS>{
    String url;
    Long count;
    
    URLS(String url, Long count) {
      this.url = url;
      this.count = count;
    }

    @Override
    public int compareTo(URLS o) {
      if(o.count > this.count) {
        return 1;
      }else if(o.count == this.count) {
        return 0;
      }else {
        return -1;
      }
    }
  }
  
  Boolean debug = true;
  public static final String lineFeed = "\n";
  Map<String, Long> counterMap = new HashMap<String,Long>();
  List<URLS> urlList = new ArrayList<URLS>();
  
  public void insertToMap(String url) {
    Long urlCount = counterMap.get(url);
    if(urlCount==null) {
      counterMap.put(url, 1L);
    }else {
      counterMap.put(url, urlCount+1);
    }
  }
  
  public void readFile() {
    try {
      File file = new File("/Users/Shared/dataset/wiki/pagehits");
      Long totalBytes = file.length();
      Long readBytes = 0L;
      Long linesRead = 0L;
      BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
      String str;

      while ((str = in.readLine()) != null) {
        readBytes += str.length();
        linesRead++;
        //System.out.println("Progress:"+Math.round(readBytes/totalBytes));
        insertToMap(str);
        
        if(debug) {
          if(linesRead > 1000000L) {
            break;
          }
        }
      }

    }catch (UnsupportedEncodingException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    } 
    catch (IOException e) 
    {
      System.out.println(e.getMessage());
      e.printStackTrace();

    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
      e.printStackTrace();

    }
  }
  
  public void printCounters() {
    for (Map.Entry<String, Long> entry : counterMap.entrySet()) {
      System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
    }
  }
  
  public void GenerateList() throws IOException {
    for (Map.Entry<String, Long> entry : counterMap.entrySet()) {
      urlList.add(new URLS(entry.getKey(),entry.getValue()));
    }

  }
  
  public void SortList() throws IOException {
    Collections.sort(urlList);
  }
  
  public void PrintList(int max) throws IOException {
    for(int i=0;i<urlList.size();i++) {
      URLS url = urlList.get(i);
      System.out.println("URL:"+url.url+",Count:"+url.count);
      if(i>max) {
        return;
      }
    }
  }
  
  public void writeCounters() throws IOException {
    File outputFile = new File("/Users/Shared/dataset/wiki/counterMaps");
    FileOutputStream fop = null;
    fop = new FileOutputStream(outputFile);
    if (!outputFile.exists()) {
      outputFile.createNewFile();
    }
    
    for (Map.Entry<String, Long> entry : counterMap.entrySet()) {
      String line = entry.getKey() + "#"+entry.getValue()+lineFeed;
      fop.write(line.getBytes("UTF-8"));
    }
    fop.flush();
    fop.close();
  }
  
  
  
  
  public static void main(String[] args) throws IOException {
    TopN topN = new TopN();
    long t1 = System.nanoTime();
    topN.readFile();
    long t2 = System.nanoTime();
    System.out.println("Time Taken for HashMap:"+(t2-t1)/100000);
    //topN.printCounters();
    topN.GenerateList();
    long t3 = System.nanoTime();
    System.out.println("Time Taken for Convert HashMap to List:"+(t3-t2)/100000);
    topN.SortList();
    long t4 = System.nanoTime();
    System.out.println("Time Taken for Convert HashMap to Sort:"+(t4-t3)/100000);

    topN.PrintList(10);

  }
}