package com.savitha.hackerrank;
import java.util.*;
public class IteratorExample
{
  static Iterator func(ArrayList mylist)
  {
     Iterator it=(Iterator) mylist.iterator();
     while(it.hasNext())
     {
       Object element =(it.hasNext());
       if(element.equals("###"))
       {
         
       }
       
       /* if(it instanceof Object== false)//Hints: use instanceof operator
           break;*/
     }
     return it;
     
  }

    public static void main(String []argh)
    {
        ArrayList mylist = new ArrayList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i=0;i<=n;i++)
        {
          mylist.add(sc.nextLine());
        }
        mylist.add("###");
        for(int i=0;i<m;i++)
        {
          mylist.add(sc.next());
        }
        //Iterator it=mylist.iterator();
        Iterator it=func(mylist);
        while(it.hasNext())
        {
            Object element = it.hasNext();
            System.out.println((String)element);
        }
    }
}
