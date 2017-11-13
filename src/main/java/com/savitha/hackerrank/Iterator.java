package com.savitha.hackerrank;
import java.util.*;
public class Iterator
{

    public static void main(String []argh)
    {
        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        java.util.Iterator it=mylist.iterator();
        while(it.hasNext())
        {
            Object element = it.next();
            System.out.println((String)element);
        }
    }

    public boolean hasNext() {
      // TODO Auto-generated method stub
      return false;
    }

    public String next() {
      // TODO Auto-generated method stub
      return null;
    }
}
